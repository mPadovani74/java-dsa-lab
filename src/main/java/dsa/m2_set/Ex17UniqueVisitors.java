package dsa.m2_set;

import java.util.List;

/*
 * Exercise 17 - Unique visitors                       [Module 2 - Set - Easy]
 *
 * PROBLEM
 *   You receive the access log of a website as a list of visitor IDs, in order.
 *   Part 1: how many DIFFERENT visitors accessed the site?
 *   Part 2: which visitor was the first one to come back (the first ID that appears
 *           for the second time while reading the log)? null if nobody came back.
 *
 * EXAMPLES
 *   ["u1", "u2", "u1", "u3", "u2"]
 *     countUnique         -> 3
 *     firstReturning      -> "u1"
 *   ["a", "b", "c"]  -> 3, null
 *   ["x", "y", "y", "x"]  -> 2, "y"     (y comes back before x does)
 *
 * TOOLBOX
 *   new HashSet<>(list)    copy every element, duplicates disappear
 *   set.add(x) returns false when x was already there
 *
 * TARGET   Time O(n)  -  Space O(n)
 * THEORY   docs/collections/03-hashset.md
 * TEST     ./mvnw test -Dtest=Ex17UniqueVisitorsTest
 */
public class Ex17UniqueVisitors {

    public static int countUnique(List<String> visitorIds) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static String firstReturning(List<String> visitorIds) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
