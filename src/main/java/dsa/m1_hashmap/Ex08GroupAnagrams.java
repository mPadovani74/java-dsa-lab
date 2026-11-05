package dsa.m1_hashmap;

import java.util.List;

/*
 * Exercise 08 - Group anagrams                        [Module 1 - HashMap - Medium]
 *
 * PROBLEM
 *   Given a list of words, group together the words that are anagrams of each other.
 *   The order of the groups and the order inside each group do not matter.
 *
 * EXAMPLES
 *   ["eat", "tea", "tan", "ate", "nat", "bat"]
 *     -> [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
 *   []    -> []
 *   [""]  -> [[""]]
 *
 * TOOLBOX
 *   s.toCharArray(), Arrays.sort(chars), new String(chars)    -> a "signature" for the word
 *   map.computeIfAbsent(key, k -> new ArrayList<>()).add(word)
 *   new ArrayList<>(map.values())
 *
 * HINT     Two words are anagrams if they have the same ... what? Use that as the key.
 *
 * TARGET   Time O(n * k log k), k = word length  -  Space O(n * k)
 * THEORY   docs/collections/02-hashmap.md (merge / computeIfAbsent)
 * TEST     ./mvnw test -Dtest=Ex08GroupAnagramsTest
 */
public class Ex08GroupAnagrams {

    public static List<List<String>> groupAnagrams(List<String> words) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
