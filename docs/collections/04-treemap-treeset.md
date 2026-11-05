# 04 — `TreeMap` and `TreeSet`

- **`TreeMap`**: key → value, with the **keys always sorted**.
- **`TreeSet`**: a set without duplicates, with the **elements always sorted**.

The full method cheat sheet is in the header of `Ex19EventCalendar.java`. This file covers the concepts.

> **TypeScript:** there is no built-in equivalent. JS `Map` and `Set` keep insertion order, not value order.

## How it works inside

It is a **red-black tree**: a binary search tree that keeps itself **balanced**.

```
          20
        /    \
      10      30
     /  \       \
    5   15       40
```

- Everything to the left of a node is **smaller**; everything to the right is **larger**.
- To find, insert or remove, you walk down the tree comparing: O(height).
- Because the tree is balanced, the height is always about log₂ n. With 1 million elements, around 20 comparisons.
- Walking it left to right gives the elements **in order**.

`TreeSet` is a `TreeMap` that only uses the keys (same idea as `HashSet` and `HashMap`).

## How it knows the order

- **Natural order**: the class implements `Comparable` (`Integer`, `String`, `LocalDate`...).
- A **Comparator** passed to the constructor:

```java
new TreeSet<Integer>(Comparator.reverseOrder())   // descending
new TreeMap<String, Integer>(String.CASE_INSENSITIVE_ORDER)
```

If the key is not `Comparable` and you pass no `Comparator`, you get a `ClassCastException` on the first `put` / `add`.

## What it does that `HashMap` / `HashSet` cannot

### 1. Iterate in order

```java
TreeSet<Integer> s = new TreeSet<>(List.of(30, 10, 20));
System.out.println(s);   // [10, 20, 30]
```

### 2. First and last

```java
s.first();   // 10
s.last();    // 30
```

### 3. Neighbours of a value

For `s = [10, 20, 30]`:

| Method | Question | `x = 20` | `x = 25` |
|---|---|---|---|
| `lower(x)` | largest **<** x | 10 | 20 |
| `floor(x)` | largest **≤** x | 20 | 20 |
| `ceiling(x)` | smallest **≥** x | 20 | 30 |
| `higher(x)` | smallest **>** x | 30 | 30 |

They return `null` when there is no such element. In `TreeMap`: `lowerKey`, `floorKey`, `ceilingKey`, `higherKey` (and the `...Entry` versions).

### 4. Range slices

| Method | Range |
|---|---|
| `headSet(x)` / `headMap(x)` | < x |
| `tailSet(x)` / `tailMap(x)` | ≥ x |
| `subSet(a, b)` / `subMap(a, b)` | [a, b) |

There are overloads with `boolean` flags to choose whether each end is included. Slices are **views**: changes to them affect the original structure, and vice versa.

## Cost

| Operation | `TreeMap` / `TreeSet` | `HashMap` / `HashSet` |
|---|---|---|
| insert / find / remove | O(log n) | O(1) average |
| first / last | O(log n) | O(n) |
| `floor` / `ceiling` / `lower` / `higher` | O(log n) | does not exist |
| iterate **in order** | O(n) | would need sorting: O(n log n) |

Space: O(n).

**Rule of thumb:** use `Hash...` by default; use `Tree...` when you need **order** or questions like "what is the next larger / smaller value?".

## Pitfalls

- **No `null` keys** with natural order (`NullPointerException`).
- **"Equal" is defined by `compareTo` / the `Comparator`, not by `equals`.** If the comparator says two elements are equal (returns 0), a `TreeSet` keeps only one.

```java
// compares only by word length
TreeSet<String> s = new TreeSet<>(Comparator.comparing(String::length));
s.add("ana");
s.add("bia");   // also length 3 → considered a duplicate, NOT added
```

- `first()` / `last()` / `firstKey()` throw if empty; `pollFirst()` / `firstEntry()` return `null`.
