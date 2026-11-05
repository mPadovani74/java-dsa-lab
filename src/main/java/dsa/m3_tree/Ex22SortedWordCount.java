package dsa.m3_tree;

import java.util.List;
import java.util.TreeMap;

/*
 * Exercise 22 - Sorted word count                     [Module 3 - TreeMap - Easy]
 *
 * PROBLEM
 *   Part 1: count(words) - count each word, ignoring case and surrounding spaces.
 *           Blank words ("" or "   ") are ignored. Result is sorted alphabetically.
 *   Part 2: format(counts) - turn the counts into "word: N" lines, in the same order.
 *
 * EXAMPLES
 *   count(["Grape", " grape ", "banana", ""]) -> {banana=1, grape=2}
 *   format({banana=1, grape=2})               -> ["banana: 1", "grape: 2"]
 *   count([])                                 -> {}
 *
 * TOOLBOX                                     TypeScript equivalent
 *   s.trim()                                  s.trim()
 *   s.toLowerCase()                           s.toLowerCase()
 *   s.isEmpty() / s.isBlank()                 s.length === 0 / s.trim().length === 0
 *   treeMap.merge(word, 1, Integer::sum)
 *
 * TARGET   Time O(n log k)  -  Space O(k), k = distinct words
 * THEORY   docs/collections/04-treemap-treeset.md
 * TEST     ./mvnw test -Dtest=Ex22SortedWordCountTest
 */
public class Ex22SortedWordCount {

    public static TreeMap<String, Integer> count(String[] words) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static List<String> format(TreeMap<String, Integer> counts) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
