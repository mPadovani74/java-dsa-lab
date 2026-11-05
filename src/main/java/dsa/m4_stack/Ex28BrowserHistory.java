package dsa.m4_stack;

/*
 * Exercise 28 - Browser history                       [Module 4 - Stack - Easy]
 *
 * PROBLEM
 *   Implement a browser with a "back" button.
 *   - visit(url)      go to a new page; it becomes the current page.
 *   - back()          go to the previous page and return it. If there is no previous
 *                     page, stay where you are and return the current page.
 *                     If nothing was ever visited, return null.
 *   - currentPage()   current page, or null if nothing was visited.
 *
 * EXAMPLE
 *   visit("google.com"); visit("github.com"); visit("stackoverflow.com")
 *   back() -> "github.com"; back() -> "google.com"; back() -> "google.com"
 *   visit("youtube.com"); back() -> "google.com"
 *
 * TOOLBOX - a class with STATE
 *   Fields keep data between calls:
 *     private final Deque<String> history = new ArrayDeque<>();
 *   final = the REFERENCE never changes, but the content of the deque can.  (TS: readonly)
 *   "static class" inside another class = nested class that does not need an instance of
 *   the outer class: new Ex28BrowserHistory.Browser()
 *
 * EXTENSION  Add forward(). Which second stack do you need, and when must you clear it?
 *
 * TARGET   every operation O(1)
 * THEORY   docs/collections/05-stack-deque.md
 * TEST     ./mvnw test -Dtest=Ex28BrowserHistoryTest
 */
public class Ex28BrowserHistory {

    public static class Browser {

        // TODO: which fields do you need?

        public void visit(String url) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public String back() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public String currentPage() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
