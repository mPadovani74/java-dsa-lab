# 06 — Queue: `Queue`, `ArrayDeque` and `PriorityQueue`

## Plain queue (FIFO)

A **queue** is **FIFO**: *first in, first out*. The first to arrive is the first to leave, like a bank line.

```
offer(1) offer(2) offer(3)    poll() → 1
front → [1, 2, 3] ← back       front → [2, 3] ← back
```

```java
Queue<String> queue = new ArrayDeque<>();
queue.offer("Ana");
queue.offer("Bia");
queue.peek();   // "Ana" (look without removing)
queue.poll();   // "Ana"
queue.poll();   // "Bia"
queue.poll();   // null (empty)
```

> **TypeScript:** with an array it would be `push` + `shift`. But `shift()` is **O(n)** (it moves every element). `ArrayDeque.poll()` is **O(1)**.

## The 6 `Queue` methods

Each operation has two versions:

| Operation | Throws | Returns a special value |
|---|---|---|
| Insert at the back | `add(e)` | `offer(e)` → `false` |
| Remove from the front | `remove()` | `poll()` → `null` |
| Look at the front | `element()` | `peek()` → `null` |

Day to day, use **`offer` / `poll` / `peek`**.

## Which class for a plain queue

- **`ArrayDeque`**: the best choice in most cases (circular array, O(1) at the ends). See file 05.
- `LinkedList`: also implements `Queue`, but is usually slower and accepts `null`.

---

## `PriorityQueue`

It is not the first to arrive who leaves: it is the **highest priority**. By default, **the smallest element leaves first** (*min-heap*).

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(30);
pq.offer(10);
pq.offer(20);
pq.peek();   // 10
pq.poll();   // 10
pq.poll();   // 20
pq.poll();   // 30
```

For the **largest** first (*max-heap*):

```java
new PriorityQueue<Integer>(Comparator.reverseOrder());
```

With objects, pass a `Comparator`:

```java
new PriorityQueue<Task>(Comparator.comparing(Task::priority));
```

> **TypeScript:** there is no built-in priority queue; in JS you usually write a heap by hand or use a library.

### How it works inside: binary heap

It is an **almost complete** binary tree, stored **in an array**, where **every parent is less than or equal to its children**.

```
         10                array: [10, 20, 15, 40, 30]
       /    \              children of i: 2i+1 and 2i+2
     20      15            parent of i:   (i-1)/2
    /  \
  40    30
```

- The smallest is always at the **root** → `peek()` is O(1).
- `offer`: put it at the end and "bubble up" swapping with the parent → O(log n).
- `poll`: take the root, move the last element there and "sift down" → O(log n).

**It is not a fully sorted structure.** Only the root is guaranteed. Siblings have no order between them.

### Main methods

| Method | What it does | Cost |
|---|---|---|
| `offer(e)` / `add(e)` | insert | O(log n) |
| `poll()` | remove and return the highest priority (`null` if empty) | O(log n) |
| `peek()` | look at the highest priority | O(1) |
| `size()` / `isEmpty()` | size / empty? | O(1) |
| `contains(o)` / `remove(o)` | find / remove an arbitrary element | **O(n)** |

Building from a collection (`new PriorityQueue<>(list)`) is O(n).

### Pitfalls

- **Printing it or iterating with for-each does NOT give priority order.** It shows the internal array order.

```java
PriorityQueue<Integer> pq = new PriorityQueue<>(List.of(5, 1, 4, 2, 3));
System.out.println(pq);   // something like [1, 2, 4, 5, 3], not sorted
```

To get them in order, keep calling `poll()`.
- Accepts duplicates (unlike `TreeSet`).
- Does not accept `null`.
- **Not stable**: elements with equal priority come out in any order. Add a tie-breaker (e.g. an arrival counter) when order matters.

### When to use it

- "always process the most urgent / smallest / largest";
- **top K largest / smallest**: a heap limited to K elements;
- merging several sorted lists;
- greedy algorithms (always take the two smallest, for example).

## Comparison

| | `ArrayDeque` (queue) | `PriorityQueue` | `TreeSet` |
|---|---|---|---|
| Who leaves first | the oldest | the smallest (or by comparator) | — (access to `first` / `last`) |
| Duplicates | yes | yes | **no** |
| Insert | O(1) | O(log n) | O(log n) |
| Remove the first | O(1) | O(log n) | O(log n) |
| Remove any element | O(n) | O(n) | **O(log n)** |
| Iteration order | arrival | **none useful** | sorted |
