package dsa.m1_hashmap;

/*
 * Exercise 10 - LRU cache, by hand                    [Module 1 - HashMap - Hard]
 *
 * PROBLEM
 *   Implement a cache with a fixed capacity. When it is full and a NEW key is
 *   inserted, evict the Least Recently Used key.
 *   - get(key): value, or -1 if absent. Counts as a "use".
 *   - put(key, value): insert or update. Counts as a "use".
 *   Both operations must be O(1).
 *
 * RULE     Do NOT use LinkedHashMap here (that is exercise 43). Build it yourself with a
 *          HashMap + your own doubly linked list. This is how LinkedHashMap works inside.
 *
 * EXAMPLE  capacity 2
 *   put(1, 1); put(2, 2); get(1) -> 1      order (old -> new): 2, 1
 *   put(3, 3)                              evicts 2
 *   get(2) -> -1; put(4, 4)                evicts 1
 *   get(1) -> -1; get(3) -> 3; get(4) -> 4
 *
 * TOOLBOX
 *   private static class Node { int key, value; Node prev, next; }
 *   Map<Integer, Node>     key -> node, so you can find the node in O(1)
 *   Sentinel head/tail nodes avoid many null checks.
 *   TS: class Node { key: number; value: number; prev: Node | null; next: Node | null }
 *
 * TARGET   get / put O(1)  -  Space O(capacity)
 * THEORY   docs/collections/02-hashmap.md, docs/collections/07-linkedhashmap.md
 * TEST     ./mvnw test -Dtest=Ex10LruCacheTest
 */
public class Ex10LruCache {

    public static class LruCache {

        // TODO: which fields do you need?

        public LruCache(int capacity) {
            // TODO
        }

        public int get(int key) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public void put(int key, int value) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
