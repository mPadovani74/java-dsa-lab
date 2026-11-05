package dsa.m7_integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import dsa.m7_integration.Ex46TaskManager.TaskManager;
import java.util.List;
import org.junit.jupiter.api.Test;

class Ex46TaskManagerTest {

    private static TaskManager sample() {
        TaskManager t = new TaskManager();
        t.add("deploy", 5);
        t.add("email", 1);
        t.add("review", 5);
        t.add("tests", 3);
        return t;
    }

    @Test
    void nextByPriorityThenInsertion() {
        TaskManager t = sample();
        assertEquals(List.of("deploy", "review", "tests"), t.next(3));
        assertEquals(4, t.size(), "next must not remove anything");
    }

    @Test
    void complete() {
        TaskManager t = sample();
        assertTrue(t.complete("deploy"));
        assertEquals(List.of("review", "tests"), t.next(2));
        assertFalse(t.complete("deploy"));
        assertFalse(t.complete("nope"));
        assertEquals(3, t.size());
    }

    @Test
    void nMoreThanSize() {
        assertEquals(List.of("deploy", "review", "tests", "email"), sample().next(10));
        assertEquals(List.of(), new TaskManager().next(3));
    }

    @Test
    void samePriorityDifferentNamesAreAllKept() {
        TaskManager t = new TaskManager();
        t.add("b", 1);
        t.add("a", 1);
        t.add("c", 1);
        assertEquals(List.of("b", "a", "c"), t.next(3));
    }

    @Test
    void duplicateNameThrows() {
        TaskManager t = sample();
        assertThrows(IllegalArgumentException.class, () -> t.add("email", 9));
    }

    @Test
    void nameCanBeReusedAfterCompleting() {
        TaskManager t = sample();
        t.complete("email");
        t.add("email", 9);
        assertEquals(List.of("email"), t.next(1));
    }
}
