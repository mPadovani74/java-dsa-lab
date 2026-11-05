package dsa.m1_hashmap;

/*
 * Exercise 04 - First non-repeating character         [Module 1 - HashMap - Easy]
 *
 * PROBLEM
 *   Given a String, return the first character that appears exactly once.
 *   Return null if there is none.
 *
 * EXAMPLES
 *   "leetcode"      -> 'l'
 *   "loveleetcode"  -> 'v'
 *   "aabb"          -> null
 *   "aAa"           -> 'A'   (case-sensitive)
 *
 * TOOLBOX                                     TypeScript equivalent
 *   s.length()                                s.length
 *   s.charAt(i)          returns char         s[i]
 *   Map<Character, Integer>  (Character, not char)
 *   map.merge(c, 1, Integer::sum)
 *
 * HINT     Two passes over the string: one to count, one to find.
 *
 * TARGET   Time O(n)  -  Space O(k), k = distinct characters
 * THEORY   docs/collections/02-hashmap.md
 * TEST     ./mvnw test -Dtest=Ex04FirstUniqueCharTest
 */
public class Ex04FirstUniqueChar {

    public static Character firstUnique(String text) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
