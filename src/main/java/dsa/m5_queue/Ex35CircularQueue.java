package dsa.m5_queue;

/*
 * Exercise 35 - Circular queue                        [Module 5 - Queue internals - Medium]
 *
 * PROBLEM
 *   Implement a FIFO queue of ints with FIXED capacity, backed by a plain int[].
 *   - offer(x)    add at the back; return false if full
 *   - poll()      remove and return the front, or null if empty
 *   - peek()      front without removing, or null if empty
 *   - size(), isEmpty(), isFull()
 *
 * RULE     No java.util collections. Only an int[] and some int fields.
 *          Never shift elements: when the back reaches the end of the array, it wraps
 *          around to index 0. This is exactly what ArrayDeque does inside.
 *
 * EXAMPLE   capacity 3
 *   offer(1) offer(2) offer(3) -> true x3;  offer(4) -> false
 *   poll() -> 1;  offer(4) -> true   (it goes into the slot that 1 left)
 *   poll() -> 2, 3, 4;  poll() -> null
 *
 * TOOLBOX
 *   int[] data; int head; int size;
 *   next index = (index + 1) % capacity          the % makes it "circular"
 *   tail index = (head + size) % capacity
 *
 * TARGET   every operation O(1)  -  Space O(capacity)
 * THEORY   docs/collections/05-stack-deque.md ("how it works inside")
 * TEST     ./mvnw test -Dtest=Ex35CircularQueueTest
 */
public class Ex35CircularQueue {

    public static class CircularQueue {

        // TODO: which fields do you need?

        public CircularQueue(int capacity) {
            // TODO
        }

        public boolean offer(int value) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public Integer poll() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public Integer peek() {
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

        public boolean isFull() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
