package dsa.m1_hashmap;

/*
 * Exercise 05 - Valid anagram                         [Module 1 - HashMap - Easy]
 *
 * PROBLEM
 *   Return true if b is an anagram of a: same characters, same amounts,
 *   any order. Case-sensitive.
 *
 * EXAMPLES
 *   "listen", "silent" -> true
 *   "rat", "car"       -> false
 *   "aab", "abb"       -> false    (same letters, different counts)
 *   "abc", "abcc"      -> false
 *   "", ""             -> true
 *
 * TOOLBOX
 *   s.charAt(i), map.merge(c, 1, Integer::sum), map.equals(other)
 *   Objects.equals(a, b)  null-safe equality for Integer values
 *
 * PITFALL  Integer == Integer compares references; it "works" only between -128 and 127.
 *          Use equals. See docs/collections/00-overview.md.
 *
 * TARGET   Time O(n)  -  Space O(k)
 * THEORY   docs/collections/02-hashmap.md
 * TEST     ./mvnw test -Dtest=Ex05ValidAnagramTest
 */
public class Ex05ValidAnagram {

    public static boolean areAnagrams(String a, String b) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
