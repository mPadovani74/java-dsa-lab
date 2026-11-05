package dsa.m2_set;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class Ex13CommonElementsTest {

    private static void check(Set<Integer> a, Set<Integer> b, Set<Integer> expected) {
        Set<Integer> ma = new HashSet<>(a);
        Set<Integer> mb = new HashSet<>(b);
        assertEquals(expected, Ex13CommonElements.common(ma, mb));
        assertEquals(a, ma, "set a must not be modified");
        assertEquals(b, mb, "set b must not be modified");
    }

    @Test
    void basic() {
        check(Set.of(1, 2, 3, 4), Set.of(3, 4, 5, 6), Set.of(3, 4));
    }

    @Test
    void nothingInCommon() {
        check(Set.of(1, 2), Set.of(3, 4), Set.of());
    }

    @Test
    void subset() {
        check(Set.of(2, 4), Set.of(1, 2, 3, 4, 5), Set.of(2, 4));
        check(Set.of(1, 2, 3, 4, 5), Set.of(2, 4), Set.of(2, 4));
    }

    @Test
    void emptySet() {
        check(Set.of(), Set.of(1, 2, 3), Set.of());
    }

    @Test
    void negativesAndLargeValues() {
        check(Set.of(-1, 0, 1000), Set.of(1000, -1, 7), Set.of(-1, 1000));
    }
}
