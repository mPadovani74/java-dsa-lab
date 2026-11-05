package dsa.m4_stack;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;
import org.junit.jupiter.api.Test;

class Ex30NextGreaterElementTest {

    @Test
    void mixed() {
        assertArrayEquals(new int[] {4, 2, 4, -1, -1}, Ex30NextGreaterElement.nextGreater(new int[] {2, 1, 2, 4, 3}));
    }

    @Test
    void decreasing() {
        assertArrayEquals(new int[] {-1, -1, -1}, Ex30NextGreaterElement.nextGreater(new int[] {5, 4, 3}));
    }

    @Test
    void increasing() {
        assertArrayEquals(new int[] {2, 3, -1}, Ex30NextGreaterElement.nextGreater(new int[] {1, 2, 3}));
    }

    @Test
    void equalValuesAreNotGreater() {
        assertArrayEquals(new int[] {-1, -1}, Ex30NextGreaterElement.nextGreater(new int[] {7, 7}));
    }

    @Test
    void empty() {
        assertArrayEquals(new int[] {}, Ex30NextGreaterElement.nextGreater(new int[] {}));
    }

    @Test
    void largeInputIsFast() {
        int n = 200_000;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = n - i;   // strictly decreasing: worst case for the naive O(n^2)
        }
        assertTimeoutPreemptively(Duration.ofSeconds(2), () -> Ex30NextGreaterElement.nextGreater(nums));
    }
}
