package dsa.m4_stack;

/*
 * Exercise 31 - Queue made of two stacks              [Module 4 - Stack - Medium]
 *
 * PROBLEM
 *   Implement a FIFO queue using ONLY two stacks (Deque used strictly with push / pop /
 *   peek / isEmpty / size).
 *   - offer(x)   add at the back
 *   - poll()     remove and return the front, or null if empty
 *   - peek()     return the front without removing it, or null if empty
 *   - size(), isEmpty()
 *
 * EXAMPLE
 *   offer(1); offer(2); offer(3)
 *   poll() -> 1; offer(4); poll() -> 2; poll() -> 3; poll() -> 4; poll() -> null
 *
 * RULE     Only push / pop / peek / isEmpty / size on the two deques. No addLast, pollLast...
 *
 * HINT     One stack receives (inbox), the other delivers (outbox). Move items from inbox
 *          to outbox only when outbox is EMPTY. Why does that keep the order right?
 *
 * TARGET   amortized O(1) per operation  -  Space O(n)
 *          (explain "amortized": each element is moved between stacks at most once)
 * THEORY   docs/collections/05-stack-deque.md, docs/collections/06-queue-priorityqueue.md
 * TEST     ./mvnw test -Dtest=Ex31QueueWithTwoStacksTest
 */
public class Ex31QueueWithTwoStacks {

    public static class TwoStackQueue<T> {

        // TODO: two stacks

        public void offer(T item) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public T poll() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public T peek() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public int size() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public boolean isEmpty() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
