package dsa.m1_hashmap;

/*
 * Exercise 07 - Two Sum                               [Module 1 - HashMap - Easy]
 *
 * PROBLEM
 *   Given an int array and a target, return the indices of two DIFFERENT positions
 *   whose values add up to the target. Return an empty array if there is no pair.
 *   If several pairs exist, any of them is accepted.
 *
 * EXAMPLES
 *   [2, 7, 11, 15], 9 -> [0, 1]
 *   [3, 2, 4], 6      -> [1, 2]      (not [0, 0]: same index twice is not allowed)
 *   [3, 3], 6         -> [0, 1]
 *   [1, 2, 3], 100    -> []
 *
 * TOOLBOX
 *   Map<Integer, Integer>   value -> index where it was seen
 *   map.containsKey(k), map.get(k), map.put(k, v)
 *
 * HINT     For each number x, the partner you need is (target - x).
 *          Have you already seen it? Do it in ONE pass.
 *
 * TARGET   Time O(n)  -  Space O(n)    (the brute force with two loops is O(n^2))
 * THEORY   docs/collections/02-hashmap.md
 * TEST     ./mvnw test -Dtest=Ex07TwoSumTest
 */
public class Ex07TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
