package dsa.m2_set;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Ex12ContainsDuplicateTest {

    private static void check(int[] input, boolean expected) {
        int[] original = input.clone();
        assertEquals(expected, Ex12ContainsDuplicate.hasDuplicate(input));
        assertArrayEquals(original, input, "the input array must not be modified");
    }

    @Test
    void withDuplicate() {
        check(new int[] {1, 2, 3, 1}, true);
        check(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true);
        check(new int[] {-1, 1000, -1}, true);
    }

    @Test
    void withoutDuplicate() {
        check(new int[] {1, 2, 3, 4}, false);
        check(new int[] {-1, 1, 0, 1000, -1000}, false);
    }

    @Test
    void emptyAndSingle() {
        check(new int[] {}, false);
        check(new int[] {5}, false);
    }
}
