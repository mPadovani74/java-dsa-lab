package dsa.m3_tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Ex19EventCalendarTest {

    private static void check(Map<LocalDate, String> events, List<String> expected) {
        Map<LocalDate, String> input = new HashMap<>(events);   // HashMap: no order at all
        assertEquals(expected, Ex19EventCalendar.inOrder(input));
        assertEquals(events, input, "the input map must not be modified");
    }

    @Test
    void sortsByDate() {
        check(Map.of(
                LocalDate.of(2026, 3, 15), "Dentist",
                LocalDate.of(2026, 1, 10), "Meeting",
                LocalDate.of(2026, 2, 1), "Birthday"),
            List.of("2026-01-10 - Meeting", "2026-02-01 - Birthday", "2026-03-15 - Dentist"));
    }

    @Test
    void acrossYears() {
        check(Map.of(LocalDate.of(2027, 1, 1), "New year", LocalDate.of(2026, 12, 25), "Christmas"),
            List.of("2026-12-25 - Christmas", "2027-01-01 - New year"));
    }

    @Test
    void sameMonth() {
        check(Map.of(
                LocalDate.of(2026, 5, 20), "Delivery",
                LocalDate.of(2026, 5, 3), "Kickoff",
                LocalDate.of(2026, 5, 11), "Review",
                LocalDate.of(2026, 5, 31), "Retro"),
            List.of("2026-05-03 - Kickoff", "2026-05-11 - Review", "2026-05-20 - Delivery", "2026-05-31 - Retro"));
    }

    @Test
    void emptyAndSingle() {
        check(Map.of(), List.of());
        check(Map.of(LocalDate.of(2026, 7, 4), "Trip"), List.of("2026-07-04 - Trip"));
    }
}
