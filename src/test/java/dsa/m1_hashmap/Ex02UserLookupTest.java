package dsa.m1_hashmap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Map;
import org.junit.jupiter.api.Test;

class Ex02UserLookupTest {

    private final Map<Integer, String> users =
        Ex02UserLookup.createUsers(new int[] {1, 2, 3}, new String[] {"Ana", "Bruno", "Carla"});

    @Test
    void createsTheMap() {
        assertEquals(Map.of(1, "Ana", 2, "Bruno", 3, "Carla"), users);
    }

    @Test
    void createsAnEmptyMap() {
        assertEquals(Map.of(), Ex02UserLookup.createUsers(new int[] {}, new String[] {}));
    }

    @Test
    void findsAnExistingId() {
        assertEquals("Bruno", Ex02UserLookup.findName(users, 2));
    }

    @Test
    void returnsNullForUnknownId() {
        assertNull(Ex02UserLookup.findName(users, 99));
    }
}
