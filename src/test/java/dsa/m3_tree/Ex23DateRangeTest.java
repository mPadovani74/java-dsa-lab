package dsa.m3_tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dsa.m3_tree.Ex23DateRange.Records;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Ex23DateRangeTest {

    private Records r;

    private static LocalDate d(int y, int m, int day) {
        return LocalDate.of(y, m, day);
    }

    @BeforeEach
    void setUp() {
        r = new Records();
        r.add(d(2026, 1, 15), "Purchase B");
        r.add(d(2026, 2, 1), "Purchase D");
        r.add(d(2026, 1, 10), "Purchase A");
        r.add(d(2025, 12, 31), "Purchase E");
        r.add(d(2026, 1, 15), "Purchase C");
    }

    @Test
    void wholeMonth() {
        assertEquals(List.of("Purchase A", "Purchase B", "Purchase C"), r.between(d(2026, 1, 1), d(2026, 1, 31)));
    }

    @Test
    void bothEndsIncluded() {
        assertEquals(List.of("Purchase B", "Purchase C", "Purchase D"), r.between(d(2026, 1, 15), d(2026, 2, 1)));
    }

    @Test
    void singleDay() {
        assertEquals(List.of("Purchase E"), r.between(d(2025, 12, 31), d(2025, 12, 31)));
    }

    @Test
    void nothingInRange() {
        assertEquals(List.of(), r.between(d(2026, 3, 1), d(2026, 3, 31)));
    }

    @Test
    void invertedDatesReturnEmpty() {
        assertEquals(List.of(), r.between(d(2026, 2, 1), d(2026, 1, 1)));
    }

    @Test
    void everything() {
        assertEquals(List.of("Purchase E", "Purchase A", "Purchase B", "Purchase C", "Purchase D"),
            r.between(d(2000, 1, 1), d(2100, 1, 1)));
    }

    @Test
    void noRecords() {
        assertEquals(List.of(), new Records().between(d(2026, 1, 1), d(2026, 12, 31)));
    }
}
