package dsa.m6_linkedhash;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import dsa.m6_linkedhash.Ex42FifoCache.FifoCache;
import java.util.List;
import org.junit.jupiter.api.Test;

class Ex42FifoCacheTest {

    @Test
    void evictsOldestInsertedEvenIfRead() {
        FifoCache<String, Integer> c = new FifoCache<>(2);
        c.put("a", 1);
        c.put("b", 2);
        assertEquals(1, c.get("a"));
        c.put("c", 3);
        assertNull(c.get("a"));
        assertEquals(List.of("b", "c"), c.keys());
        assertEquals(2, c.size());
    }

    @Test
    void updateKeepsPositionAndDoesNotEvict() {
        FifoCache<String, Integer> c = new FifoCache<>(2);
        c.put("a", 1);
        c.put("b", 2);
        c.put("a", 10);
        assertEquals(List.of("a", "b"), c.keys());
        assertEquals(10, c.get("a"));
        c.put("c", 3);   // "a" is still the oldest insertion
        assertEquals(List.of("b", "c"), c.keys());
    }

    @Test
    void missingKey() {
        assertNull(new FifoCache<String, Integer>(1).get("x"));
    }
}
