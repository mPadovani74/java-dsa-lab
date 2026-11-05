package dsa.m3_tree;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/*
 * Exercise 19 - Event calendar                        [Module 3 - TreeMap - Easy]
 *
 * PROBLEM
 *   You receive events in a Map<LocalDate, String> with no guaranteed order.
 *   Return them as "yyyy-MM-dd - name" lines in chronological order.
 *   Do NOT modify the input map.
 *
 * EXAMPLE
 *   {2026-03-15=Dentist, 2026-01-10=Meeting, 2026-02-01=Birthday}
 *     -> ["2026-01-10 - Meeting", "2026-02-01 - Birthday", "2026-03-15 - Dentist"]
 *
 * TOOLBOX - this file is the TreeMap / TreeSet cheat sheet for the whole module
 *
 *   ---------------- TreeMap<K, V>: keys always sorted ----------------
 *   new TreeMap<>()  /  new TreeMap<>(comparator)  /  new TreeMap<>(otherMap)
 *   put, get, getOrDefault, containsKey, remove, merge, computeIfAbsent   (same as HashMap)
 *   firstKey() / lastKey()                 smallest / largest key (exception if empty)
 *   firstEntry() / lastEntry()             smallest / largest pair (null if empty)
 *   pollFirstEntry() / pollLastEntry()     remove and return smallest / largest pair
 *   lowerKey(k)    largest key <  k        (null if none)
 *   floorKey(k)    largest key <= k
 *   ceilingKey(k)  smallest key >= k
 *   higherKey(k)   smallest key >  k
 *   headMap(to) / tailMap(from) / subMap(from, fromIncl, to, toIncl)   views of a range
 *   keySet() / values() / entrySet()       always in key order
 *   descendingMap()                        reverse order view
 *
 *   ---------------- TreeSet<E>: unique elements, always sorted ----------------
 *   add, remove, contains, size, isEmpty
 *   first() / last()  ,  pollFirst() / pollLast()
 *   lower / floor / ceiling / higher       same idea as the *Key methods above
 *   headSet / tailSet / subSet             views of a range
 *   descendingSet()
 *
 *   Cost: insert / find / remove / first / last / floor ... -> O(log n). Walk all -> O(n).
 *   TypeScript has no built-in sorted map: JS Map keeps INSERTION order, not key order.
 *
 *   LocalDate implements Comparable, so TreeMap sorts dates with no extra code.
 *   date.toString() -> "2026-01-10"
 *
 * TARGET   Time O(n log n)  -  Space O(n)
 * THEORY   docs/collections/04-treemap-treeset.md
 * TEST     ./mvnw test -Dtest=Ex19EventCalendarTest
 */
public class Ex19EventCalendar {

    public static List<String> inOrder(Map<LocalDate, String> events) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
