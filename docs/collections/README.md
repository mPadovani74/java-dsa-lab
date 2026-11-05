# Java Collections — study guide

One file per structure of the Java Collections Framework, in the same order as the exercises.

| File | Topic | Exercises |
|---|---|---|
| [00-overview.md](00-overview.md) | Hierarchy, interface vs implementation, `equals` / `hashCode`, `Comparable` / `Comparator`, general pitfalls | all |
| [01-list.md](01-list.md) | `ArrayList` and `LinkedList` | used everywhere |
| [02-hashmap.md](02-hashmap.md) | `HashMap` | 1–10 |
| [03-hashset.md](03-hashset.md) | `HashSet` and the `Set` interface | 11–18 |
| [04-treemap-treeset.md](04-treemap-treeset.md) | `TreeMap` and `TreeSet` | 19–25 |
| [05-stack-deque.md](05-stack-deque.md) | Stack with `ArrayDeque` (and why not `Stack`) | 26–32 |
| [06-queue-priorityqueue.md](06-queue-priorityqueue.md) | `Queue`, `ArrayDeque` as a queue, `PriorityQueue` | 33–39 |
| [07-linkedhashmap.md](07-linkedhashmap.md) | `LinkedHashMap` and `LinkedHashSet` | 40–43 |

## How to choose

| I need... | Use |
|---|---|
| a list with index access | `ArrayList` |
| key → value, fast, no order | `HashMap` |
| unique elements, fast, no order | `HashSet` |
| key → value **sorted by key** | `TreeMap` |
| unique elements **sorted** | `TreeSet` |
| key → value **in insertion order** | `LinkedHashMap` |
| a stack (last in, first out) | `ArrayDeque` |
| a queue (first in, first out) | `ArrayDeque` |
| always take the smallest / largest first | `PriorityQueue` |
