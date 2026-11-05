package dsa.m3_tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Ex20ScoreRankingTest {

    private static void check(Map<String, Integer> scores, List<String> expected) {
        Map<String, Integer> input = new HashMap<>(scores);
        assertEquals(expected, Ex20ScoreRanking.ascendingRanking(input));
        assertEquals(scores, input, "the input map must not be modified");
    }

    @Test
    void ascending() {
        check(Map.of("Ana", 120, "Bia", 80, "Caio", 200), List.of("Bia (80)", "Ana (120)", "Caio (200)"));
    }

    @Test
    void tiesAreAlphabetical() {
        check(Map.of("Duda", 150, "Ana", 150, "Bia", 90), List.of("Bia (90)", "Ana (150)", "Duda (150)"));
        check(Map.of("Caio", 10, "Ana", 10, "Bia", 10), List.of("Ana (10)", "Bia (10)", "Caio (10)"));
    }

    @Test
    void negativeAndZero() {
        check(Map.of("Eva", 0, "Fabio", -5, "Gil", 30), List.of("Fabio (-5)", "Eva (0)", "Gil (30)"));
    }

    @Test
    void severalTies() {
        check(Map.of("Hugo", 300, "Iris", 50, "Joao", 300, "Kai", 50, "Lia", 175),
            List.of("Iris (50)", "Kai (50)", "Lia (175)", "Hugo (300)", "Joao (300)"));
    }

    @Test
    void emptyAndSingle() {
        check(Map.of(), List.of());
        check(Map.of("Solo", 42), List.of("Solo (42)"));
    }
}
