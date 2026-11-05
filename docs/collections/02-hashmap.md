# 02 — `HashMap`

Stores **key → value** pairs. Each key appears **only once**. No guaranteed order.

> **TypeScript:** similar to `Map<K, V>`, but the JS `Map` keeps **insertion order** and `HashMap` does not. The JS `Map` behaves more like `LinkedHashMap` (file 07).

## How it works inside

1. There is an array of **buckets**.
2. To store a key, Java computes `key.hashCode()` and uses that number to pick a bucket.
3. If two keys land in the same bucket (*collision*), they are kept in a small list inside the bucket and compared with `equals`. If a bucket gets too full (8+ entries), the list becomes a tree.
4. When the map is more than 75% full (*load factor* 0.75), the bucket array **doubles** and everything is redistributed.

Because the bucket is computed directly, without scanning anything, operations are **O(1) on average**.

## Basic usage

```java
Map<String, Integer> stock = new HashMap<>();
stock.put("pen", 10);
stock.put("pencil", 5);
stock.put("pen", 12);              // replaces: pen → 12

stock.get("pen");                  // 12
stock.get("eraser");               // null
stock.getOrDefault("eraser", 0);   // 0
stock.containsKey("pencil");       // true
stock.remove("pencil");
```

## Main methods

| Method | What it does |
|---|---|
| `put(k, v)` | insert or replace; returns the old value or `null` |
| `get(k)` | value or `null` |
| `getOrDefault(k, def)` | value or default |
| `containsKey(k)` | key exists? O(1) |
| `containsValue(v)` | value exists? **O(n)** |
| `remove(k)` | remove the key |
| `putIfAbsent(k, v)` | insert only if absent |
| `merge(k, v, fn)` | insert `v` or combine it with the existing value |
| `computeIfAbsent(k, fn)` | create the value only if the key is absent |
| `keySet()` / `values()` / `entrySet()` | keys / values / pairs |
| `size()` / `isEmpty()` / `clear()` | size / empty / clear |

### `merge` and `computeIfAbsent`

Two shortcuts you will use all the time:

```java
// merge: "if absent, put 1; if present, add"
map.merge(key, 1, Integer::sum);

// computeIfAbsent: "if absent, create a new list; then return the list"
map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
```

## Iterating

```java
for (Map.Entry<String, Integer> e : stock.entrySet()) {
    System.out.println(e.getKey() + " = " + e.getValue());
}

stock.forEach((k, v) -> System.out.println(k + " = " + v));
```

> **TypeScript:** `for (const [k, v] of map)` ↔ `for (Map.Entry<K, V> e : map.entrySet())`.

## Cost

| Operation | Average | Worst case |
|---|---|---|
| `put`, `get`, `remove`, `containsKey` | **O(1)** | O(log n) |
| `containsValue` | O(n) | O(n) |
| iterate | O(n) | O(n) |

Space: O(n).

## Pitfalls

- **Order**: never rely on the iteration order of a `HashMap`.
- **Mutable keys**: if you change an object after using it as a key, its `hashCode` changes and the map can no longer find it.
- **`get` returning `null`** can mean "absent" **or** "present with value `null`". Use `containsKey` if you need to tell them apart.
- Accepts **one** `null` key and many `null` values (`TreeMap` and `Map.of` do not).
