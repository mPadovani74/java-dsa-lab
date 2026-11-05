package dsa.m5_queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import dsa.m5_queue.Ex35CircularQueue.CircularQueue;
import org.junit.jupiter.api.Test;

class Ex35CircularQueueTest {

    @Test
    void fillAndWrapAround() {
        CircularQueue q = new CircularQueue(3);
        assertTrue(q.offer(1));
        assertTrue(q.offer(2));
        assertTrue(q.offer(3));
        assertTrue(q.isFull());
        assertFalse(q.offer(4));
        assertEquals(1, q.poll());
        assertTrue(q.offer(4));
        assertEquals(2, q.poll());
        assertEquals(3, q.poll());
        assertEquals(4, q.peek());
        assertEquals(4, q.poll());
        assertNull(q.poll());
        assertTrue(q.isEmpty());
    }

    @Test
    void emptyQueue() {
        CircularQueue q = new CircularQueue(2);
        assertTrue(q.isEmpty());
        assertFalse(q.isFull());
        assertEquals(0, q.size());
        assertNull(q.peek());
        assertNull(q.poll());
    }

    @Test
    void manyWrapArounds() {
        CircularQueue q = new CircularQueue(4);
        int next = 0;
        int expected = 0;
        for (int round = 0; round < 1000; round++) {
            while (!q.isFull()) {
                q.offer(next++);
            }
            assertEquals(expected++, q.poll());
            assertEquals(expected++, q.poll());
            assertEquals(2, q.size());
        }
    }

    @Test
    void negativeValuesAreStored() {
        CircularQueue q = new CircularQueue(2);
        q.offer(-1);
        q.offer(0);
        assertEquals(-1, q.poll());
        assertEquals(0, q.poll());
    }
}
