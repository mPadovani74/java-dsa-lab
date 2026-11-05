package dsa.m4_stack;

/*
 * Exercise 30 - Next greater element                  [Module 4 - Monotonic stack - Medium]
 *
 * PROBLEM
 *   For each element, find the first element to its RIGHT that is strictly greater.
 *   Return an array of the same size with that value, or -1 when there is none.
 *
 * EXAMPLES
 *   [2, 1, 2, 4, 3]  -> [4, 2, 4, -1, -1]
 *   [5, 4, 3]        -> [-1, -1, -1]
 *   [1, 2, 3]        -> [2, 3, -1]
 *   []               -> []
 *
 * TOOLBOX
 *   Deque<Integer> stack - store INDICES, not values (you need to know where to write)
 *   Arrays.fill(result, -1)
 *
 * HINT     Walk left to right. The stack holds indices still "waiting" for a greater value.
 *          When the current value is greater than the value at the top, the top has found
 *          its answer - pop it and record. Repeat while it holds. Then push the current index.
 *          The values in the stack are always decreasing: a MONOTONIC stack.
 *
 * TARGET   Time O(n) (each index is pushed and popped at most once)  -  Space O(n)
 * THEORY   docs/collections/05-stack-deque.md
 * TEST     ./mvnw test -Dtest=Ex30NextGreaterElementTest
 */
public class Ex30NextGreaterElement {

    public static int[] nextGreater(int[] nums) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
