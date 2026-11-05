package dsa.m2_set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import org.junit.jupiter.api.Test;

class Ex17UniqueVisitorsTest {

    @Test
    void countsDistinctVisitors() {
        assertEquals(3, Ex17UniqueVisitors.countUnique(List.of("u1", "u2", "u1", "u3", "u2")));
        assertEquals(3, Ex17UniqueVisitors.countUnique(List.of("a", "b", "c")));
        assertEquals(0, Ex17UniqueVisitors.countUnique(List.of()));
    }

    @Test
    void firstReturningVisitor() {
        assertEquals("u1", Ex17UniqueVisitors.firstReturning(List.of("u1", "u2", "u1", "u3", "u2")));
        assertEquals("y", Ex17UniqueVisitors.firstReturning(List.of("x", "y", "y", "x")));
    }

    @Test
    void nobodyReturned() {
        assertNull(Ex17UniqueVisitors.firstReturning(List.of("a", "b", "c")));
        assertNull(Ex17UniqueVisitors.firstReturning(List.of()));
    }
}
