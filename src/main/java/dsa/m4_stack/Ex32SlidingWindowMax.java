package dsa.m4_stack;

/*
 * Exercise 32 - Sliding window maximum                [Module 4 - Monotonic deque - Hard]
 *
 * PROBLEM
 *   Given an array and a window size k (1 <= k <= nums.length), slide the window from
 *   left to right one position at a time and return the maximum of each window.
 *   The result has nums.length - k + 1 values.
 *
 * EXAMPLES
 *   [1, 3, -1, -3, 5, 3, 6, 7], k = 3  -> [3, 3, 5, 5, 6, 7]
 *   [4, 2], k = 1                      -> [4, 2]
 *   [9, 8, 7], k = 3                   -> [9]
 *
 * TOOLBOX - Deque used at BOTH ends
 *   Deque<Integer> dq = new ArrayDeque<>();   store INDICES
 *   peekFirst() / pollFirst()   front: the index of the current maximum
 *   peekLast()  / pollLast()    back: where smaller values get thrown away
 *   offerLast(i)
 *
 * HINT     Keep indices whose values are DECREASING from front to back.
 *          Before adding i, drop from the back every index with value <= nums[i]
 *          (they can never be a maximum again). Drop from the front the index that left
 *          the window (front < i - k + 1).
 *
 * TARGET   Time O(n)  -  Space O(k)     (the naive solution is O(n * k))
 * THEORY   docs/collections/05-stack-deque.md (all Deque methods)
 * TEST     ./mvnw test -Dtest=Ex32SlidingWindowMaxTest
 */
public class Ex32SlidingWindowMax {

    public static int[] maxSlidingWindow(int[] nums, int k) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
