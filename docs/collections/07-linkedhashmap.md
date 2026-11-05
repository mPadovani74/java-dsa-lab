# 07 — `LinkedHashMap` and `LinkedHashSet`

A `HashMap` (or `HashSet`) that **remembers order**. Same O(1) cost, plus iteration in a predictable order.

> **TypeScript:** this is the default behaviour of JS `Map` and `Set`, which always keep insertion order.

## How it works inside

It combines two structures:
1. the **hash table** of `HashMap` (to find things fast);
2. a **doubly linked list** connecting all entries (to remember the order).

```
hash table:  [ ] [B] [ ] [A] [C] [ ]      ← O(1) lookup
list:        A ⇄ B ⇄ C                    ← order
```

It uses a bit more memory than `HashMap` (two extra pointers per entry). Exercise 10 asks you to build exactly this by hand.

## Two ordering modes

### 1. Insertion order (default)

```java
Map<String, Integer> m = new LinkedHashMap<>();
m.put("c", 3);
m.put("a", 1);
m.put("b", 2);
System.out.println(m);   // {c=3, a=1, b=2}

m.put("c", 30);          // existing key: value changes, POSITION DOES NOT
System.out.println(m);   // {c=30, a=1, b=2}
```

### 2. Access order

Using the constructor with the third parameter set to `true`:

```java
new LinkedHashMap<K, V>(16, 0.75f, true);
//                      initial capacity, load factor, accessOrder
```

In this mode, every time a key is **read** (`get`) or **written** (`put`), it moves to the **end** of the list. The start of the list always holds the key **used longest ago**.

## The `removeEldestEntry` method

`LinkedHashMap` has `protected boolean removeEldestEntry(Map.Entry<K, V> eldest)`, called automatically **after every `put`**. If it returns `true`, the map removes the eldest entry (the first in the list).

By default it always returns `false`. To change that, create a subclass and override it. These two features (access order + `removeEldestEntry`) are the basis of the cache exercises in module 6.

## Methods

Everything from `HashMap` (file 02), plus `SequencedMap` (Java 21+):

| Method | What it does |
|---|---|
| `firstEntry()` / `lastEntry()` | first / last pair (or `null`) |
| `pollFirstEntry()` / `pollLastEntry()` | remove and return the first / last |
| `putFirst(k, v)` / `putLast(k, v)` | insert (or move) at the start / end |
| `reversed()` | reverse-order view |
| `sequencedKeySet()` / `sequencedValues()` / `sequencedEntrySet()` | ordered views |

## `LinkedHashSet`

Same idea for sets: no duplicates, O(1), and **keeps insertion order**. Adding an element that already exists does not change its position.

```java
Set<String> s = new LinkedHashSet<>(List.of("b", "a", "b", "c", "a"));
System.out.println(s);   // [b, a, c]
```

It also gained `getFirst()`, `getLast()`, `removeFirst()`, `removeLast()`, `addFirst()`, `addLast()` and `reversed()` in Java 21.

## Cost

| Operation | Cost |
|---|---|
| `put`, `get`, `remove`, `containsKey` | O(1) average |
| first / last | O(1) |
| iterate | O(n), in order |

## The three maps side by side

| | `HashMap` | `LinkedHashMap` | `TreeMap` |
|---|---|---|---|
| Iteration order | none | insertion (or access) | sorted by key |
| `put` / `get` | O(1) | O(1) | O(log n) |
| First / last | — | O(1) | O(log n) |
| Neighbours (`floor`, `ceiling`...) | no | no | yes |
| `null` key | yes | yes | no |
