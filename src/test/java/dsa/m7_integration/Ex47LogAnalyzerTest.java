package dsa.m7_integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class Ex47LogAnalyzerTest {

    private final List<String> logs = List.of(
        "ana GET /home 200",
        "bia GET /home 200",
        "ana POST /login 401",
        "caio GET /home 500",
        "ana GET /cart 200",
        "caio GET /cart 404");

    @Test
    void topUsers() {
        assertEquals(List.of("ana", "caio"), Ex47LogAnalyzer.topUsers(logs, 2));
        assertEquals(List.of("ana", "caio", "bia"), Ex47LogAnalyzer.topUsers(logs, 10));
    }

    @Test
    void topEndpoints() {
        assertEquals(List.of("/home"), Ex47LogAnalyzer.topEndpoints(logs, 1));
        assertEquals(List.of("/home", "/cart", "/login"), Ex47LogAnalyzer.topEndpoints(logs, 3));
    }

    @Test
    void tiesAreAlphabetical() {
        List<String> l = List.of("zed GET /b 200", "amy GET /a 200");
        assertEquals(List.of("amy", "zed"), Ex47LogAnalyzer.topUsers(l, 2));
        assertEquals(List.of("/a"), Ex47LogAnalyzer.topEndpoints(l, 1));
    }

    @Test
    void errorCount() {
        assertEquals(3, Ex47LogAnalyzer.errorCount(logs));
        assertEquals(0, Ex47LogAnalyzer.errorCount(List.of("a GET / 399")));
        assertEquals(1, Ex47LogAnalyzer.errorCount(List.of("a GET / 400")));
    }

    @Test
    void emptyLog() {
        assertEquals(List.of(), Ex47LogAnalyzer.topUsers(List.of(), 3));
        assertEquals(0, Ex47LogAnalyzer.errorCount(List.of()));
    }
}
