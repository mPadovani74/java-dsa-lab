package dsa.m5_queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Ex37TopKElementsTest {

    @Test
    void basic() {
        assertEquals(List.of(12, 11, 5), Ex37TopKElements.topK(new int[] {3, 1, 5, 12, 2, 11}, 3));
    }

    @Test
    void duplicatesCountSeparately() {
        assertEquals(List.of(5, 5), Ex37TopKElements.topK(new int[] {5, 5, 1}, 2));
    }

    @Test
    void kBiggerThanArray() {
        assertEquals(List.of(2, 1), Ex37TopKElements.topK(new int[] {1, 2}, 5));
    }

    @Test
    void kZeroOrEmpty() {
        assertEquals(List.of(), Ex37TopKElements.topK(new int[] {1, 2, 3}, 0));
        assertEquals(List.of(), Ex37TopKElements.topK(new int[] {}, 3));
    }

    @Test
    void negatives() {
        assertEquals(List.of(-1, -2), Ex37TopKElements.topK(new int[] {-5, -1, -3, -2}, 2));
    }
}
