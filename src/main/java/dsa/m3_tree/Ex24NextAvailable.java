package dsa.m3_tree;

import java.util.Collection;

/*
 * Exercise 24 - Next available number                 [Module 3 - TreeSet - Easy]
 *
 * PROBLEM
 *   Part 1: nextGreater(numbers, value) - the smallest number STRICTLY greater than value,
 *           or null if there is none.
 *   Part 2: closest(numbers, value) - the number closest to value. On a tie, return the
 *           smaller one. null if numbers is empty.
 *
 * EXAMPLES   numbers = [10, 20, 30]
 *   nextGreater(numbers, 15) -> 20       closest(numbers, 14) -> 10
 *   nextGreater(numbers, 20) -> 30       closest(numbers, 16) -> 20
 *   nextGreater(numbers, 30) -> null     closest(numbers, 15) -> 10   (tie -> smaller)
 *
 * TOOLBOX
 *   new TreeSet<>(collection)
 *   higher(x)  smallest >  x            ceiling(x) smallest >= x
 *   lower(x)   largest  <  x            floor(x)   largest  <= x
 *   All return null when there is no such element.
 *
 * THINK    Without a TreeSet you would sort and binary search. With a HashSet you would
 *          scan everything: O(n) per query.
 *
 * TARGET   O(n log n) to build, O(log n) per query
 * THEORY   docs/collections/04-treemap-treeset.md (neighbours of a value)
 * TEST     ./mvnw test -Dtest=Ex24NextAvailableTest
 */
public class Ex24NextAvailable {

    public static Integer nextGreater(Collection<Integer> numbers, int value) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static Integer closest(Collection<Integer> numbers, int value) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
