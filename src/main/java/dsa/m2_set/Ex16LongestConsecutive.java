package dsa.m2_set;

/*
 * Exercise 16 - Longest consecutive sequence          [Module 2 - Set - Medium]
 *
 * PROBLEM
 *   Given an unsorted int array, return the length of the longest run of consecutive
 *   values (x, x+1, x+2, ...). The values do not need to be adjacent in the array.
 *   Duplicates count once.
 *
 * EXAMPLES
 *   [100, 4, 200, 1, 3, 2]          -> 4     (1, 2, 3, 4)
 *   [0, 3, 7, 2, 5, 8, 4, 6, 0, 1]  -> 9
 *   [1, 2, 0, 1]                    -> 3
 *   []                              -> 0
 *
 * RULE     Must be O(n). Sorting is O(n log n), so it is not the answer here.
 *
 * TOOLBOX
 *   Set<Integer> with all values, set.contains(x)
 *
 * HINT     A number x only STARTS a sequence if (x - 1) is not in the set.
 *          Only count forward from the starts. Why does that keep the total work O(n)?
 *
 * TARGET   Time O(n)  -  Space O(n)
 * THEORY   docs/collections/03-hashset.md
 * TEST     ./mvnw test -Dtest=Ex16LongestConsecutiveTest
 */
public class Ex16LongestConsecutive {

    public static int longestConsecutive(int[] nums) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
