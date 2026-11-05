package dsa.m2_set;

/*
 * Exercise 12 - Contains duplicate                    [Module 2 - Set - Easy]
 *
 * PROBLEM
 *   Return true if any value appears at least twice. Do not modify the input.
 *   Stop as soon as you find the first repeated value.
 *
 * EXAMPLES
 *   [1, 2, 3, 1] -> true
 *   [1, 2, 3, 4] -> false
 *   []           -> false
 *
 * TOOLBOX
 *   set.add(x) returns false when x was already there - you can use that directly.
 *   set.contains(x)   O(1)
 *
 * THINK    Sorting and comparing neighbours also works. What are its time and space costs,
 *          and why is it not allowed here? (hint: "do not modify the input")
 *
 * TARGET   Time O(n)  -  Space O(n)
 * THEORY   docs/collections/03-hashset.md
 * TEST     ./mvnw test -Dtest=Ex12ContainsDuplicateTest
 */
public class Ex12ContainsDuplicate {

    public static boolean hasDuplicate(int[] nums) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
