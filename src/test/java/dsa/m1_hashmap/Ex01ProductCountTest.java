package dsa.m1_hashmap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import org.junit.jupiter.api.Test;

class Ex01ProductCountTest {

    @Test
    void countsRepeatedProducts() {
        assertEquals(Map.of("apple", 3, "banana", 2, "orange", 1),
            Ex01ProductCount.countProducts(new String[] {"apple", "banana", "apple", "orange", "banana", "apple"}));
    }

    @Test
    void allDifferent() {
        assertEquals(Map.of("notebook", 1, "pen", 1),
            Ex01ProductCount.countProducts(new String[] {"notebook", "pen"}));
    }

    @Test
    void emptyInput() {
        assertEquals(Map.of(), Ex01ProductCount.countProducts(new String[] {}));
    }

    @Test
    void isCaseSensitive() {
        assertEquals(Map.of("Apple", 1, "apple", 1),
            Ex01ProductCount.countProducts(new String[] {"Apple", "apple"}));
    }
}
