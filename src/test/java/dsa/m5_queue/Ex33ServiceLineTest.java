package dsa.m5_queue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import dsa.m5_queue.Ex33ServiceLine.ServiceLine;
import org.junit.jupiter.api.Test;

class Ex33ServiceLineTest {

    @Test
    void firstInFirstOut() {
        ServiceLine line = new ServiceLine();
        line.arrive("Ana");
        line.arrive("Bia");
        line.arrive("Caio");
        assertEquals(3, line.waiting());
        assertEquals("Ana", line.nextInLine());
        assertEquals("Ana", line.serveNext());
        assertEquals("Bia", line.serveNext());
        assertEquals(1, line.waiting());
        line.arrive("Duda");
        assertEquals("Caio", line.serveNext());
        assertEquals("Duda", line.serveNext());
    }

    @Test
    void emptyLine() {
        ServiceLine line = new ServiceLine();
        assertNull(line.serveNext());
        assertNull(line.nextInLine());
        assertEquals(0, line.waiting());
    }

    @Test
    void peekDoesNotRemove() {
        ServiceLine line = new ServiceLine();
        line.arrive("Ana");
        line.nextInLine();
        line.nextInLine();
        assertEquals(1, line.waiting());
    }
}
