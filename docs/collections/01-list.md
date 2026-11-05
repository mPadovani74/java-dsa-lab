# 01 — List: `ArrayList` and `LinkedList`

A `List` is a sequence **with order** and **with indices** that **allows duplicates**.

> **TypeScript:** the closest equivalent is `Array` (`number[]`).

## `ArrayList`

Inside, it is an **array that grows by itself**. When it is full, it creates a bigger array (about 1.5×) and copies everything.

```java
List<String> names = new ArrayList<>();
names.add("Ana");        // [Ana]
names.add("Bia");        // [Ana, Bia]
names.add(0, "Caio");    // [Caio, Ana, Bia]
names.get(1);            // "Ana"
names.set(1, "Duda");    // [Caio, Duda, Bia]
names.size();            // 3
```

## Main `List` methods

| Method | What it does |
|---|---|
| `add(e)` | add at the end |
| `add(i, e)` | insert at position `i` (shifts the others) |
| `get(i)` / `set(i, e)` | read / replace at position `i` |
| `remove(int i)` | remove by **position** |
| `remove(Object o)` | remove the **first occurrence** of the value |
| `indexOf(o)` / `lastIndexOf(o)` | position of the value, or -1 |
| `contains(o)` | exists? (scans: O(n)) |
| `subList(from, to)` | slice [from, to), linked to the original list |
| `sort(comparator)` | sort (`null` = natural order) |
| `getFirst()` / `getLast()` / `removeFirst()` / `removeLast()` / `reversed()` | Java 21+ |

> **TypeScript:** `push` ↔ `add`, `arr[i]` ↔ `get(i)`, `arr[i] = x` ↔ `set(i, x)`, `splice` ↔ `add(i, e)` / `remove(i)`, `slice` ↔ `subList` (but `subList` does not copy!), `length` ↔ `size()`.

## Pitfall: `remove` on a `List<Integer>`

```java
List<Integer> l = new ArrayList<>(List.of(10, 20, 30));
l.remove(1);                    // removes POSITION 1 → [10, 30]
l.remove(Integer.valueOf(10));  // removes the VALUE 10 → [30]
```

With an `int`, Java picks `remove(int index)`. To remove by value, pass an `Integer`.

## `LinkedList`

A **doubly linked** list: each node points to the previous and the next one. It implements `List` **and** `Deque`.

In practice `ArrayList` is almost always faster, even where theory favours `LinkedList`, because arrays use the CPU cache much better. For stacks and queues, prefer `ArrayDeque` (files 05 and 06).

## Cost

| Operation | `ArrayList` | `LinkedList` |
|---|---|---|
| `get(i)` / `set(i, e)` | **O(1)** | O(n) |
| `add(e)` at the end | O(1) amortized | O(1) |
| `add(i, e)` / `remove(i)` in the middle | O(n) | O(n) (finding the position) |
| insert / remove at the start | O(n) | **O(1)** |
| `contains` / `indexOf` | O(n) | O(n) |

"Amortized" = almost always O(1); occasionally O(n) to grow the array, but O(1) on average.
