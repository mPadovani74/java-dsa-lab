package dsa.m3_tree;

import java.util.List;
import java.util.Map;

/*
 * Exercise 20 - Score ranking                         [Module 3 - TreeMap + TreeSet - Easy]
 *
 * PROBLEM
 *   You receive player -> score. Return "name (score)" lines from the LOWEST score to
 *   the highest. Players with the same score are listed in alphabetical order.
 *   Do NOT modify the input map.
 *
 * EXAMPLES
 *   {Ana=120, Bia=80, Caio=200} -> ["Bia (80)", "Ana (120)", "Caio (200)"]
 *   {Duda=150, Ana=150, Bia=90} -> ["Bia (90)", "Ana (150)", "Duda (150)"]
 *
 * TOOLBOX
 *   TreeMap<Integer, TreeSet<String>>   score -> names with that score (sorted)
 *   map.computeIfAbsent(score, k -> new TreeSet<>()).add(name)
 *   Map.Entry: entry.getKey(), entry.getValue()
 *
 * ALTERNATIVE  Sort the entries with a Comparator:
 *   Comparator.comparing(Map.Entry<String, Integer>::getValue).thenComparing(Map.Entry::getKey)
 *   Which approach is easier to read? Which is easier to extend?
 *
 * TARGET   Time O(n log n)  -  Space O(n)
 * THEORY   docs/collections/04-treemap-treeset.md, docs/collections/00-overview.md (Comparator)
 * TEST     ./mvnw test -Dtest=Ex20ScoreRankingTest
 */
public class Ex20ScoreRanking {

    public static List<String> ascendingRanking(Map<String, Integer> scores) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
