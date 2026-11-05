package dsa.m5_queue;

import java.util.List;

/*
 * Exercise 37 - K largest elements                    [Module 5 - PriorityQueue - Medium]
 *
 * PROBLEM
 *   Return the k largest values of the array, from largest to smallest.
 *   Duplicates count as separate values. If k >= nums.length, return all of them sorted
 *   descending. If k <= 0, return an empty list.
 *
 * EXAMPLES
 *   [3, 1, 5, 12, 2, 11], k = 3 -> [12, 11, 5]
 *   [5, 5, 1], k = 2            -> [5, 5]
 *   [1, 2], k = 5               -> [2, 1]
 *
 * TOOLBOX
 *   PriorityQueue<Integer> minHeap = new PriorityQueue<>();   smallest on top
 *   offer, poll, peek, size
 *   Collections.reverse(list) / list.sort(Comparator.reverseOrder())
 *
 * HINT     Keep a MIN-heap with at most k elements. When it grows beyond k, remove the
 *          smallest. What remains are the k largest. Why a min-heap and not a max-heap?
 *
 * TARGET   Time O(n log k)  -  Space O(k)     (sorting everything is O(n log n))
 * THEORY   docs/collections/06-queue-priorityqueue.md
 * TEST     ./mvnw test -Dtest=Ex37TopKElementsTest
 */
public class Ex37TopKElements {

    public static List<Integer> topK(int[] nums, int k) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
