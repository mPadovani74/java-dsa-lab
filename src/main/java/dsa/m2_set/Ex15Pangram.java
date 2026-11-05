package dsa.m2_set;

/*
 * Exercise 15 - Pangram                               [Module 2 - Set - Easy]
 *
 * PROBLEM
 *   Return true if the sentence contains every letter from a to z at least once.
 *   Ignore case. Ignore anything that is not an ASCII letter (digits, spaces, accents...).
 *
 * EXAMPLES
 *   "The quick brown fox jumps over the lazy dog" -> true
 *   "Hello world"                                 -> false
 *   ""                                            -> false
 *
 * TOOLBOX                                     TypeScript equivalent
 *   Character.toLowerCase(c)                  c.toLowerCase()
 *   c >= 'a' && c <= 'z'   chars are numbers, so ranges work
 *   set.size()                                set.size
 *
 * THINK    You could stop early. When?
 *          A boolean[26] also works. Compare it with the Set: what is the space cost of each?
 *
 * TARGET   Time O(n)  -  Space O(1)   (at most 26 letters)
 * THEORY   docs/collections/03-hashset.md
 * TEST     ./mvnw test -Dtest=Ex15PangramTest
 */
public class Ex15Pangram {

    public static boolean isPangram(String sentence) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
