package dsa.m7_integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import dsa.m7_integration.Ex48Reservations.ReservationSystem;
import java.time.LocalTime;
import java.util.List;
import org.junit.jupiter.api.Test;

class Ex48ReservationsTest {

    private static LocalTime t(String s) {
        return LocalTime.parse(s);
    }

    @Test
    void bookAndRejectOverlaps() {
        ReservationSystem r = new ReservationSystem();
        assertTrue(r.book("ana", t("09:00"), t("10:00")));
        assertFalse(r.book("bia", t("09:30"), t("10:30")));
        assertFalse(r.book("bia", t("08:30"), t("09:01")));
        assertFalse(r.book("bia", t("08:00"), t("11:00")));   // contains ana's slot
        assertFalse(r.book("bia", t("09:15"), t("09:45")));   // inside ana's slot
        assertTrue(r.book("bia", t("10:00"), t("11:00")));    // touches, no overlap
        assertTrue(r.book("caio", t("08:00"), t("09:00")));
        assertEquals(List.of("08:00-09:00 caio", "09:00-10:00 ana", "10:00-11:00 bia"), r.schedule());
    }

    @Test
    void invalidInterval() {
        ReservationSystem r = new ReservationSystem();
        assertFalse(r.book("ana", t("10:00"), t("10:00")));
        assertFalse(r.book("ana", t("11:00"), t("10:00")));
        assertEquals(List.of(), r.schedule());
    }

    @Test
    void sameStartIsAConflict() {
        ReservationSystem r = new ReservationSystem();
        assertTrue(r.book("ana", t("09:00"), t("10:00")));
        assertFalse(r.book("bia", t("09:00"), t("09:30")));
    }

    @Test
    void cancelOnlyByOwner() {
        ReservationSystem r = new ReservationSystem();
        r.book("ana", t("09:00"), t("10:00"));
        assertFalse(r.cancel("bia", t("09:00")));
        assertFalse(r.cancel("ana", t("09:30")));
        assertTrue(r.cancel("ana", t("09:00")));
        assertEquals(List.of(), r.schedule());
        assertTrue(r.book("bia", t("09:30"), t("10:30")));   // slot is free again
    }
}
