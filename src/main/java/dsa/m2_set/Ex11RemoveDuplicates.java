package dsa.m2_set;

/*
 * Exercise 11 - Remove duplicates                     [Module 2 - Set - Easy]
 *
 * PROBLEM
 *   Given an int array, return a new array with each value only once.
 *   Order does not matter. Do NOT modify the input array.
 *
 * EXAMPLES
 *   [1, 2, 2, 3, 1] -> [1, 2, 3]
 *   [7, 7, 7]       -> [7]
 *   []              -> []
 *
 * TOOLBOX                                     TypeScript equivalent
 *   new HashSet<Integer>()                    new Set<number>()
 *   set.add(x)        false if already there  set.add(x)  (returns the set)
 *   set.stream().mapToInt(Integer::intValue).toArray()   -> int[]
 *
 * TARGET   Time O(n)  -  Space O(n)
 * THEORY   docs/collections/03-hashset.md
 * TEST     ./mvnw test -Dtest=Ex11RemoveDuplicatesTest
 */
public class Ex11RemoveDuplicates {

    public static int[] removeDuplicates(int[] nums) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
