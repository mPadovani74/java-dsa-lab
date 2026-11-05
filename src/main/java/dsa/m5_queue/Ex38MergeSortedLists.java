package dsa.m5_queue;

import java.util.List;

/*
 * Exercise 38 - Merge k sorted lists                  [Module 5 - PriorityQueue - Hard]
 *
 * PROBLEM
 *   You receive several lists, each sorted in ascending order. Return ONE list with all
 *   values, also in ascending order. Some lists may be empty.
 *
 * EXAMPLES
 *   [[1, 4, 5], [1, 3, 4], [2, 6]] -> [1, 1, 2, 3, 4, 4, 5, 6]
 *   [[], [0]]                      -> [0]
 *   []                             -> []
 *
 * RULE     Do not concatenate everything and sort. Use the fact that each list is sorted.
 *
 * TOOLBOX
 *   record Cursor(int value, int listIndex, int position) {}
 *   PriorityQueue<Cursor> pq = new PriorityQueue<>(Comparator.comparingInt(Cursor::value));
 *   Start with the first element of each list. Each poll gives the global minimum; then
 *   offer the NEXT element of the same list.
 *
 * TARGET   Time O(N log k), N = total values, k = number of lists  -  Space O(k)
 * THEORY   docs/collections/06-queue-priorityqueue.md
 * TEST     ./mvnw test -Dtest=Ex38MergeSortedListsTest
 */
public class Ex38MergeSortedLists {

    public static List<Integer> merge(List<List<Integer>> lists) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
