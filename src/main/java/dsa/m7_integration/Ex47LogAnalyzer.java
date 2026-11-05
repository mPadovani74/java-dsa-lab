package dsa.m7_integration;

import java.util.List;

/*
 * Exercise 47 - Log analyzer                          [Module 7 - Integration - Medium]
 *
 * PROBLEM
 *   Each log line has the format "userId METHOD /endpoint STATUS", e.g.
 *     "ana GET /home 200"
 *   - topUsers(logs, n)       the n users with the most requests
 *   - topEndpoints(logs, n)   the n endpoints with the most requests (method ignored)
 *   - errorCount(logs)        how many lines have STATUS >= 400
 *   Ranking ties are broken alphabetically. If there are fewer than n, return all.
 *
 * EXAMPLE
 *   ["ana GET /home 200", "bia GET /home 200", "ana POST /login 401",
 *    "caio GET /home 500", "ana GET /cart 200"]
 *   topUsers(logs, 2)      -> ["ana", "bia"]     (ana 3; bia and caio 1 -> "bia" first)
 *   topEndpoints(logs, 1)  -> ["/home"]
 *   errorCount(logs)       -> 2
 *
 * TOOLBOX
 *   line.split(" ") -> String[]           Integer.parseInt("401")
 *   Map<String, Integer> counts + merge(k, 1, Integer::sum)
 *   Sorting entries: list.sort(Map.Entry.<String, Integer>comparingByValue().reversed()
 *                                .thenComparing(Map.Entry.comparingByKey()))
 *   Or a PriorityQueue of size n (Ex37) when there are millions of distinct keys.
 *
 * REFACTOR  topUsers and topEndpoints are almost the same. Extract one helper.
 *
 * THEORY   docs/collections/02-hashmap.md, docs/collections/06-queue-priorityqueue.md
 * TEST     ./mvnw test -Dtest=Ex47LogAnalyzerTest
 */
public class Ex47LogAnalyzer {

    public static List<String> topUsers(List<String> logs, int n) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static List<String> topEndpoints(List<String> logs, int n) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static int errorCount(List<String> logs) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
