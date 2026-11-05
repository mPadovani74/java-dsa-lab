package dsa.m7_integration;

import java.time.LocalTime;
import java.util.List;

/*
 * Exercise 48 - Reservation system                    [Module 7 - Integration - Hard]
 *
 * PROBLEM
 *   A single meeting room. Reservations are half-open intervals [start, end):
 *   10:00-11:00 and 11:00-12:00 do NOT conflict.
 *   - book(user, start, end)   true if booked; false if it overlaps an existing
 *                              reservation or if start is not before end
 *   - cancel(user, start)      cancel the reservation that starts at `start`, only if it
 *                              belongs to `user`; true if something was cancelled
 *   - schedule()               "HH:mm-HH:mm user" lines in time order
 *
 * EXAMPLE
 *   book("ana", 09:00, 10:00) -> true
 *   book("bia", 09:30, 10:30) -> false   (overlaps ana)
 *   book("bia", 10:00, 11:00) -> true    (touches, does not overlap)
 *   cancel("bia", 09:00)      -> false   (that one is ana's)
 *   schedule() -> ["09:00-10:00 ana", "10:00-11:00 bia"]
 *
 * TOOLBOX
 *   TreeMap<LocalTime, Booking>   start -> booking (record Booking(String user, LocalTime end))
 *   floorEntry(start)   the reservation that starts at or before `start`: does it end after start?
 *   ceilingEntry(start) the next reservation: does it start before `end`?
 *   Only these two neighbours can overlap. Why?
 *   time.isBefore(other), time.isAfter(other), time.toString() -> "09:00"
 *
 * TARGET   book / cancel O(log n)     (checking every reservation would be O(n))
 * THEORY   docs/collections/04-treemap-treeset.md (neighbours of a value)
 * TEST     ./mvnw test -Dtest=Ex48ReservationsTest
 */
public class Ex48Reservations {

    public static class ReservationSystem {

        // TODO: which fields do you need?

        public boolean book(String user, LocalTime start, LocalTime end) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public boolean cancel(String user, LocalTime start) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public List<String> schedule() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
