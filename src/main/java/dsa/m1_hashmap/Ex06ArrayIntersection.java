package dsa.m1_hashmap;

/*
 * Exercise 06 - Intersection of two arrays            [Module 1 - HashMap - Easy]
 *
 * PROBLEM
 *   Given two int arrays, return the values that appear in both.
 *   Each common value appears ONCE in the result. Order does not matter.
 *
 * EXAMPLES
 *   [1, 2, 3, 4], [3, 4, 5] -> [3, 4]
 *   [1, 2, 2, 1], [2, 2]    -> [2]
 *   [1, 2], [3, 4]          -> []
 *
 * TOOLBOX
 *   map.put / map.containsKey / map.remove
 *   new ArrayList<Integer>() to collect, then convert:
 *   list.stream().mapToInt(Integer::intValue).toArray()   -> int[]
 *
 * VARIATION  (try after the tests pass) Return each value as many times as it appears
 *            in BOTH arrays: [1, 2, 2, 1], [2, 2] -> [2, 2]. What changes in the map?
 *
 * TARGET   Time O(n + m)  -  Space O(n)
 * THEORY   docs/collections/02-hashmap.md
 * TEST     ./mvnw test -Dtest=Ex06ArrayIntersectionTest
 */
public class Ex06ArrayIntersection {

    public static int[] intersection(int[] a, int[] b) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
