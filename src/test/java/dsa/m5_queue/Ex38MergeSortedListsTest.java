package dsa.m5_queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Ex38MergeSortedListsTest {

    @Test
    void threeLists() {
        assertEquals(List.of(1, 1, 2, 3, 4, 4, 5, 6),
            Ex38MergeSortedLists.merge(List.of(List.of(1, 4, 5), List.of(1, 3, 4), List.of(2, 6))));
    }

    @Test
    void withEmptyLists() {
        assertEquals(List.of(0), Ex38MergeSortedLists.merge(List.of(List.of(), List.of(0))));
        assertEquals(List.of(), Ex38MergeSortedLists.merge(List.of(List.of(), List.of())));
    }

    @Test
    void noLists() {
        assertEquals(List.of(), Ex38MergeSortedLists.merge(List.of()));
    }

    @Test
    void differentLengthsAndNegatives() {
        assertEquals(List.of(-10, -3, -3, 0, 7, 8, 9, 100),
            Ex38MergeSortedLists.merge(List.of(List.of(-3, 100), List.of(-10, -3, 0, 7, 8, 9))));
    }
}
