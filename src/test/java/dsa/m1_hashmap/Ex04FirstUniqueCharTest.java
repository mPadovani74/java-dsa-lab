package dsa.m1_hashmap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class Ex04FirstUniqueCharTest {

    @Test
    void firstCharIsUnique() {
        assertEquals('l', Ex04FirstUniqueChar.firstUnique("leetcode"));
    }

    @Test
    void uniqueCharInTheMiddle() {
        assertEquals('v', Ex04FirstUniqueChar.firstUnique("loveleetcode"));
    }

    @Test
    void noUniqueChar() {
        assertNull(Ex04FirstUniqueChar.firstUnique("aabb"));
    }

    @Test
    void emptyString() {
        assertNull(Ex04FirstUniqueChar.firstUnique(""));
    }

    @Test
    void isCaseSensitive() {
        assertEquals('A', Ex04FirstUniqueChar.firstUnique("aAa"));
    }

    @Test
    void singleChar() {
        assertEquals('z', Ex04FirstUniqueChar.firstUnique("z"));
    }
}
