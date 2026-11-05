package dsa.m5_queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Ex39MinCostRopesTest {

    @Test
    void basic() {
        assertEquals(29, Ex39MinCostRopes.minCost(new int[] {4, 3, 2, 6}));
        assertEquals(9, Ex39MinCostRopes.minCost(new int[] {1, 2, 3}));
    }

    @Test
    void nothingToJoin() {
        assertEquals(0, Ex39MinCostRopes.minCost(new int[] {5}));
        assertEquals(0, Ex39MinCostRopes.minCost(new int[] {}));
    }

    @Test
    void equalRopes() {
        assertEquals(16, Ex39MinCostRopes.minCost(new int[] {2, 2, 2, 2}));   // 4 + 4 + 8
    }

    @Test
    void largeValuesNeedLong() {
        int big = 2_000_000_000;
        assertEquals(10_000_000_000L, Ex39MinCostRopes.minCost(new int[] {big, big, big}));
    }
}
