package dsa.m1_hashmap;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Ex06ArrayIntersectionTest {

    // Order does not matter, so both sides are sorted before comparing.
    private static void assertSameValues(int[] expected, int[] actual) {
        int[] e = expected.clone();
        int[] a = actual.clone();
        Arrays.sort(e);
        Arrays.sort(a);
        assertArrayEquals(e, a);
    }

    @Test
    void basic() {
        assertSameValues(new int[] {3, 4}, Ex06ArrayIntersection.intersection(new int[] {1, 2, 3, 4}, new int[] {3, 4, 5}));
    }

    @Test
    void eachCommonValueOnce() {
        assertSameValues(new int[] {2}, Ex06ArrayIntersection.intersection(new int[] {1, 2, 2, 1}, new int[] {2, 2}));
        assertSameValues(new int[] {7}, Ex06ArrayIntersection.intersection(new int[] {7, 7, 7}, new int[] {7}));
    }

    @Test
    void nothingInCommon() {
        assertSameValues(new int[] {}, Ex06ArrayIntersection.intersection(new int[] {1, 2}, new int[] {3, 4}));
    }

    @Test
    void emptyArray() {
        assertSameValues(new int[] {}, Ex06ArrayIntersection.intersection(new int[] {}, new int[] {1, 2}));
    }

    @Test
    void negativesAndZero() {
        assertSameValues(new int[] {-1, 5}, Ex06ArrayIntersection.intersection(new int[] {-1, 0, 5}, new int[] {5, -1, 7}));
    }
}
