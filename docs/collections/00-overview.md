# 00 — Collections overview

## Interface vs implementation

In Java, the **interface** says *what* a structure does and the **class** says *how* it does it.

```java
Map<String, Integer> m = new HashMap<>();   // declare with the interface, create with the class
```

Declaring with the interface (`Map`, `Set`, `List`) is the convention: if you later swap `HashMap` for `TreeMap`, only the right-hand side changes.

> **TypeScript:** similar to typing a variable with an `interface` and assigning a class that implements it. The difference is that in Java the class must declare `implements` explicitly.

## The hierarchy

```
Iterable
 └── Collection
      ├── List ............ ArrayList, LinkedList
      ├── Set ............. HashSet, LinkedHashSet
      │    └── SortedSet → NavigableSet ...... TreeSet
      └── Queue ........... PriorityQueue
           └── Deque ...... ArrayDeque, LinkedList

Map (does NOT extend Collection)
 ├── HashMap
 │    └── LinkedHashMap
 └── SortedMap → NavigableMap ....... TreeMap
```

Since Java 21 there are also `SequencedCollection` and `SequencedMap`: interfaces for structures with a defined order (first/last element). `List`, `Deque`, `LinkedHashSet`, `TreeSet`, `LinkedHashMap` and `TreeMap` are part of them.

## Methods every `Collection` has

| Method | What it does |
|---|---|
| `add(e)` / `addAll(c)` | add |
| `remove(o)` / `removeAll(c)` / `retainAll(c)` / `removeIf(cond)` | remove |
| `contains(o)` / `containsAll(c)` | check |
| `size()` / `isEmpty()` / `clear()` | size / empty / clear |
| `iterator()` / `forEach(...)` / `stream()` | iterate |
| `toArray(...)` | convert to array |

## Primitive types and wrappers

Collections only store **objects**. That is why we use `Integer` instead of `int`, `Character` instead of `char`, and so on.

```java
List<int> x;       // compile ERROR
List<Integer> x;   // ok
```

Java converts between `int` and `Integer` automatically (*autoboxing* / *unboxing*).

### Pitfall: `==` with `Integer`

```java
Integer a = 1000, b = 1000;
a == b        // false! compares references
a.equals(b)   // true
```

Between -128 and 127 `==` "works" because of an internal cache, which hides the bug. **To compare objects, use `equals`.**

## `equals` and `hashCode`

*Hash* structures (`HashMap`, `HashSet`, `LinkedHashMap`) use:
1. `hashCode()` to find the bucket;
2. `equals()` to confirm it is the same element.

Rule: **if `a.equals(b)`, then `a.hashCode() == b.hashCode()`**. If you write your own class and use it as a key, you must override both (or use a `record`, which generates both automatically).

> **TypeScript:** JS `Map` and `Set` compare objects **by reference**. `new Set([{x:1}, {x:1}])` has 2 elements. In Java, with `equals`/`hashCode` well defined, it would have 1.

## `Comparable` and `Comparator`

*Sorted* structures (`TreeMap`, `TreeSet`, `PriorityQueue`) need to know how to compare elements:

- **`Comparable`**: the class itself defines its natural order (`compareTo`). `Integer`, `String`, `LocalDate` already implement it.
- **`Comparator`**: an order defined from outside, passed to the constructor.

```java
Comparator.naturalOrder()
Comparator.reverseOrder()
Comparator.comparing(Person::age)
Comparator.comparing(Person::age).thenComparing(Person::name)
```

`compare(a, b)` returns: **negative** if `a` comes first, **zero** if they are "equal", **positive** if `a` comes after.

> **TypeScript:** same convention as the function passed to `array.sort((a, b) => a - b)`.

## Immutable collections

```java
List.of(1, 2, 3)
Set.of(1, 2, 3)
Map.of("a", 1, "b", 2)
```

- They reject `add` / `remove` / `put`: `UnsupportedOperationException`.
- They reject `null`.
- `Set.of` and `Map.of` have **no guaranteed order** (it can change between runs).

For a mutable copy: `new ArrayList<>(List.of(...))`, `new HashSet<>(Set.of(...))`.

`Arrays.asList(...)` is different: it lets you replace elements (`set`) but not change the size.

## Pitfall: modifying while iterating

```java
for (Integer x : list) {
    list.remove(x);   // ConcurrentModificationException
}
```

Alternatives: `iterator.remove()`, `removeIf(...)`, or build a new collection.

## Utility classes

- **`Collections`**: `sort`, `reverse`, `max`, `min`, `frequency`, `unmodifiableList`, `emptyList`...
- **`Arrays`**: `sort`, `asList`, `toString`, `fill`, `equals`, `stream`...
