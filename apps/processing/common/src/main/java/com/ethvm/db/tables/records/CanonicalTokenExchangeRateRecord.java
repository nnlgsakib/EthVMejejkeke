/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables.records;


import com.ethvm.db.tables.CanonicalTokenExchangeRate;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CanonicalTokenExchangeRateRecord extends TableRecordImpl<CanonicalTokenExchangeRateRecord> implements Record17<String, String, String, String, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Long> {

    private static final long serialVersionUID = 1694160474;

    /**
     * Setter for <code>public.canonical_token_exchange_rate.address</code>.
     */
    public CanonicalTokenExchangeRateRecord setAddress(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.address</code>.
     */
    public String getAddress() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.symbol</code>.
     */
    public CanonicalTokenExchangeRateRecord setSymbol(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.symbol</code>.
     */
    public String getSymbol() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.name</code>.
     */
    public CanonicalTokenExchangeRateRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.image</code>.
     */
    public CanonicalTokenExchangeRateRecord setImage(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.image</code>.
     */
    public String getImage() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.current_price</code>.
     */
    public CanonicalTokenExchangeRateRecord setCurrentPrice(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.current_price</code>.
     */
    public BigDecimal getCurrentPrice() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.market_cap</code>.
     */
    public CanonicalTokenExchangeRateRecord setMarketCap(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.market_cap</code>.
     */
    public BigDecimal getMarketCap() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.market_cap_rank</code>.
     */
    public CanonicalTokenExchangeRateRecord setMarketCapRank(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.market_cap_rank</code>.
     */
    public Integer getMarketCapRank() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.total_volume</code>.
     */
    public CanonicalTokenExchangeRateRecord setTotalVolume(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.total_volume</code>.
     */
    public BigDecimal getTotalVolume() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.high24h</code>.
     */
    public CanonicalTokenExchangeRateRecord setHigh24h(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.high24h</code>.
     */
    public BigDecimal getHigh24h() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.low24h</code>.
     */
    public CanonicalTokenExchangeRateRecord setLow24h(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.low24h</code>.
     */
    public BigDecimal getLow24h() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.price_change24h</code>.
     */
    public CanonicalTokenExchangeRateRecord setPriceChange24h(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.price_change24h</code>.
     */
    public BigDecimal getPriceChange24h() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.price_change_percentage24h</code>.
     */
    public CanonicalTokenExchangeRateRecord setPriceChangePercentage24h(BigDecimal value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.price_change_percentage24h</code>.
     */
    public BigDecimal getPriceChangePercentage24h() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.market_cap_change24h</code>.
     */
    public CanonicalTokenExchangeRateRecord setMarketCapChange24h(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.market_cap_change24h</code>.
     */
    public BigDecimal getMarketCapChange24h() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.market_cap_change_percentage24h</code>.
     */
    public CanonicalTokenExchangeRateRecord setMarketCapChangePercentage24h(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.market_cap_change_percentage24h</code>.
     */
    public BigDecimal getMarketCapChangePercentage24h() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.circulating_supply</code>.
     */
    public CanonicalTokenExchangeRateRecord setCirculatingSupply(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.circulating_supply</code>.
     */
    public BigDecimal getCirculatingSupply() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.total_supply</code>.
     */
    public CanonicalTokenExchangeRateRecord setTotalSupply(BigDecimal value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.total_supply</code>.
     */
    public BigDecimal getTotalSupply() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>public.canonical_token_exchange_rate.last_updated</code>.
     */
    public CanonicalTokenExchangeRateRecord setLastUpdated(Long value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>public.canonical_token_exchange_rate.last_updated</code>.
     */
    public Long getLastUpdated() {
        return (Long) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, String, String, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Long> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, String, String, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Long> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.SYMBOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.IMAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.CURRENT_PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.MARKET_CAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.MARKET_CAP_RANK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.TOTAL_VOLUME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.HIGH24H;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.LOW24H;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.PRICE_CHANGE24H;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field12() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.PRICE_CHANGE_PERCENTAGE24H;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field13() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.MARKET_CAP_CHANGE24H;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field14() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.MARKET_CAP_CHANGE_PERCENTAGE24H;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field15() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.CIRCULATING_SUPPLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field16() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.TOTAL_SUPPLY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field17() {
        return CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE.LAST_UPDATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSymbol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getCurrentPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getMarketCap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getMarketCapRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getTotalVolume();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getHigh24h();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getLow24h();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getPriceChange24h();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component12() {
        return getPriceChangePercentage24h();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component13() {
        return getMarketCapChange24h();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component14() {
        return getMarketCapChangePercentage24h();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component15() {
        return getCirculatingSupply();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component16() {
        return getTotalSupply();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component17() {
        return getLastUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSymbol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getImage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getCurrentPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getMarketCap();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getMarketCapRank();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getTotalVolume();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getHigh24h();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getLow24h();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getPriceChange24h();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value12() {
        return getPriceChangePercentage24h();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value13() {
        return getMarketCapChange24h();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value14() {
        return getMarketCapChangePercentage24h();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value15() {
        return getCirculatingSupply();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value16() {
        return getTotalSupply();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value17() {
        return getLastUpdated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value1(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value2(String value) {
        setSymbol(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value4(String value) {
        setImage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value5(BigDecimal value) {
        setCurrentPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value6(BigDecimal value) {
        setMarketCap(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value7(Integer value) {
        setMarketCapRank(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value8(BigDecimal value) {
        setTotalVolume(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value9(BigDecimal value) {
        setHigh24h(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value10(BigDecimal value) {
        setLow24h(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value11(BigDecimal value) {
        setPriceChange24h(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value12(BigDecimal value) {
        setPriceChangePercentage24h(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value13(BigDecimal value) {
        setMarketCapChange24h(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value14(BigDecimal value) {
        setMarketCapChangePercentage24h(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value15(BigDecimal value) {
        setCirculatingSupply(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value16(BigDecimal value) {
        setTotalSupply(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord value17(Long value) {
        setLastUpdated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CanonicalTokenExchangeRateRecord values(String value1, String value2, String value3, String value4, BigDecimal value5, BigDecimal value6, Integer value7, BigDecimal value8, BigDecimal value9, BigDecimal value10, BigDecimal value11, BigDecimal value12, BigDecimal value13, BigDecimal value14, BigDecimal value15, BigDecimal value16, Long value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CanonicalTokenExchangeRateRecord
     */
    public CanonicalTokenExchangeRateRecord() {
        super(CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE);
    }

    /**
     * Create a detached, initialised CanonicalTokenExchangeRateRecord
     */
    public CanonicalTokenExchangeRateRecord(String address, String symbol, String name, String image, BigDecimal currentPrice, BigDecimal marketCap, Integer marketCapRank, BigDecimal totalVolume, BigDecimal high24h, BigDecimal low24h, BigDecimal priceChange24h, BigDecimal priceChangePercentage24h, BigDecimal marketCapChange24h, BigDecimal marketCapChangePercentage24h, BigDecimal circulatingSupply, BigDecimal totalSupply, Long lastUpdated) {
        super(CanonicalTokenExchangeRate.CANONICAL_TOKEN_EXCHANGE_RATE);

        set(0, address);
        set(1, symbol);
        set(2, name);
        set(3, image);
        set(4, currentPrice);
        set(5, marketCap);
        set(6, marketCapRank);
        set(7, totalVolume);
        set(8, high24h);
        set(9, low24h);
        set(10, priceChange24h);
        set(11, priceChangePercentage24h);
        set(12, marketCapChange24h);
        set(13, marketCapChangePercentage24h);
        set(14, circulatingSupply);
        set(15, totalSupply);
        set(16, lastUpdated);
    }
}
