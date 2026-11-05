# Study plan

48 exercises in 7 modules, from the basics of each structure to interview-style problems.
Tick each box when its tests pass **and** you can explain the Big O without looking.

Each exercise file has the full statement, examples, the API methods you will need
(TOOLBOX) and the target complexity. Read the theory file before starting each module.

Difficulty: 🟢 easy · 🟡 medium · 🔴 hard

---

## Module 1 — HashMap · [theory](docs/collections/02-hashmap.md)

- [ ] **01** 🟢 [Product count](src/main/java/dsa/m1_hashmap/Ex01ProductCount.java) — counting with `merge` / `getOrDefault`
- [ ] **02** 🟢 [User lookup](src/main/java/dsa/m1_hashmap/Ex02UserLookup.java) — `put` / `get`, wrapper types
- [ ] **03** 🟢 [Does the word exist?](src/main/java/dsa/m1_hashmap/Ex03WordExists.java) — O(1) lookup vs `list.contains`
- [ ] **04** 🟢 [First non-repeating character](src/main/java/dsa/m1_hashmap/Ex04FirstUniqueChar.java) — two passes, `Map<Character, Integer>`
- [ ] **05** 🟢 [Valid anagram](src/main/java/dsa/m1_hashmap/Ex05ValidAnagram.java) — frequency maps, `equals` vs `==`
- [ ] **06** 🟢 [Intersection of two arrays](src/main/java/dsa/m1_hashmap/Ex06ArrayIntersection.java) — `containsKey`, `List` → `int[]`
- [ ] **07** 🟢 [Two Sum](src/main/java/dsa/m1_hashmap/Ex07TwoSum.java) — value → index map, single pass
- [ ] **08** 🟡 [Group anagrams](src/main/java/dsa/m1_hashmap/Ex08GroupAnagrams.java) — `computeIfAbsent`, choosing a key
- [ ] **09** 🟡 [Subarrays that sum to K](src/main/java/dsa/m1_hashmap/Ex09SubarraySum.java) — prefix sums + map
- [ ] **10** 🔴 [LRU cache, by hand](src/main/java/dsa/m1_hashmap/Ex10LruCache.java) — `HashMap` + your own doubly linked list

## Module 2 — HashSet · [theory](docs/collections/03-hashset.md)

- [ ] **11** 🟢 [Remove duplicates](src/main/java/dsa/m2_set/Ex11RemoveDuplicates.java) — `HashSet`, `stream().toArray()`
- [ ] **12** 🟢 [Contains duplicate](src/main/java/dsa/m2_set/Ex12ContainsDuplicate.java) — the `boolean` returned by `add`
- [ ] **13** 🟢 [Elements in common](src/main/java/dsa/m2_set/Ex13CommonElements.java) — `retainAll`, defensive copies
- [ ] **14** 🟢 [Set difference](src/main/java/dsa/m2_set/Ex14SetDifference.java) — `removeAll`, symmetric difference
- [ ] **15** 🟢 [Pangram](src/main/java/dsa/m2_set/Ex15Pangram.java) — `Set<Character>`, char ranges
- [ ] **16** 🟡 [Longest consecutive sequence](src/main/java/dsa/m2_set/Ex16LongestConsecutive.java) — O(n) with "start of sequence" trick
- [ ] **17** 🟢 [Unique visitors](src/main/java/dsa/m2_set/Ex17UniqueVisitors.java) — counting distinct, first repeat
- [ ] **18** 🟡 [Valid Sudoku](src/main/java/dsa/m2_set/Ex18ValidSudoku.java) — one set per row / column / box

## Module 3 — TreeMap and TreeSet · [theory](docs/collections/04-treemap-treeset.md)

- [ ] **19** 🟢 [Event calendar](src/main/java/dsa/m3_tree/Ex19EventCalendar.java) — sorted keys, `LocalDate` (header = full cheat sheet)
- [ ] **20** 🟢 [Score ranking](src/main/java/dsa/m3_tree/Ex20ScoreRanking.java) — `TreeMap<Integer, TreeSet<String>>`, ties
- [ ] **21** 🟢 [Min and max tracker](src/main/java/dsa/m3_tree/Ex21MinMaxTracker.java) — multiset, `firstKey` / `lastKey`
- [ ] **22** 🟢 [Sorted word count](src/main/java/dsa/m3_tree/Ex22SortedWordCount.java) — normalizing input, sorted output
- [ ] **23** 🟡 [Records in a date range](src/main/java/dsa/m3_tree/Ex23DateRange.java) — `subMap` range views
- [ ] **24** 🟢 [Next available number](src/main/java/dsa/m3_tree/Ex24NextAvailable.java) — `higher` / `floor` / `ceiling`
- [ ] **25** 🔴 [Running median](src/main/java/dsa/m3_tree/Ex25RunningMedian.java) — two heaps or two multisets

