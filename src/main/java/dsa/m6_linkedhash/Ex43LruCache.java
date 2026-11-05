package dsa.m6_linkedhash;

import java.util.List;

/*
 * Exercise 43 - LRU cache with LinkedHashMap          [Module 6 - LinkedHashMap - Medium]
 *
 * PROBLEM
 *   Same idea as Ex10, now using the standard library. When full, evict the key that
 *   was USED least recently. Both get and put count as a use.
 *   - get(k)   value or null (a miss is not a use)
 *   - put(k, v)
 *   - keys()   from least recently used to most recently used
 *
 * EXAMPLE   capacity 2
 *   put("a", 1); put("b", 2); get("a")    keys() -> ["b", "a"]
 *   put("c", 3)                           evicts "b"; keys() -> ["a", "c"]
 *
 * TOOLBOX
 *   new LinkedHashMap<>(16, 0.75f, true)
 *                                   ^^^^ accessOrder = true: get/put move the key to the end
 *   removeEldestEntry(eldest) -> return size() > capacity;
 *   Anonymous subclass:
 *     map = new LinkedHashMap<>(16, 0.75f, true) {
 *         @Override protected boolean removeEldestEntry(Map.Entry<K, V> eldest) { ... }
 *     };
 *
 * THINK    Compare with your Ex10. How much code did the library save? What does it do inside?
 *
 * TARGET   get / put O(1)
 * THEORY   docs/collections/07-linkedhashmap.md (access order)
 * TEST     ./mvnw test -Dtest=Ex43LruCacheTest
 */
public class Ex43LruCache {

    public static class LruCache<K, V> {

        // TODO: which fields do you need?

        public LruCache(int capacity) {
            // TODO
        }

        public V get(K key) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public void put(K key, V value) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public List<K> keys() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
