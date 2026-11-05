package dsa.m1_hashmap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dsa.m1_hashmap.Ex10LruCache.LruCache;
import org.junit.jupiter.api.Test;

class Ex10LruCacheTest {

    @Test
    void classicSequence() {
        LruCache c = new LruCache(2);
        c.put(1, 1);
        c.put(2, 2);
        assertEquals(1, c.get(1));
        c.put(3, 3);               // evicts 2
        assertEquals(-1, c.get(2));
        c.put(4, 4);               // evicts 1
        assertEquals(-1, c.get(1));
        assertEquals(3, c.get(3));
        assertEquals(4, c.get(4));
    }

    @Test
    void updatingAKeyCountsAsUse() {
        LruCache c = new LruCache(2);
        c.put(1, 1);
        c.put(2, 2);
        c.put(1, 10);              // 1 is now the most recent
        c.put(3, 3);               // evicts 2
        assertEquals(10, c.get(1));
        assertEquals(-1, c.get(2));
        assertEquals(3, c.get(3));
    }

    @Test
    void capacityOne() {
        LruCache c = new LruCache(1);
        c.put(1, 1);
        c.put(2, 2);
        assertEquals(-1, c.get(1));
        assertEquals(2, c.get(2));
    }

    @Test
    void missOnEmptyCache() {
        assertEquals(-1, new LruCache(3).get(42));
    }

    @Test
    void manyOperations() {
        LruCache c = new LruCache(3);
        for (int i = 0; i < 1000; i++) {
            c.put(i, i * 10);
        }
        assertEquals(-1, c.get(996));
        assertEquals(9970, c.get(997));
        assertEquals(9990, c.get(999));
    }
}
