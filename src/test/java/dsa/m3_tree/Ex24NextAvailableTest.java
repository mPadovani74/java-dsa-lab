package dsa.m3_tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import org.junit.jupiter.api.Test;

class Ex24NextAvailableTest {

    private final List<Integer> numbers = List.of(30, 10, 20);

    @Test
    void nextGreater() {
        assertEquals(20, Ex24NextAvailable.nextGreater(numbers, 15));
        assertEquals(30, Ex24NextAvailable.nextGreater(numbers, 20));
        assertEquals(10, Ex24NextAvailable.nextGreater(numbers, -100));
        assertNull(Ex24NextAvailable.nextGreater(numbers, 30));
        assertNull(Ex24NextAvailable.nextGreater(List.of(), 0));
    }

    @Test
    void closest() {
        assertEquals(10, Ex24NextAvailable.closest(numbers, 14));
        assertEquals(20, Ex24NextAvailable.closest(numbers, 16));
        assertEquals(20, Ex24NextAvailable.closest(numbers, 20));
        assertEquals(10, Ex24NextAvailable.closest(numbers, -50));
        assertEquals(30, Ex24NextAvailable.closest(numbers, 1000));
    }

    @Test
    void closestTieReturnsSmaller() {
        assertEquals(10, Ex24NextAvailable.closest(numbers, 15));
        assertEquals(20, Ex24NextAvailable.closest(numbers, 25));
    }

    @Test
    void closestOnEmpty() {
        assertNull(Ex24NextAvailable.closest(List.of(), 5));
    }

    @Test
    void duplicatesInInput() {
        assertEquals(7, Ex24NextAvailable.nextGreater(List.of(5, 5, 7, 7), 5));
    }
}
