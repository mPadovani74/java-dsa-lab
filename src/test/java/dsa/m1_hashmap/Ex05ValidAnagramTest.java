package dsa.m1_hashmap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Ex05ValidAnagramTest {

    @Test
    void anagrams() {
        assertTrue(Ex05ValidAnagram.areAnagrams("listen", "silent"));
        assertTrue(Ex05ValidAnagram.areAnagrams("amor", "roma"));
    }

    @Test
    void differentLetters() {
        assertFalse(Ex05ValidAnagram.areAnagrams("rat", "car"));
    }

    @Test
    void sameLettersDifferentCounts() {
        assertFalse(Ex05ValidAnagram.areAnagrams("aab", "abb"));
    }

    @Test
    void differentLengths() {
        assertFalse(Ex05ValidAnagram.areAnagrams("abc", "abcc"));
        assertFalse(Ex05ValidAnagram.areAnagrams("abcc", "abc"));
    }

    @Test
    void emptyStrings() {
        assertTrue(Ex05ValidAnagram.areAnagrams("", ""));
    }

    @Test
    void isCaseSensitive() {
        assertFalse(Ex05ValidAnagram.areAnagrams("Roma", "amor"));
    }

    @Test
    void countsAbove127() {
        // Integer == Integer only "works" up to 127 - this test catches that bug.
        String a = "x".repeat(200) + "y";
        String b = "y" + "x".repeat(200);
        assertTrue(Ex05ValidAnagram.areAnagrams(a, b));
    }
}
