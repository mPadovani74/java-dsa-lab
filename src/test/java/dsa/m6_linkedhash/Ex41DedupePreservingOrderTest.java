package dsa.m6_linkedhash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class Ex41DedupePreservingOrderTest {

    @Test
    void strings() {
        assertEquals(List.of("b", "a", "c"), Ex41DedupePreservingOrder.dedupe(List.of("b", "a", "b", "c", "a")));
    }

    @Test
    void integers() {
        assertEquals(List.of(3, 1, 2), Ex41DedupePreservingOrder.dedupe(List.of(3, 1, 3, 3, 2, 1)));
    }

    @Test
    void empty() {
        assertEquals(List.of(), Ex41DedupePreservingOrder.dedupe(List.of()));
    }

    @Test
    void doesNotModifyInput() {
        List<String> input = new ArrayList<>(List.of("x", "x", "y"));
        Ex41DedupePreservingOrder.dedupe(input);
        assertEquals(List.of("x", "x", "y"), input);
    }
}
