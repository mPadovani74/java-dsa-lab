package dsa.m2_set;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class Ex11RemoveDuplicatesTest {

    private static void check(int[] input, int[] expected) {
        int[] original = input.clone();
        int[] actual = Ex11RemoveDuplicates.removeDuplicates(input);
        assertArrayEquals(original, input, "the input array must not be modified");
        int[] e = expected.clone();
        int[] a = actual.clone();
        Arrays.sort(e);
        Arrays.sort(a);
        assertArrayEquals(e, a);
    }

    @Test
    void basic() {
        check(new int[] {1, 2, 2, 3, 1}, new int[] {1, 2, 3});
    }

    @Test
    void allEqual() {
        check(new int[] {7, 7, 7, 7}, new int[] {7});
    }

    @Test
    void noDuplicates() {
        check(new int[] {4, -1, 9}, new int[] {4, -1, 9});
    }

    @Test
    void empty() {
        check(new int[] {}, new int[] {});
    }

    @Test
    void negativesAndLargeValues() {
        check(new int[] {-5, 0, -5, 0, 1000, 1000}, new int[] {-5, 0, 1000});
    }
}
