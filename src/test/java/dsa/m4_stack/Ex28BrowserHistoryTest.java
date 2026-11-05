package dsa.m4_stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import dsa.m4_stack.Ex28BrowserHistory.Browser;
import org.junit.jupiter.api.Test;

class Ex28BrowserHistoryTest {

    @Test
    void startsEmpty() {
        Browser b = new Browser();
        assertNull(b.currentPage());
        assertNull(b.back());
    }

    @Test
    void backWithOnePageStays() {
        Browser b = new Browser();
        b.visit("google.com");
        assertEquals("google.com", b.currentPage());
        assertEquals("google.com", b.back());
        assertEquals("google.com", b.currentPage());
    }

    @Test
    void goesBackInOrder() {
        Browser b = new Browser();
        b.visit("google.com");
        b.visit("github.com");
        b.visit("stackoverflow.com");
        assertEquals("stackoverflow.com", b.currentPage());
        assertEquals("github.com", b.back());
        assertEquals("github.com", b.currentPage());
        assertEquals("google.com", b.back());
        assertEquals("google.com", b.back());
    }

    @Test
    void visitAfterGoingBack() {
        Browser b = new Browser();
        b.visit("google.com");
        b.visit("github.com");
        b.back();
        b.visit("youtube.com");
        assertEquals("youtube.com", b.currentPage());
        assertEquals("google.com", b.back());
    }

    @Test
    void instancesAreIndependent() {
        Browser a = new Browser();
        Browser b = new Browser();
        a.visit("a.com");
        b.visit("b.com");
        assertEquals("a.com", a.currentPage());
        assertEquals("b.com", b.currentPage());
    }
}
