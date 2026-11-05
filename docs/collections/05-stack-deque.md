# 05 — Stack: `Deque` / `ArrayDeque`

A **stack** is **LIFO**: *last in, first out*. The last one in is the first one out, like a pile of plates.

```
push(1)  push(2)  push(3)    pop() → 3    pop() → 2
                    [3]
           [2]      [2]         [2]
  [1]      [1]      [1]         [1]          [1]
```

> **TypeScript:** usually an array with `push` and `pop`, which already behave like a stack.

## Use `ArrayDeque`, not `Stack`

Java has a `Stack` class, but it is **legacy** (it extends `Vector`, has unnecessary synchronization and lets you access the middle of the stack). The official documentation recommends:

```java
Deque<Integer> stack = new ArrayDeque<>();
```

`Deque` = *double-ended queue*: you can insert and remove at **both ends**. Using only one end, it is a stack.

## How it works inside

`ArrayDeque` is a **circular array** that grows when full. It keeps track of where the head and the tail are, so inserting / removing at the ends is O(1) without moving other elements. Exercise 35 asks you to build one.

## Stack methods

| Method | What it does | If empty |
|---|---|---|
| `push(e)` | put on top | — |
| `pop()` | remove and return the top | **exception** |
| `peek()` | look at the top without removing | `null` |
| `isEmpty()` | empty? | — |
| `size()` | size | — |

```java
Deque<String> stack = new ArrayDeque<>();
stack.push("a");
stack.push("b");
stack.peek();   // "b"
stack.pop();    // "b"
stack.pop();    // "a"
stack.peek();   // null
stack.pop();    // NoSuchElementException
```

**Tip:** check `isEmpty()` before `pop()`, or use `poll()`, which returns `null` instead of throwing.

## All `Deque` methods (both ends)

| | Front | Back |
|---|---|---|
| Insert (throws on failure) | `addFirst(e)` / `push(e)` | `addLast(e)` / `add(e)` |
| Insert (returns `false`) | `offerFirst(e)` | `offerLast(e)` / `offer(e)` |
| Remove (throws if empty) | `removeFirst()` / `pop()` / `remove()` | `removeLast()` |
| Remove (`null` if empty) | `pollFirst()` / `poll()` | `pollLast()` |
| Look (throws if empty) | `getFirst()` / `element()` | `getLast()` |
| Look (`null` if empty) | `peekFirst()` / `peek()` | `peekLast()` |

`push` / `pop` / `peek` work at the **front**. Iterating an `ArrayDeque` used as a stack (`for-each`) goes from top to bottom. `descendingIterator()` goes the other way.

## Cost

| Operation | Cost |
|---|---|
| `push`, `pop`, `peek` (and everything at the ends) | **O(1)** (amortized) |
| `contains`, `remove(Object)` | O(n) |

Space: O(n).

## Pitfalls

- `ArrayDeque` **does not accept `null`** (because `null` is what `peek` / `poll` return for "empty").
- No index access.

## When to think "stack"

- something must be undone in reverse order (undo, back button);
- opening / closing things that must match (parentheses, HTML tags);
- "the most recent one still pending" (*next greater element* problems use a stack that keeps an order — a **monotonic stack**).
