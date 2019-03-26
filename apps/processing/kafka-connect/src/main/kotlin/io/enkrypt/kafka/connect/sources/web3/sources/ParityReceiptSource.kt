package io.enkrypt.kafka.connect.sources.web3.sources

import io.enkrypt.avro.capture.CanonicalKeyRecord
import io.enkrypt.avro.capture.TransactionReceiptListRecord
import io.enkrypt.avro.capture.TransactionReceiptRecord
import io.enkrypt.common.extensions.setNumberBI
import io.enkrypt.kafka.connect.utils.AvroToConnect
import io.enkrypt.kafka.connect.sources.web3.JsonRpc2_0ParityExtended
import io.enkrypt.kafka.connect.sources.web3.toTransactionReceiptRecord
import org.apache.kafka.connect.source.SourceRecord
import org.apache.kafka.connect.source.SourceTaskContext
import org.web3j.protocol.core.DefaultBlockParameter

class ParityReceiptSource(
  sourceContext: SourceTaskContext,
  parity: JsonRpc2_0ParityExtended,
  private val receiptsTopic: String
) : ParityEntitySource(sourceContext, parity) {

  override val partitionKey: Map<String, Any> = mapOf("model" to "receipt")

  override fun fetchRange(range: ClosedRange<Long>): List<SourceRecord> {

    // force into long for iteration

    val longRange = LongRange(range.start, range.endInclusive)

    return longRange
      .map { blockNumber ->

        val blockNumberBI = blockNumber.toBigInteger()
        val blockParam = DefaultBlockParameter.valueOf(blockNumberBI)

        val partitionOffset = mapOf("blockNumber" to blockNumber)

        parity.parityGetBlockReceipts(blockParam).sendAsync()
          .thenApply { resp ->

            val receipts = resp.receipts ?: emptyList()

            val receiptKeyRecord = CanonicalKeyRecord
              .newBuilder()
              .setNumberBI(blockNumberBI)
              .build()

            val receiptRecord = TransactionReceiptListRecord
              .newBuilder()
              .setReceipts(receipts.map { it.toTransactionReceiptRecord(TransactionReceiptRecord.newBuilder()).build() })
              .build()

            val receiptKeySchemaAndValue = AvroToConnect.toConnectData(receiptKeyRecord)
            val receiptValueSchemaAndValue = AvroToConnect.toConnectData(receiptRecord)

            SourceRecord(
              partitionKey, partitionOffset, receiptsTopic,
              receiptKeySchemaAndValue.schema(), receiptKeySchemaAndValue.value(),
              receiptValueSchemaAndValue.schema(), receiptValueSchemaAndValue.value()
            )
          }
      }.map { future ->
        // wait for everything to complete
        future.join()
      }
  }
}
