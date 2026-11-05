package dsa.m6_linkedhash;

import java.util.List;

/*
 * Exercise 41 - Remove duplicates, keep the order     [Module 6 - LinkedHashSet - Easy]
 *
 * PROBLEM
 *   Return a new list without duplicates, keeping the position of each element's
 *   FIRST occurrence. Works for any type. Do not modify the input.
 *
 * EXAMPLES
 *   ["b", "a", "b", "c", "a"] -> ["b", "a", "c"]
 *   [3, 1, 3, 3, 2, 1]        -> [3, 1, 2]
 *   []                        -> []
 *
 * TOOLBOX
 *   new LinkedHashSet<>(collection)     unique + insertion order
 *   new ArrayList<>(set)
 *   Generic method:  public static <T> List<T> dedupe(List<T> items)
 *                    TS: function dedupe<T>(items: T[]): T[]
 *
 * THINK    Compare with Ex11 (HashSet). Why did the order not matter there and does here?
 *          How would you do it with a HashSet + ArrayList instead?
 *
 * TARGET   Time O(n)  -  Space O(n)
 * THEORY   docs/collections/07-linkedhashmap.md (LinkedHashSet)
 * TEST     ./mvnw test -Dtest=Ex41DedupePreservingOrderTest
 */
public class Ex41DedupePreservingOrder {

    public static <T> List<T> dedupe(List<T> items) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
