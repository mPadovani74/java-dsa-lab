package dsa.m1_hashmap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Ex09SubarraySumTest {

    @Test
    void overlappingSubarrays() {
        assertEquals(2, Ex09SubarraySum.countSubarrays(new int[] {1, 1, 1}, 2));
    }

    @Test
    void differentLengths() {
        assertEquals(2, Ex09SubarraySum.countSubarrays(new int[] {1, 2, 3}, 3));
    }

    @Test
    void withNegativesAndZero() {
        assertEquals(3, Ex09SubarraySum.countSubarrays(new int[] {1, -1, 0}, 0));
        assertEquals(4, Ex09SubarraySum.countSubarrays(new int[] {3, 4, 7, 2, -3, 1, 4, 2}, 7));
    }

    @Test
    void none() {
        assertEquals(0, Ex09SubarraySum.countSubarrays(new int[] {1, 2, 3}, 100));
        assertEquals(0, Ex09SubarraySum.countSubarrays(new int[] {}, 0));
    }

    @Test
    void wholeArray() {
        assertEquals(1, Ex09SubarraySum.countSubarrays(new int[] {5, 5, 5}, 15));
    }
}
