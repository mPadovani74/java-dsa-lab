package dsa.m4_stack;

/*
 * Exercise 26 - Reverse a string with a stack         [Module 4 - Stack - Easy]
 *
 * PROBLEM
 *   Part 1: reverse(text) - reverse the CHARACTERS.
 *   Part 2: reverseWords(sentence) - reverse the order of the WORDS (separated by one
 *           space) without reversing the letters.
 *
 * EXAMPLES
 *   reverse("abc")                    -> "cba"
 *   reverse("Hello, world!")          -> "!dlrow ,olleH"
 *   reverseWords("Java is fun")       -> "fun is Java"
 *   reverseWords("")                  -> ""
 *
 * RULE     The reversal must come from the stack. sb.reverse() and Collections.reverse
 *          are not allowed.
 *
 * TOOLBOX - Deque<E> as a STACK (LIFO, everything at the top, all O(1))
 *   Deque<Character> stack = new ArrayDeque<>();      (do not use the old Stack class)
 *   push(e)     put on top                          TS: arr.push(e)
 *   pop()       remove top; EXCEPTION if empty      TS: arr.pop()  (undefined if empty)
 *   peek()      look at top; null if empty          TS: arr[arr.length - 1]
 *   isEmpty(), size()
 *
 *   StringBuilder sb = new StringBuilder();  sb.append(x);  sb.toString();
 *   (String is immutable: "a" + "b" inside a loop creates a new String every time)
 *   s.split(" ")  -> String[]                   TS: s.split(" ")
 *
 * TARGET   Time O(n)  -  Space O(n)
 * THEORY   docs/collections/05-stack-deque.md
 * TEST     ./mvnw test -Dtest=Ex26ReverseStringTest
 */
public class Ex26ReverseString {

    public static String reverse(String text) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }

    public static String reverseWords(String sentence) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
