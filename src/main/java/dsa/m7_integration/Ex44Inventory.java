package dsa.m7_integration;

import java.util.List;

/*
 * Exercise 44 - Inventory system                      [Module 7 - Integration - Medium]
 *
 * PROBLEM
 *   Products are identified by ID (String).
 *   - stockIn(id, qty)     add qty units (creates the product if new)
 *   - stockOut(id, qty)    remove qty units. If the product does not exist or there is not
 *                          enough stock, return false and change NOTHING.
 *   - quantity(id)         units in stock (0 for unknown products)
 *   - lowStock(threshold)  IDs with quantity < threshold, sorted by ID
 *   qty <= 0 in stockIn / stockOut throws IllegalArgumentException.
 *   A product that reaches 0 still exists (it shows up in lowStock).
 *
 * EXAMPLE
 *   stockIn("P2", 5); stockIn("P1", 10); stockOut("P1", 4) -> true
 *   stockOut("P2", 9) -> false (still 5);  stockOut("X", 1) -> false
 *   quantity("P1") -> 6
 *   lowStock(6) -> ["P2"]          (P1 has 6, which is not < 6)
 *   lowStock(7) -> ["P1", "P2"]
 *
 * DESIGN   Which structure gives O(1) lookups? Which gives sorted IDs?
 *          Do you need both all the time, or only when lowStock is called?
 *
 * THEORY   docs/collections/README.md ("how to choose")
 * TEST     ./mvnw test -Dtest=Ex44InventoryTest
 */
public class Ex44Inventory {

    public static class Inventory {

        // TODO: which fields do you need?

        public void stockIn(String id, int qty) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public boolean stockOut(String id, int qty) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public int quantity(String id) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public List<String> lowStock(int threshold) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
