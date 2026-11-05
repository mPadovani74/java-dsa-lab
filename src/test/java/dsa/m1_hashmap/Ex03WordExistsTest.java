package dsa.m1_hashmap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.Test;

class Ex03WordExistsTest {

    @Test
    void findsAWordThatExists() {
        assertTrue(Ex03WordExists.containsWord(List.of("java", "typescript", "python"), "java"));
    }

    @Test
    void doesNotFindAMissingWord() {
        assertFalse(Ex03WordExists.containsWord(List.of("java", "typescript", "python"), "kotlin"));
    }

    @Test
    void worksWithRepeatedWords() {
        assertTrue(Ex03WordExists.containsWord(List.of("java", "java", "python"), "java"));
    }

    @Test
    void emptyList() {
        assertFalse(Ex03WordExists.containsWord(List.of(), "java"));
    }

    @Test
    void isCaseSensitive() {
        assertFalse(Ex03WordExists.containsWord(List.of("Java"), "java"));
    }
}
