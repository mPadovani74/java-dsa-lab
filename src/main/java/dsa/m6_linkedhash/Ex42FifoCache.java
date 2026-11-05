package dsa.m6_linkedhash;

import java.util.List;

/*
 * Exercise 42 - Cache with insertion-order eviction   [Module 6 - LinkedHashMap - Medium]
 *
 * PROBLEM
 *   A cache with fixed capacity. When a NEW key is inserted and the cache is full, the
 *   OLDEST inserted key is removed (FIFO eviction).
 *   - put(k, v)   insert or update. Updating an existing key keeps its original position.
 *   - get(k)      value or null. Reading does NOT change any order.
 *   - size()
 *   - keys()      keys from oldest to newest
 *
 * EXAMPLE   capacity 2
 *   put("a", 1); put("b", 2); get("a")        -> 1
 *   put("c", 3)                               -> evicts "a" (oldest), even though it was read
 *   keys() -> ["b", "c"]
 *   put("b", 20)                              -> update, no eviction; keys() -> ["b", "c"]
 *
 * TOOLBOX
 *   Option A: LinkedHashMap + check size before inserting; remove the first key:
 *             map.keySet().iterator().next()    or   map.pollFirstEntry() (Java 21+)
 *   Option B: subclass LinkedHashMap and override
 *             protected boolean removeEldestEntry(Map.Entry<K, V> eldest)
 *             (called automatically after every put)
 *
 * TARGET   put / get O(1)
 * THEORY   docs/collections/07-linkedhashmap.md (removeEldestEntry)
 * TEST     ./mvnw test -Dtest=Ex42FifoCacheTest
 */
public class Ex42FifoCache {

    public static class FifoCache<K, V> {

        // TODO: which fields do you need?

        public FifoCache(int capacity) {
            // TODO
        }

        public void put(K key, V value) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public V get(K key) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public int size() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public List<K> keys() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
