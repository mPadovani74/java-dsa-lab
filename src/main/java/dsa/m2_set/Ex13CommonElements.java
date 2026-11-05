package dsa.m2_set;

import java.util.Set;

/*
 * Exercise 13 - Elements in common (intersection)     [Module 2 - Set - Easy]
 *
 * PROBLEM
 *   Return a NEW set with the elements present in both a and b.
 *   Do NOT modify a or b.
 *
 * EXAMPLES
 *   {1, 2, 3, 4}, {3, 4, 5, 6} -> {3, 4}
 *   {1, 2}, {3, 4}             -> {}
 *
 * TOOLBOX
 *   new HashSet<>(a)       copy
 *   copy.retainAll(b)      keeps only what is also in b  (MODIFIES copy)
 *   TS (ES2025): a.intersection(b) returns a new set
 *
 * BONUS    Iterate over the SMALLER set. Why does that help?
 *
 * TARGET   Time O(min(n, m))  -  Space O(min(n, m))
 * THEORY   docs/collections/03-hashset.md (set operations)
 * TEST     ./mvnw test -Dtest=Ex13CommonElementsTest
 */
public class Ex13CommonElements {

    public static Set<Integer> common(Set<Integer> a, Set<Integer> b) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
