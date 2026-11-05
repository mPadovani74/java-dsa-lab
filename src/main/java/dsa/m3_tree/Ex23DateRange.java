package dsa.m3_tree;

import java.time.LocalDate;
import java.util.List;

/*
 * Exercise 23 - Records in a date range               [Module 3 - TreeMap - Medium]
 *
 * PROBLEM
 *   Store records by date (one date can have several records) and return the records
 *   between two dates, BOTH ends included, in date order. Records on the same date keep
 *   the order in which they were added.
 *   If from is after to, return an empty list (no exception).
 *
 * EXAMPLE
 *   add(2026-01-15, "B"); add(2026-02-01, "D"); add(2026-01-10, "A"); add(2026-01-15, "C")
 *   between(2026-01-01, 2026-01-31) -> [A, B, C]
 *   between(2026-01-15, 2026-02-01) -> [B, C, D]
 *   between(2026-03-01, 2026-03-31) -> []
 *
 * TOOLBOX
 *   TreeMap<LocalDate, List<String>>
 *   computeIfAbsent(date, k -> new ArrayList<>()).add(record)
 *   subMap(from, true, to, true)     view of [from, to] - both ends included
 *   date.isAfter(other)
 *
 * PITFALL  subMap throws IllegalArgumentException if from > to. Check first.
 *
 * TARGET   add O(log n)  -  between O(log n + k), k = records returned
 * THEORY   docs/collections/04-treemap-treeset.md (range views)
 * TEST     ./mvnw test -Dtest=Ex23DateRangeTest
 */
public class Ex23DateRange {

    public static class Records {

        // TODO: which fields do you need?

        public void add(LocalDate date, String record) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public List<String> between(LocalDate from, LocalDate to) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
