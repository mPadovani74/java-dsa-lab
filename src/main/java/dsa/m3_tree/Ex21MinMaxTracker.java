package dsa.m3_tree;

/*
 * Exercise 21 - Min and max tracker                   [Module 3 - TreeMap - Easy]
 *
 * PROBLEM
 *   Build a structure that stores numbers (duplicates allowed) and answers quickly:
 *   - add(n)      adds ONE occurrence of n
 *   - remove(n)   removes ONE occurrence; returns false if n is not stored
 *   - min() / max()   smallest / largest stored number, or null when empty
 *   - size()      how many numbers are stored, COUNTING duplicates. Must be O(1).
 *
 * EXAMPLE
 *   add(10); add(10); add(4)   -> size 3, min 4, max 10
 *   remove(10) -> true          -> max is still 10 (one 10 left)
 *   remove(10) -> true          -> max is now 4
 *   remove(99) -> false
 *
 * TOOLBOX
 *   TreeMap<Integer, Integer>  number -> how many times it is stored  (a "multiset")
 *   merge(n, 1, Integer::sum), firstKey(), lastKey(), isEmpty()
 *   Why not a TreeSet<Integer>? (try add(10) twice and remove(10) once)
 *
 * TARGET   add / remove / min / max O(log n)  -  size O(1)
 * THEORY   docs/collections/04-treemap-treeset.md
 * TEST     ./mvnw test -Dtest=Ex21MinMaxTrackerTest
 */
public class Ex21MinMaxTracker {

    public static class MinMaxTracker {

        // TODO: which fields do you need?

        public void add(int number) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public boolean remove(int number) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public Integer min() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public Integer max() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public int size() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
