package dsa.m1_hashmap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class Ex07TwoSumTest {

    // Any valid pair is accepted, so the test checks the property instead of exact indices.
    private static void assertValidPair(int[] nums, int target) {
        int[] result = Ex07TwoSum.twoSum(nums, target);
        assertEquals(2, result.length, "expected two indices");
        assertNotEquals(result[0], result[1], "the two indices must be different");
        assertEquals(target, nums[result[0]] + nums[result[1]]);
    }

    @Test
    void basic() {
        assertValidPair(new int[] {2, 7, 11, 15}, 9);
    }

    @Test
    void cannotUseTheSameIndexTwice() {
        assertValidPair(new int[] {3, 2, 4}, 6);
    }

    @Test
    void sameValueAtTwoIndices() {
        assertValidPair(new int[] {3, 3}, 6);
    }

    @Test
    void negatives() {
        assertValidPair(new int[] {-3, 4, 3, 90}, 0);
    }

    @Test
    void noPair() {
        assertEquals(0, Ex07TwoSum.twoSum(new int[] {1, 2, 3}, 100).length);
        assertEquals(0, Ex07TwoSum.twoSum(new int[] {5}, 10).length);
        assertEquals(0, Ex07TwoSum.twoSum(new int[] {}, 0).length);
    }
}
