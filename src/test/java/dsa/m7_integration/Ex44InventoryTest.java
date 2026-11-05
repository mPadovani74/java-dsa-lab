package dsa.m7_integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import dsa.m7_integration.Ex44Inventory.Inventory;
import java.util.List;
import org.junit.jupiter.api.Test;

class Ex44InventoryTest {

    @Test
    void stockInAndOut() {
        Inventory inv = new Inventory();
        inv.stockIn("P2", 5);
        inv.stockIn("P1", 10);
        assertTrue(inv.stockOut("P1", 4));
        assertEquals(6, inv.quantity("P1"));
        inv.stockIn("P1", 1);
        assertEquals(7, inv.quantity("P1"));
    }

    @Test
    void failedStockOutChangesNothing() {
        Inventory inv = new Inventory();
        inv.stockIn("P2", 5);
        assertFalse(inv.stockOut("P2", 9));
        assertEquals(5, inv.quantity("P2"));
        assertFalse(inv.stockOut("unknown", 1));
        assertEquals(0, inv.quantity("unknown"));
    }

    @Test
    void lowStockSortedById() {
        Inventory inv = new Inventory();
        inv.stockIn("P2", 5);
        inv.stockIn("P1", 6);
        inv.stockIn("P3", 50);
        assertEquals(List.of("P2"), inv.lowStock(6));
        assertEquals(List.of("P1", "P2"), inv.lowStock(7));
        assertEquals(List.of(), inv.lowStock(0));
    }

    @Test
    void productAtZeroStillExists() {
        Inventory inv = new Inventory();
        inv.stockIn("A", 2);
        assertTrue(inv.stockOut("A", 2));
        assertEquals(0, inv.quantity("A"));
        assertEquals(List.of("A"), inv.lowStock(1));
    }

    @Test
    void invalidQuantities() {
        Inventory inv = new Inventory();
        assertThrows(IllegalArgumentException.class, () -> inv.stockIn("A", 0));
        assertThrows(IllegalArgumentException.class, () -> inv.stockIn("A", -1));
        inv.stockIn("A", 1);
        assertThrows(IllegalArgumentException.class, () -> inv.stockOut("A", 0));
    }
}
