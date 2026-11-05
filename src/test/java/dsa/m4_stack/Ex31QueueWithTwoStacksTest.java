package dsa.m4_stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import dsa.m4_stack.Ex31QueueWithTwoStacks.TwoStackQueue;
import org.junit.jupiter.api.Test;

class Ex31QueueWithTwoStacksTest {

    @Test
    void fifoOrder() {
        TwoStackQueue<Integer> q = new TwoStackQueue<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        assertEquals(1, q.poll());
        q.offer(4);
        assertEquals(2, q.peek());
        assertEquals(2, q.poll());
        assertEquals(3, q.poll());
        assertEquals(4, q.poll());
        assertNull(q.poll());
    }

    @Test
    void sizeAndEmpty() {
        TwoStackQueue<String> q = new TwoStackQueue<>();
        assertTrue(q.isEmpty());
        assertEquals(0, q.size());
        assertNull(q.peek());
        q.offer("a");
        q.offer("b");
        q.poll();
        q.offer("c");
        assertEquals(2, q.size());
        assertFalse(q.isEmpty());
    }

    @Test
    void interleavedOperations() {
        TwoStackQueue<Integer> q = new TwoStackQueue<>();
        int next = 0;
        int expected = 0;
        for (int round = 0; round < 100; round++) {
            for (int i = 0; i < 3; i++) {
                q.offer(next++);
            }
            for (int i = 0; i < 2; i++) {
                assertEquals(expected++, q.poll());
            }
        }
        assertEquals(100, q.size());
    }
}