## Module 4 — Stack and Deque · [theory](docs/collections/05-stack-deque.md)

- [ ] **26** 🟢 [Reverse a string](src/main/java/dsa/m4_stack/Ex26ReverseString.java) — `push` / `pop`, `StringBuilder`
- [ ] **27** 🟢 [Valid parentheses](src/main/java/dsa/m4_stack/Ex27ValidParentheses.java) — matching pairs, empty-stack pitfalls
- [ ] **28** 🟢 [Browser history](src/main/java/dsa/m4_stack/Ex28BrowserHistory.java) — a class with state
- [ ] **29** 🟡 [Undo (Ctrl+Z)](src/main/java/dsa/m4_stack/Ex29UndoOperations.java) — snapshot vs command design, `record`
- [ ] **30** 🟡 [Next greater element](src/main/java/dsa/m4_stack/Ex30NextGreaterElement.java) — monotonic stack
- [ ] **31** 🟡 [Queue made of two stacks](src/main/java/dsa/m4_stack/Ex31QueueWithTwoStacks.java) — amortized O(1), generics
- [ ] **32** 🔴 [Sliding window maximum](src/main/java/dsa/m4_stack/Ex32SlidingWindowMax.java) — monotonic deque, both ends

## Module 5 — Queue and PriorityQueue · [theory](docs/collections/06-queue-priorityqueue.md)

- [ ] **33** 🟢 [Service line](src/main/java/dsa/m5_queue/Ex33ServiceLine.java) — `offer` / `poll` / `peek`
- [ ] **34** 🟡 [Task processing (round robin)](src/main/java/dsa/m5_queue/Ex34TaskProcessing.java) — re-queueing, immutable records
- [ ] **35** 🟡 [Circular queue](src/main/java/dsa/m5_queue/Ex35CircularQueue.java) — array + modulo, how `ArrayDeque` works
- [ ] **36** 🟡 [Priority service](src/main/java/dsa/m5_queue/Ex36PriorityService.java) — `Comparator` chains, stable tie-breaker
- [ ] **37** 🟡 [K largest elements](src/main/java/dsa/m5_queue/Ex37TopKElements.java) — min-heap of size K
- [ ] **38** 🔴 [Merge k sorted lists](src/main/java/dsa/m5_queue/Ex38MergeSortedLists.java) — heap of cursors
- [ ] **39** 🟡 [Minimum cost to connect ropes](src/main/java/dsa/m5_queue/Ex39MinCostRopes.java) — greedy with a heap, `long` overflow

## Module 6 — LinkedHashMap and LinkedHashSet · [theory](docs/collections/07-linkedhashmap.md)

- [ ] **40** 🟢 [Access history](src/main/java/dsa/m6_linkedhash/Ex40AccessHistory.java) — insertion order + counting
- [ ] **41** 🟢 [Remove duplicates, keep the order](src/main/java/dsa/m6_linkedhash/Ex41DedupePreservingOrder.java) — `LinkedHashSet`, generic methods
- [ ] **42** 🟡 [FIFO cache](src/main/java/dsa/m6_linkedhash/Ex42FifoCache.java) — `removeEldestEntry`
- [ ] **43** 🟡 [LRU cache with LinkedHashMap](src/main/java/dsa/m6_linkedhash/Ex43LruCache.java) — access order, compare with Ex10

## Module 7 — Putting it together · [how to choose](docs/collections/README.md)

- [ ] **44** 🟡 [Inventory system](src/main/java/dsa/m7_integration/Ex44Inventory.java) — validation, all-or-nothing updates
- [ ] **45** 🟡 [Voting system](src/main/java/dsa/m7_integration/Ex45Voting.java) — `HashSet` + `TreeMap` working together
- [ ] **46** 🔴 [Task manager](src/main/java/dsa/m7_integration/Ex46TaskManager.java) — `TreeSet` with comparator + index map
- [ ] **47** 🟡 [Log analyzer](src/main/java/dsa/m7_integration/Ex47LogAnalyzer.java) — parsing, top-N with ties
- [ ] **48** 🔴 [Reservation system](src/main/java/dsa/m7_integration/Ex48Reservations.java) — interval overlap with `floorEntry` / `ceilingEntry`
