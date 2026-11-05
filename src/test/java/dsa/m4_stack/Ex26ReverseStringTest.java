package dsa.m4_stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Ex26ReverseStringTest {

    @Test
    void reverseCharacters() {
        assertEquals("cba", Ex26ReverseString.reverse("abc"));
        assertEquals("!dlrow ,olleH", Ex26ReverseString.reverse("Hello, world!"));
        assertEquals("x", Ex26ReverseString.reverse("x"));
        assertEquals("racecar", Ex26ReverseString.reverse("racecar"));
        assertEquals("", Ex26ReverseString.reverse(""));
    }

    @Test
    void reverseWords() {
        assertEquals("fun is Java", Ex26ReverseString.reverseWords("Java is fun"));
        assertEquals("one", Ex26ReverseString.reverseWords("one"));
        assertEquals("world hello", Ex26ReverseString.reverseWords("hello world"));
        assertEquals("", Ex26ReverseString.reverseWords(""));
    }
}
