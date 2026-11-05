package dsa.m5_queue;

/*
 * Exercise 36 - Priority service                      [Module 5 - PriorityQueue - Medium]
 *
 * PROBLEM
 *   A clinic serves the HIGHEST priority first. Among the same priority, whoever
 *   arrived first is served first.
 *   - arrive(name, priority)   higher number = more urgent
 *   - serveNext()              remove and return the next patient, or null if empty
 *   - waiting()                how many are waiting
 *
 * EXAMPLE
 *   arrive("Ana", 1); arrive("Bia", 5); arrive("Caio", 5); arrive("Duda", 3)
 *   serveNext() -> Bia, Caio, Duda, Ana, then null
 *
 * TOOLBOX
 *   PriorityQueue<E> pq = new PriorityQueue<>(comparator);
 *   offer(e) O(log n), poll() O(log n), peek() O(1)
 *   Comparator.comparingInt(Patient::priority).reversed()
 *             .thenComparingLong(Patient::arrival)
 *
 * PITFALL  PriorityQueue is NOT stable: equal priorities come out in ANY order unless
 *          you add a tie-breaker. An arrival counter (0, 1, 2, ...) solves it.
 *          Printing or iterating a PriorityQueue does NOT show priority order.
 *
 * TARGET   arrive / serveNext O(log n)
 * THEORY   docs/collections/06-queue-priorityqueue.md
 * TEST     ./mvnw test -Dtest=Ex36PriorityServiceTest
 */
public class Ex36PriorityService {

    public static class PriorityService {

        // TODO: which fields do you need? (a small record can help)

        public void arrive(String name, int priority) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public String serveNext() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public int waiting() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
