package dsa.m4_stack;

/*
 * Exercise 29 - Undo (Ctrl+Z)                         [Module 4 - Stack - Medium]
 *
 * PROBLEM
 *   Implement a tiny text editor with undo.
 *   - write(chunk)   appends the chunk to the end of the text.
 *   - delete(n)      deletes the last n characters. If n > length, deletes everything.
 *   - undo()         undoes the last write or delete not yet undone. Does nothing if
 *                    there is nothing to undo.
 *   - text()         current content ("" at the start).
 *
 * EXAMPLE
 *   write("Hello")    -> "Hello"
 *   write(" world")   -> "Hello world"
 *   delete(6)         -> "Hello"
 *   undo()            -> "Hello world"
 *   undo()            -> "Hello"
 *   undo()            -> ""
 *   undo()            -> ""        (nothing left to undo)
 *
 * DESIGN CHOICE - what goes on the stack? Both pass the tests:
 *   1. a SNAPSHOT of the whole text before each operation;
 *   2. WHAT THE OPERATION DID (what was written / what was deleted), so you can invert it.
 *   Pick one. Afterwards, compare their memory cost for a 1 MB document.
 *   Careful with delete(10) on "abc": to undo it, what do you need to remember?
 *
 * TOOLBOX
 *   Deque<...> as a stack: push / pop / isEmpty
 *   s.substring(start) / s.substring(start, end)   end is exclusive   TS: s.slice(start, end)
 *   StringBuilder: append, length(), delete(start, end), setLength(n), toString()
 *   Math.min(a, b)
 *   record Operation(String type, String text) {}   (Java 16+) an immutable data class
 *                                                   TS: type Operation = { type: string; text: string }
 *
 * TARGET   depends on your design - be ready to explain it
 * THEORY   docs/collections/05-stack-deque.md
 * TEST     ./mvnw test -Dtest=Ex29UndoOperationsTest
 */
public class Ex29UndoOperations {

    public static class Editor {

        // TODO: which fields do you need?

        public void write(String chunk) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public void delete(int n) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public void undo() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public String text() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
