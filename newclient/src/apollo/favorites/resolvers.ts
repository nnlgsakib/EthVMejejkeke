import { InMemoryCache } from 'apollo-cache-inmemory'
import { favAddressCache } from './rootQuery.graphql'
import { TypeName, DataArray } from './models'
import store from 'store'
import { favAddressCache as cachedAdrsType, favAddressCache_favAddresses as AddrType } from './apolloTypes/favAddressCache'

enum Actions {
    add = 'addItem',
    edit = 'editItem',
    delete = 'deleteItem'
}
export const resolvers = {
    Query: {
        /**
         * Checks whether or not an address is already in the favorite store, by address hash
         * @param address: string, new address hash
         * @param cache: InMemoryCache, apollo cache object
         * @return - returns cachedAdrsType data type or null if !data.favAddresses
         */
        checkAddress: (root, { address }, { cache }) => {
            return hasAddress(address, cache)
        }
    },
    Mutation: {
        /**
         * Adds a new address to the cache if address does not exhists. Checks if the address already exhists and returns it.
         * @param address: string, new address hash
         * @param name: string, new address name if any
         * @param cache: InMemoryCache, apollo cache object
         * @return - returns cachedAdrsType data type or null if !data.favAddresses
         */
        addFavAddress: (root, { address, name }, { cache }) => {
            const adr = hasAddress(address, cache)
            if (adr === null) {
                const newAdr: AddrType = {
                    __typename: TypeName.addr,
                    address: address,
                    name: name || ''
                }
                return changeFavAddressArray(Actions.add, cache, newAdr)
            }
            return adr
        }
    }
}

/*
  ===================================================================================
   Functions:
  ===================================================================================
*/

/**
 * Returns and Array of stored Address or null if !data.favAddresses
 * @param cache: InMemoryCache, apollo cache object
 * @return - returns cachedAdrsType data type or null if !data.favAddresses
 */
function getCachedAddrs(cache: InMemoryCache): cachedAdrsType | null {
    return cache.readQuery({ query: favAddressCache })
}

/**
 * Returns AddrType object with specified address hash  if it exhists in cache, otherwise null
 * @param address: string, address hash string to search for
 * @param cache: InMemoryCache, apollo cache object
 * @return - returns AddrType or  null if not found
 */
function hasAddress(address: string, cache: InMemoryCache): AddrType | null {
    const data = getCachedAddrs(cache)
    if (data && data.favAddresses && data.favAddresses.length > 0) {
        const items = data.favAddresses.filter(item => item.address.toLowerCase() === address.toLowerCase())
        return items.length > 0 ? items[0] : null
    }
    return null
}

/**
 * Function updates apollo cache, as we as,local storage in the application,
 * according to the specified action: add, edit (name only), deletes - specifed item.
 * To edit an address name, use item param to specify new object name.
 * @param action: Actions; add, edit (name only), delete
 * @param cache: InMemoryCache, apollo cache object
 * @param item: AddrType;
 *    - add: will add new item to the cache
 *    - edit: will search for an object with item.address and edit the object with item.name
 *    - delete: will search for an object with item.address and delete this object
 * @return - returns AddrType - item
 */

function changeFavAddressArray(action: Actions, cache: InMemoryCache, item: AddrType): AddrType {
    const storeAdrs = store.get(DataArray.addr) || []
    let data = getCachedAddrs(cache)

    if (data === null) {
        /* Update Apollo Cache */
        data = {
            favAddresses: action === Actions.delete ? [] : [item]
        }
        cache.writeData({
            data: data
        })
    }
    /* Add New Item*/
    if (action === Actions.add) {
        storeAdrs.push({ address: item.address, name: item.name })
        data.favAddresses.push(item)
    }

    /* Update Store and Apollo Cache */
    store.set(DataArray.addr, storeAdrs)
    cache.writeQuery({ query: favAddressCache, data })
    return item
}
