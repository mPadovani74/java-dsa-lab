package dsa.m3_tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import dsa.m3_tree.Ex25RunningMedian.MedianTracker;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

class Ex25RunningMedianTest {

    @Test
    void medianAfterEachInsert() {
        MedianTracker m = new MedianTracker();
        m.add(5);
        assertEquals(5.0, m.median());
        m.add(15);
        assertEquals(10.0, m.median());
        m.add(1);
        assertEquals(5.0, m.median());
        m.add(3);
        assertEquals(4.0, m.median());
    }

    @Test
    void evenCountProducesHalf() {
        MedianTracker m = new MedianTracker();
        m.add(1);
        m.add(2);
        assertEquals(1.5, m.median());
    }

    @Test
    void duplicatesAndNegatives() {
        MedianTracker m = new MedianTracker();
        for (int x : new int[] {-1, -1, -1, 4}) {
            m.add(x);
        }
        assertEquals(-1.0, m.median());
    }

    @Test
    void largeValuesDoNotOverflow() {
        MedianTracker m = new MedianTracker();
        m.add(Integer.MAX_VALUE);
        m.add(Integer.MAX_VALUE);
        assertEquals((double) Integer.MAX_VALUE, m.median());
    }

    @Test
    void emptyThrows() {
        assertThrows(NoSuchElementException.class, () -> new MedianTracker().median());
    }
}
