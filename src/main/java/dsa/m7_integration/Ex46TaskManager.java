package dsa.m7_integration;

import java.util.List;

/*
 * Exercise 46 - Task manager                          [Module 7 - Integration - Hard]
 *
 * PROBLEM
 *   - add(name, priority)   add a task. Higher priority = more urgent. Task names are
 *                           unique: adding an existing name throws IllegalArgumentException.
 *   - complete(name)        remove the task; false if it does not exist
 *   - next(n)               the n most urgent tasks, WITHOUT removing them.
 *                           Same priority -> the one added first comes first.
 *                           Fewer than n tasks -> return all of them.
 *   - size()
 *
 * EXAMPLE
 *   add("deploy", 5); add("email", 1); add("review", 5); add("tests", 3)
 *   next(3) -> ["deploy", "review", "tests"]
 *   complete("deploy") -> true;  next(2) -> ["review", "tests"]
 *   complete("nope") -> false
 *
 * DESIGN   complete(name) must be FAST, so you cannot search a list by name.
 *          next(n) must not destroy anything. A PriorityQueue has O(n) remove(Object) and
 *          iterates in no useful order. A TreeSet with a Comparator removes in O(log n) and
 *          iterates in order. You still need a Map name -> task to find what to remove.
 *          Remember: in a TreeSet, compare() == 0 means "same element" (see the docs).
 *
 * TARGET   add / complete O(log n)  -  next(n) O(n) or better
 * THEORY   docs/collections/04-treemap-treeset.md (pitfalls), docs/collections/06-queue-priorityqueue.md
 * TEST     ./mvnw test -Dtest=Ex46TaskManagerTest
 */
public class Ex46TaskManager {

    public static class TaskManager {

        // TODO: which fields do you need?

        public void add(String name, int priority) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public boolean complete(String name) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public List<String> next(int n) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public int size() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
