package dsa.m1_hashmap;

import java.util.Map;

/*
 * Exercise 02 - User lookup                           [Module 1 - HashMap - Easy]
 *
 * PROBLEM
 *   Part 1: build a HashMap where the key is the user ID and the value is the name.
 *           ids[i] belongs to names[i]; both arrays have the same length.
 *   Part 2: look a user up by ID. Return null when the ID does not exist.
 *
 * EXAMPLES
 *   createUsers([1, 2, 3], ["Ana", "Bruno", "Carla"]) -> {1=Ana, 2=Bruno, 3=Carla}
 *   findName(users, 2)   -> "Bruno"
 *   findName(users, 99)  -> null
 *
 * TOOLBOX                                     TypeScript equivalent
 *   map.put(id, name)                         map.set(id, name)
 *   map.get(id)          value or null        map.get(id)  (undefined)
 *   Map<Integer, String>: keys are Integer (wrapper), not int - generics only take objects.
 *
 * TARGET   createUsers O(n)  -  findName O(1)
 * THEORY   docs/collections/02-hashmap.md, docs/collections/00-overview.md (wrappers)
 * TEST     ./mvnw test -Dtest=Ex02UserLookupTest
 */
public class Ex02UserLookup {

    public static Map<Integer, String> createUsers(int[] ids, String[] names) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static String findName(Map<Integer, String> users, int id) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
