package dsa.m1_hashmap;

import java.util.Map;

/*
 * Exercise 01 - Product count                         [Module 1 - HashMap - Easy]
 *
 * PROBLEM
 *   Given an array of product names, return a Map telling how many times each
 *   product appears.
 *
 * EXAMPLES
 *   ["apple", "banana", "apple"]  -> {apple=2, banana=1}
 *   []                            -> {}
 *   ["Apple", "apple"]            -> {Apple=1, apple=1}   (case-sensitive)
 *
 * TOOLBOX                                     TypeScript equivalent
 *   new HashMap<>()                           new Map<string, number>()
 *   map.put(k, v)        insert / replace     map.set(k, v)
 *   map.get(k)           value or null        map.get(k)  (undefined)
 *   map.getOrDefault(k, 0)                    map.get(k) ?? 0
 *   map.merge(k, 1, Integer::sum)  "put 1 or add 1" in a single call
 *
 * TARGET   Time O(n)  -  Space O(k), k = distinct products
 * THEORY   docs/collections/02-hashmap.md
 * TEST     ./mvnw test -Dtest=Ex01ProductCountTest
 */
public class Ex01ProductCount {

    public static Map<String, Integer> countProducts(String[] products) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
