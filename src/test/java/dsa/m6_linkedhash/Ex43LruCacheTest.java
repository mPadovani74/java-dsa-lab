package dsa.m6_linkedhash;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import dsa.m6_linkedhash.Ex43LruCache.LruCache;
import java.util.List;
import org.junit.jupiter.api.Test;

class Ex43LruCacheTest {

    @Test
    void getMovesKeyToMostRecent() {
        LruCache<String, Integer> c = new LruCache<>(2);
        c.put("a", 1);
        c.put("b", 2);
        assertEquals(1, c.get("a"));
        assertEquals(List.of("b", "a"), c.keys());
        c.put("c", 3);
        assertNull(c.get("b"));
        assertEquals(List.of("a", "c"), c.keys());
    }

    @Test
    void putOnExistingKeyCountsAsUse() {
        LruCache<String, Integer> c = new LruCache<>(2);
        c.put("a", 1);
        c.put("b", 2);
        c.put("a", 10);
        c.put("c", 3);
        assertEquals(List.of("a", "c"), c.keys());
        assertEquals(10, c.get("a"));
    }

    @Test
    void missIsNotAUse() {
        LruCache<String, Integer> c = new LruCache<>(2);
        c.put("a", 1);
        assertNull(c.get("zzz"));
        assertEquals(List.of("a"), c.keys());
    }

    @Test
    void sameBehaviourAsEx10() {
        LruCache<Integer, Integer> c = new LruCache<>(2);
        c.put(1, 1);
        c.put(2, 2);
        c.get(1);
        c.put(3, 3);
        assertNull(c.get(2));
        c.put(4, 4);
        assertNull(c.get(1));
        assertEquals(3, c.get(3));
        assertEquals(4, c.get(4));
    }
}
