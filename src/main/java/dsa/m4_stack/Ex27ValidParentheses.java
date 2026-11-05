package dsa.m4_stack;

/*
 * Exercise 27 - Valid parentheses                     [Module 4 - Stack - Easy]
 *
 * PROBLEM
 *   Return true if every ( ) [ ] { } in the expression is correctly balanced and nested.
 *   Any other character is ignored.
 *
 * EXAMPLES
 *   "()[]{}"               -> true
 *   "{[()]}"               -> true
 *   "a * (b + c[0]) - {d}" -> true
 *   "([)]"                 -> false    (crossed)
 *   "(("                   -> false    (left open)
 *   ")"                    -> false    (closes before opening)
 *   ""                     -> true
 *
 * TOOLBOX
 *   Deque<Character> stack = new ArrayDeque<>();   push / pop / peek / isEmpty
 *   for (char c : s.toCharArray()) { ... }
 *   char is a primitive: compare with ==, and char literals use single quotes: '('
 *   Map.of(')', '(', ']', '[', '}', '{')   closing -> matching opening (optional)
 *   switch (c) { case '(', '[' -> ...; default -> ...; }   (Java 14+)
 *
 * PITFALL  pop() on an empty stack throws NoSuchElementException.
 *          stack.peek() == '(' throws NullPointerException if the stack is empty (unboxing).
 *
 * TARGET   Time O(n)  -  Space O(n)
 * THEORY   docs/collections/05-stack-deque.md
 * TEST     ./mvnw test -Dtest=Ex27ValidParenthesesTest
 */
public class Ex27ValidParentheses {

    public static boolean isValid(String expression) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
