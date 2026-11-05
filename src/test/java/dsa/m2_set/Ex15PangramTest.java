package dsa.m2_set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Ex15PangramTest {

    @Test
    void classicPangram() {
        assertTrue(Ex15Pangram.isPangram("The quick brown fox jumps over the lazy dog"));
    }

    @Test
    void ignoresCaseAndSymbols() {
        assertTrue(Ex15Pangram.isPangram("PACK MY BOX WITH FIVE DOZEN LIQUOR JUGS!!! 123"));
        assertTrue(Ex15Pangram.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    void missingLetters() {
        assertFalse(Ex15Pangram.isPangram("Hello world"));
        assertFalse(Ex15Pangram.isPangram("abcdefghijklmnopqrstuvwxy"));   // no z
    }

    @Test
    void empty() {
        assertFalse(Ex15Pangram.isPangram(""));
    }
}
