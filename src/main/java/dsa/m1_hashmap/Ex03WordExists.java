package dsa.m1_hashmap;

import java.util.List;

/*
 * Exercise 03 - Does the word exist?                  [Module 1 - HashMap - Easy]
 *
 * PROBLEM
 *   Given a list of words and a target, return true if the target is in the list.
 *   Build a hash structure first, then answer the lookup from it (do not just call
 *   list.contains - the point is to understand why a hash lookup is O(1)).
 *
 * EXAMPLES
 *   ["java", "typescript", "python"], "java"   -> true
 *   ["java", "typescript", "python"], "kotlin" -> false
 *   [], "java"                                 -> false
 *   ["Java"], "java"                           -> false   (case-sensitive)
 *
 * TOOLBOX                                     TypeScript equivalent
 *   map.put(k, v)                             map.set(k, v)
 *   map.containsKey(k)   O(1)                 map.has(k)
 *   list.contains(x)     O(n) - for comparison only
 *
 * THINK    If you had to answer 1,000 lookups on the same list, why is building the
 *          map once better than calling list.contains 1,000 times?
 *
 * TARGET   build O(n) once, then each lookup O(1)
 * THEORY   docs/collections/02-hashmap.md
 * TEST     ./mvnw test -Dtest=Ex03WordExistsTest
 */
public class Ex03WordExists {

    public static boolean containsWord(List<String> words, String target) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
