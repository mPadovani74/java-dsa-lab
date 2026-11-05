# 03 — `HashSet` and the `Set` interface

A `Set` is a collection **without duplicates**. `HashSet` is the fastest implementation and has **no guaranteed order**.

> **TypeScript:** similar to `Set<T>`, but the JS `Set` keeps **insertion order** (like Java's `LinkedHashSet`) and compares objects by reference.

## How it works inside

`HashSet` is a **`HashMap` in disguise**: elements are stored as the **keys** of an internal `HashMap`, with a fixed dummy value. That is why:
- it does not repeat (map keys do not repeat);
- `add`, `remove`, `contains` are O(1) on average (same bucket logic as file 02);
- it depends on `equals` and `hashCode`.

## Basic usage

```java
Set<String> tags = new HashSet<>();
tags.add("java");      // true
tags.add("java");      // false (already there, nothing changes)
tags.contains("java"); // true
tags.remove("java");   // true
tags.remove("java");   // false (was not there)
tags.size();           // 0
```

The `boolean` returned by `add` and `remove` is useful: it tells you whether the set **changed**.

## Main methods

| Method | What it does |
|---|---|
| `add(e)` | add; `false` if already present |
| `remove(o)` | remove; `false` if absent |
| `contains(o)` | exists? O(1) |
| `size()` / `isEmpty()` / `clear()` | size / empty / clear |
| `addAll(c)` | **union** (modifies the set) |
| `retainAll(c)` | **intersection** (modifies the set) |
| `removeAll(c)` | **difference** (modifies the set) |
| `containsAll(c)` | is `c` a subset? |
| `removeIf(cond)` | remove the elements that match |

## Set operations

| Operation | Math | Java |
|---|---|---|
| Union | a ∪ b | copy `a`, `addAll(b)` |
| Intersection | a ∩ b | copy `a`, `retainAll(b)` |
| Difference | a − b | copy `a`, `removeAll(b)` |
| Symmetric difference | a △ b | (a − b) ∪ (b − a) |
| Disjoint? | a ∩ b = ∅ | `Collections.disjoint(a, b)` → `boolean` |
| Subset? | b ⊆ a | `a.containsAll(b)` |

**Careful:** `addAll`, `retainAll` and `removeAll` **modify** the set they are called on. To keep the input intact, copy it first: `new HashSet<>(a)`.

> **TypeScript:** recent JS has `a.union(b)`, `a.intersection(b)`, `a.difference(b)`, `a.symmetricDifference(b)`, which **return a new set** instead of modifying `a`.

## Iterating

```java
for (String t : tags) { ... }     // for-each
tags.forEach(t -> ...);
```

A `Set` **has no index**: there is no `tags[0]` and no `tags.get(0)`.

## Cost

| Operation | Average |
|---|---|
| `add`, `remove`, `contains` | **O(1)** |
| `addAll`, `retainAll`, `removeAll` with `c` of size m | about O(m) |
| iterate | O(n) |

Space: O(n).

## When to use it

- removing duplicates;
- checking "have I seen this already?" in O(1) (instead of searching a list, which is O(n));
- set operations.

## Other `Set` implementations

| Class | Order | Cost |
|---|---|---|
| `HashSet` | none | O(1) |
| `LinkedHashSet` | insertion order | O(1) |
| `TreeSet` | sorted | O(log n) |
