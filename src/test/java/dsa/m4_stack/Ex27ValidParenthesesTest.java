package dsa.m4_stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Ex27ValidParenthesesTest {

    @Test
    void valid() {
        assertTrue(Ex27ValidParentheses.isValid("()"));
        assertTrue(Ex27ValidParentheses.isValid("()[]{}"));
        assertTrue(Ex27ValidParentheses.isValid("{[()]}"));
        assertTrue(Ex27ValidParentheses.isValid(""));
        assertTrue(Ex27ValidParentheses.isValid("a * (b + c[0]) - {d}"));
    }

    @Test
    void wrongType() {
        assertFalse(Ex27ValidParentheses.isValid("(]"));
    }

    @Test
    void crossed() {
        assertFalse(Ex27ValidParentheses.isValid("([)]"));
    }

    @Test
    void onlyOpens() {
        assertFalse(Ex27ValidParentheses.isValid("(("));
        assertFalse(Ex27ValidParentheses.isValid("{[]"));
    }

    @Test
    void closesBeforeOpening() {
        assertFalse(Ex27ValidParentheses.isValid(")"));
        assertFalse(Ex27ValidParentheses.isValid("}{"));
        assertFalse(Ex27ValidParentheses.isValid("[]]"));
    }
}
