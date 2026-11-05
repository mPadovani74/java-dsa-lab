package dsa.m3_tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import dsa.m3_tree.Ex21MinMaxTracker.MinMaxTracker;
import org.junit.jupiter.api.Test;

class Ex21MinMaxTrackerTest {

    @Test
    void basic() {
        MinMaxTracker t = new MinMaxTracker();
        t.add(5);
        t.add(-3);
        t.add(12);
        t.add(7);
        assertEquals(-3, t.min());
        assertEquals(12, t.max());
        assertEquals(4, t.size());
        assertTrue(t.remove(12));
        assertEquals(7, t.max());
        assertEquals(3, t.size());
    }

    @Test
    void duplicates() {
        MinMaxTracker t = new MinMaxTracker();
        t.add(10);
        t.add(10);
        t.add(4);
        assertEquals(3, t.size());
        assertTrue(t.remove(10));
        assertEquals(10, t.max());
        assertTrue(t.remove(10));
        assertEquals(4, t.max());
        assertEquals(4, t.min());
        assertEquals(1, t.size());
    }

    @Test
    void emptyAndMissing() {
        MinMaxTracker t = new MinMaxTracker();
        assertNull(t.min());
        assertNull(t.max());
        assertFalse(t.remove(99));
        t.add(8);
        assertTrue(t.remove(8));
        assertNull(t.min());
        assertEquals(0, t.size());
    }

    @Test
    void allEqualNegatives() {
        MinMaxTracker t = new MinMaxTracker();
        t.add(-1);
        t.add(-1);
        t.add(-1);
        assertEquals(-1, t.min());
        assertEquals(-1, t.max());
        assertFalse(t.remove(2));
        assertEquals(3, t.size());
    }
}
