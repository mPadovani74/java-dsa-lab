package dsa.m5_queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import dsa.m5_queue.Ex36PriorityService.PriorityService;
import org.junit.jupiter.api.Test;

class Ex36PriorityServiceTest {

    @Test
    void highestPriorityFirstThenArrivalOrder() {
        PriorityService s = new PriorityService();
        s.arrive("Ana", 1);
        s.arrive("Bia", 5);
        s.arrive("Caio", 5);
        s.arrive("Duda", 3);
        assertEquals(4, s.waiting());
        assertEquals("Bia", s.serveNext());
        assertEquals("Caio", s.serveNext());
        assertEquals("Duda", s.serveNext());
        assertEquals("Ana", s.serveNext());
        assertNull(s.serveNext());
    }

    @Test
    void manyEqualPrioritiesKeepArrivalOrder() {
        PriorityService s = new PriorityService();
        for (int i = 0; i < 50; i++) {
            s.arrive("p" + i, 1);
        }
        for (int i = 0; i < 50; i++) {
            assertEquals("p" + i, s.serveNext());
        }
    }

    @Test
    void arrivalsInBetween() {
        PriorityService s = new PriorityService();
        s.arrive("low", 1);
        s.arrive("mid", 2);
        assertEquals("mid", s.serveNext());
        s.arrive("urgent", 9);
        assertEquals("urgent", s.serveNext());
        assertEquals("low", s.serveNext());
        assertEquals(0, s.waiting());
    }
}
