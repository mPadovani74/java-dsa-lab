package dsa.m4_stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dsa.m4_stack.Ex29UndoOperations.Editor;
import org.junit.jupiter.api.Test;

class Ex29UndoOperationsTest {

    @Test
    void startsEmptyAndUndoDoesNothing() {
        Editor e = new Editor();
        assertEquals("", e.text());
        e.undo();
        assertEquals("", e.text());
    }

    @Test
    void writeDeleteUndo() {
        Editor e = new Editor();
        e.write("Hello");
        assertEquals("Hello", e.text());
        e.write(" world");
        assertEquals("Hello world", e.text());
        e.delete(6);
        assertEquals("Hello", e.text());
        e.undo();
        assertEquals("Hello world", e.text());
        e.undo();
        assertEquals("Hello", e.text());
        e.undo();
        assertEquals("", e.text());
        e.undo();
        assertEquals("", e.text());
    }

    @Test
    void deleteMoreThanLength() {
        Editor e = new Editor();
        e.write("abc");
        e.delete(10);
        assertEquals("", e.text());
        e.undo();
        assertEquals("abc", e.text());
    }

    @Test
    void mixedSequence() {
        Editor e = new Editor();
        e.write("abc");
        e.write("x");
        e.write("y");
        e.delete(1);
        assertEquals("abcx", e.text());
        e.undo();
        assertEquals("abcxy", e.text());
        e.undo();
        assertEquals("abcx", e.text());
    }

    @Test
    void instancesAreIndependent() {
        Editor a = new Editor();
        Editor b = new Editor();
        a.write("aaa");
        b.write("zzz");
        assertEquals("aaa", a.text());
        assertEquals("zzz", b.text());
    }
}
