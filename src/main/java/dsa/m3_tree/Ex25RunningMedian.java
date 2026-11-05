package dsa.m3_tree;

/*
 * Exercise 25 - Running median                        [Module 3 - Sorted structures - Hard]
 *
 * PROBLEM
 *   Numbers arrive one at a time (duplicates allowed). At any moment you must be able to
 *   answer the median of everything received so far.
 *   - Odd count:  the middle value.
 *   - Even count: the average of the two middle values.
 *   - median() with nothing added throws java.util.NoSuchElementException.
 *
 * EXAMPLE
 *   add(5)  -> median 5.0
 *   add(15) -> median 10.0
 *   add(1)  -> median 5.0
 *   add(3)  -> median 4.0     (1, 3, 5, 15)
 *
 * TOOLBOX - two classic approaches
 *   A) Two heaps (module 5 preview):
 *      PriorityQueue<Integer> low  = new PriorityQueue<>(Comparator.reverseOrder()); // max-heap
 *      PriorityQueue<Integer> high = new PriorityQueue<>();                          // min-heap
 *      Keep low.size() == high.size() or low.size() == high.size() + 1.
 *   B) Two TreeMap multisets (like Ex21), balanced the same way.
 *
 * PITFALL  (a + b) / 2 with int truncates. You need a double result.
 *          a + b can overflow for large ints - (long) a + b avoids it.
 *
 * TARGET   add O(log n)  -  median O(1)
 * THEORY   docs/collections/04-treemap-treeset.md, docs/collections/06-queue-priorityqueue.md
 * TEST     ./mvnw test -Dtest=Ex25RunningMedianTest
 */
public class Ex25RunningMedian {

    public static class MedianTracker {

        // TODO: which fields do you need?

        public void add(int number) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public double median() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
