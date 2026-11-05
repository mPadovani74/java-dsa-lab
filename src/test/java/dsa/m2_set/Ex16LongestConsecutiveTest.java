package dsa.m2_set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;
import org.junit.jupiter.api.Test;

class Ex16LongestConsecutiveTest {

    @Test
    void basic() {
        assertEquals(4, Ex16LongestConsecutive.longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
        assertEquals(9, Ex16LongestConsecutive.longestConsecutive(new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }

    @Test
    void duplicatesCountOnce() {
        assertEquals(3, Ex16LongestConsecutive.longestConsecutive(new int[] {1, 2, 0, 1}));
    }

    @Test
    void emptyAndSingle() {
        assertEquals(0, Ex16LongestConsecutive.longestConsecutive(new int[] {}));
        assertEquals(1, Ex16LongestConsecutive.longestConsecutive(new int[] {42}));
    }

    @Test
    void negatives() {
        assertEquals(5, Ex16LongestConsecutive.longestConsecutive(new int[] {-2, 1, -1, 0, 2, 10}));
    }

    @Test
    void largeInputIsFast() {
        int n = 200_000;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = n - i;   // n, n-1, ..., 1
        }
        assertTimeoutPreemptively(Duration.ofSeconds(2),
            () -> assertEquals(n, Ex16LongestConsecutive.longestConsecutive(nums)));
    }
}
