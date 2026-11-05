package dsa.m6_linkedhash;

import java.util.List;

/*
 * Exercise 40 - Access history                        [Module 6 - LinkedHashMap - Easy]
 *
 * PROBLEM
 *   Record page accesses.
 *   - access(page)           register one access
 *   - pagesInFirstVisitOrder()  each page once, in the order it was FIRST accessed
 *   - visits(page)           how many times the page was accessed (0 if never)
 *
 * EXAMPLE
 *   access("/home"); access("/blog"); access("/home"); access("/about")
 *   pagesInFirstVisitOrder() -> ["/home", "/blog", "/about"]
 *   visits("/home") -> 2;  visits("/contact") -> 0
 *
 * TOOLBOX
 *   Map<String, Integer> m = new LinkedHashMap<>();   HashMap that remembers insertion order
 *   Updating an EXISTING key does not change its position.
 *   merge(k, 1, Integer::sum), getOrDefault, new ArrayList<>(m.keySet())
 *   TS: a JS Map already behaves like this - Java's HashMap does not.
 *
 * TARGET   access / visits O(1)  -  list O(n)
 * THEORY   docs/collections/07-linkedhashmap.md
 * TEST     ./mvnw test -Dtest=Ex40AccessHistoryTest
 */
public class Ex40AccessHistory {

    public static class AccessHistory {

        // TODO: which fields do you need?

        public void access(String page) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public List<String> pagesInFirstVisitOrder() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public int visits(String page) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
