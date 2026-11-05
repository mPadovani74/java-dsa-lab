package dsa.m1_hashmap;

/*
 * Exercise 09 - Subarrays that sum to K               [Module 1 - HashMap - Medium]
 *
 * PROBLEM
 *   Given an int array (it may contain negatives) and a value k, return HOW MANY
 *   contiguous, non-empty subarrays add up to k.
 *
 * EXAMPLES
 *   [1, 1, 1], k = 2    -> 2      ([1,1] at 0..1 and at 1..2)
 *   [1, 2, 3], k = 3    -> 2      ([1,2] and [3])
 *   [1, -1, 0], k = 0   -> 3
 *   [], k = 0           -> 0
 *
 * TOOLBOX
 *   Map<Integer, Integer>   prefixSum -> how many times it has appeared
 *   map.getOrDefault(k, 0), map.merge(k, 1, Integer::sum)
 *
 * HINT     prefix[j] - prefix[i] = sum of nums[i..j-1].
 *          While walking, if (currentSum - k) appeared before, each occurrence closes a
 *          valid subarray. What must the map contain BEFORE the first element?
 *
 * TARGET   Time O(n)  -  Space O(n)    (brute force is O(n^2))
 * THEORY   docs/collections/02-hashmap.md
 * TEST     ./mvnw test -Dtest=Ex09SubarraySumTest
 */
public class Ex09SubarraySum {

    public static int countSubarrays(int[] nums, int k) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
