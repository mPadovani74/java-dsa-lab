package dsa.m2_set;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BinaryOperator;
import org.junit.jupiter.api.Test;

class Ex14SetDifferenceTest {

    private static void check(BinaryOperator<Set<Integer>> op, Set<Integer> a, Set<Integer> b, Set<Integer> expected) {
        Set<Integer> ma = new HashSet<>(a);
        Set<Integer> mb = new HashSet<>(b);
        assertEquals(expected, op.apply(ma, mb));
        assertEquals(a, ma, "set a must not be modified");
        assertEquals(b, mb, "set b must not be modified");
    }

    @Test
    void difference() {
        BinaryOperator<Set<Integer>> d = Ex14SetDifference::difference;
        check(d, Set.of(1, 2, 3, 4), Set.of(3, 4, 5, 6), Set.of(1, 2));
        check(d, Set.of(3, 4, 5, 6), Set.of(1, 2, 3, 4), Set.of(5, 6));
        check(d, Set.of(1, 2), Set.of(3, 4), Set.of(1, 2));
        check(d, Set.of(2, 4), Set.of(1, 2, 3, 4, 5), Set.of());
        check(d, Set.of(1, 2, 3), Set.of(), Set.of(1, 2, 3));
        check(d, Set.of(), Set.of(1, 2, 3), Set.of());
    }

    @Test
    void symmetricDifference() {
        BinaryOperator<Set<Integer>> s = Ex14SetDifference::symmetricDifference;
        check(s, Set.of(1, 2, 3, 4), Set.of(3, 4, 5, 6), Set.of(1, 2, 5, 6));
        check(s, Set.of(3, 4, 5, 6), Set.of(1, 2, 3, 4), Set.of(1, 2, 5, 6));
        check(s, Set.of(1, 2, 3), Set.of(1, 2, 3), Set.of());
        check(s, Set.of(2, 4), Set.of(1, 2, 3, 4, 5), Set.of(1, 3, 5));
        check(s, Set.of(), Set.of(1, 2, 3), Set.of(1, 2, 3));
        check(s, Set.of(), Set.of(), Set.of());
        check(s, Set.of(-1, 0, 1000), Set.of(1000, 7), Set.of(-1, 0, 7));
    }
}
