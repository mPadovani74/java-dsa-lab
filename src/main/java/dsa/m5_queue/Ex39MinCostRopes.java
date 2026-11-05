package dsa.m5_queue;

/*
 * Exercise 39 - Minimum cost to connect ropes         [Module 5 - PriorityQueue - Medium]
 *
 * PROBLEM
 *   You have cables of several lengths. Joining two cables of lengths a and b costs
 *   a + b and produces one cable of length a + b. Join everything into a single cable
 *   with the minimum total cost.
 *
 * EXAMPLES
 *   [4, 3, 2, 6] -> 29      (2+3=5, 4+5=9, 6+9=15; 5+9+15 = 29)
 *   [1, 2, 3]    -> 9
 *   [5]          -> 0       (nothing to join)
 *   []           -> 0
 *
 * TOOLBOX
 *   PriorityQueue<Long> - offer, poll, size
 *   long, not int: the total can be large.
 *
 * HINT     Greedy: always join the TWO SMALLEST cables. Why is it bad to join a big
 *          cable early? (Its length gets added again in every later join.)
 *          This is the same idea behind Huffman coding.
 *
 * TARGET   Time O(n log n)  -  Space O(n)
 * THEORY   docs/collections/06-queue-priorityqueue.md
 * TEST     ./mvnw test -Dtest=Ex39MinCostRopesTest
 */
public class Ex39MinCostRopes {

    public static long minCost(int[] ropes) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
