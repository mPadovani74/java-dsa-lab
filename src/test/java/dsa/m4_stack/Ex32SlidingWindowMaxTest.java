package dsa.m4_stack;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;
import org.junit.jupiter.api.Test;

class Ex32SlidingWindowMaxTest {

    @Test
    void classic() {
        assertArrayEquals(new int[] {3, 3, 5, 5, 6, 7},
            Ex32SlidingWindowMax.maxSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3));
    }

    @Test
    void windowOfOne() {
        assertArrayEquals(new int[] {4, 2}, Ex32SlidingWindowMax.maxSlidingWindow(new int[] {4, 2}, 1));
    }

    @Test
    void windowIsWholeArray() {
        assertArrayEquals(new int[] {9}, Ex32SlidingWindowMax.maxSlidingWindow(new int[] {9, 8, 7}, 3));
    }

    @Test
    void maximumLeavesTheWindow() {
        assertArrayEquals(new int[] {9, 8, 7}, Ex32SlidingWindowMax.maxSlidingWindow(new int[] {9, 8, 7, 6}, 2));
    }

    @Test
    void duplicates() {
        assertArrayEquals(new int[] {5, 5, 5}, Ex32SlidingWindowMax.maxSlidingWindow(new int[] {5, 5, 5, 5}, 2));
    }

    @Test
    void largeInputIsFast() {
        int n = 200_000;
        int k = 50_000;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = n - i;
        }
        int[] result = assertTimeoutPreemptively(Duration.ofSeconds(2),
            () -> Ex32SlidingWindowMax.maxSlidingWindow(nums, k));
        assertEquals(n - k + 1, result.length);
        assertEquals(n, result[0]);
    }
}
