package dsa.m2_set;

import java.util.Set;

/*
 * Exercise 14 - Set difference                        [Module 2 - Set - Easy]
 *
 * PROBLEM
 *   Part 1: difference(a, b) - elements in a that are NOT in b.
 *   Part 2: symmetricDifference(a, b) - elements that are in exactly ONE of the sets.
 *   Return new sets. Do NOT modify a or b.
 *
 * EXAMPLES
 *   difference({1, 2, 3, 4}, {3, 4, 5, 6})          -> {1, 2}
 *   difference({3, 4, 5, 6}, {1, 2, 3, 4})          -> {5, 6}    (order of arguments matters)
 *   symmetricDifference({1, 2, 3, 4}, {3, 4, 5, 6}) -> {1, 2, 5, 6}
 *
 * TOOLBOX
 *   new HashSet<>(a), addAll (union), retainAll (intersection), removeAll (difference)
 *   All three MODIFY the set they are called on - always work on a copy.
 *
 * CHALLENGE  Solve each part twice: once with a for loop, once only with API calls.
 *
 * TARGET   Time O(n + m)  -  Space O(n + m)
 * THEORY   docs/collections/03-hashset.md (set operations)
 * TEST     ./mvnw test -Dtest=Ex14SetDifferenceTest
 */
public class Ex14SetDifference {

    public static Set<Integer> difference(Set<Integer> a, Set<Integer> b) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static Set<Integer> symmetricDifference(Set<Integer> a, Set<Integer> b) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
