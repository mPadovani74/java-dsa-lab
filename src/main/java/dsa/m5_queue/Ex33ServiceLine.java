package dsa.m5_queue;

/*
 * Exercise 33 - Service line                          [Module 5 - Queue - Easy]
 *
 * PROBLEM
 *   Model a bank line: first to arrive, first to be served (FIFO).
 *   - arrive(name)    customer joins the end of the line
 *   - serveNext()     removes and returns the next customer, or null if the line is empty
 *   - nextInLine()    who is next, without removing; null if empty
 *   - waiting()       how many customers are waiting
 *
 * EXAMPLE
 *   arrive("Ana"); arrive("Bia"); arrive("Caio")
 *   nextInLine() -> "Ana"; serveNext() -> "Ana"; serveNext() -> "Bia"; waiting() -> 1
 *
 * TOOLBOX - Queue<E> (FIFO)
 *   Queue<String> q = new ArrayDeque<>();
 *   offer(e)   add at the back            TS: arr.push(e)
 *   poll()     remove the front; null     TS: arr.shift()   <- O(n) in JS! poll() is O(1)
 *   peek()     look at the front; null    TS: arr[0]
 *   size(), isEmpty()
 *   add / remove / element do the same but throw exceptions instead of returning null.
 *
 * TARGET   every operation O(1)
 * THEORY   docs/collections/06-queue-priorityqueue.md
 * TEST     ./mvnw test -Dtest=Ex33ServiceLineTest
 */
public class Ex33ServiceLine {

    public static class ServiceLine {

        // TODO: which fields do you need?

        public void arrive(String name) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public String serveNext() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public String nextInLine() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public int waiting() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
