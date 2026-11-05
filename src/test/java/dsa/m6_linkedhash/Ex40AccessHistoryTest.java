package dsa.m6_linkedhash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dsa.m6_linkedhash.Ex40AccessHistory.AccessHistory;
import java.util.List;
import org.junit.jupiter.api.Test;

class Ex40AccessHistoryTest {

    @Test
    void firstVisitOrderAndCounts() {
        AccessHistory h = new AccessHistory();
        h.access("/home");
        h.access("/blog");
        h.access("/home");
        h.access("/about");
        h.access("/blog");
        h.access("/home");
        assertEquals(List.of("/home", "/blog", "/about"), h.pagesInFirstVisitOrder());
        assertEquals(3, h.visits("/home"));
        assertEquals(2, h.visits("/blog"));
        assertEquals(1, h.visits("/about"));
        assertEquals(0, h.visits("/contact"));
    }

    @Test
    void orderIsNotAlphabeticalNorHashOrder() {
        AccessHistory h = new AccessHistory();
        for (String p : List.of("z", "m", "a", "q", "b", "y", "c")) {
            h.access(p);
        }
        assertEquals(List.of("z", "m", "a", "q", "b", "y", "c"), h.pagesInFirstVisitOrder());
    }

    @Test
    void empty() {
        assertEquals(List.of(), new AccessHistory().pagesInFirstVisitOrder());
    }
}
