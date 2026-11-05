# Java DSA Lab

[![CI](https://github.com/mPadovani74/java-dsa-lab/actions/workflows/ci.yml/badge.svg)](https://github.com/mPadovani74/java-dsa-lab/actions/workflows/ci.yml)
![Java 21](https://img.shields.io/badge/Java-21-orange)
![Exercises](https://img.shields.io/badge/exercises-48-blue)
![License: MIT](https://img.shields.io/badge/license-MIT-green)

**48 progressive data structure exercises in Java, with tests and a ready-to-use AI tutor
that gives hints instead of answers.**

From "count the products in an array" to LRU caches, monotonic stacks, heaps and interval
scheduling. Every exercise has a short statement, examples, the exact API methods you will
need and the target Big O. You write the code; the tests tell you when it works.

## Why this exists

I teach programming at university. A common pattern: students understand a `HashMap` in
class, then freeze in front of a blank file. What helps is **many small, progressive
problems**, fast feedback, and someone to ask *"why is this O(n²)?"* outside class hours.

This repo is that material, organized so it can be used in class or alone:

- **Progressive**: 7 modules, each from 🟢 easy to 🔴 hard, ending with problems that mix structures.
- **Tested**: JUnit tests for every exercise, including edge cases and performance checks.
- **Self-contained**: theory notes for each structure in [`docs/collections`](docs/collections/README.md).
- **AI tutor included**: a [`CLAUDE.md`](CLAUDE.md) that turns Claude into a tutor that
  gives progressive hints and reviews your code, instead of solving the exercise for you.

It is also how I keep my own fundamentals sharp. Solving the same problems you give your
students is the best way to find out which ones are badly written.

## What's inside

| Module | Structure | Exercises | Highlights |
|---|---|---|---|
| 1 | `HashMap` | 01–10 | Two Sum, prefix sums, LRU cache by hand |
| 2 | `HashSet` | 11–18 | set algebra, longest consecutive sequence, Sudoku validator |
| 3 | `TreeMap` / `TreeSet` | 19–25 | range queries, floor/ceiling, running median |
| 4 | `Deque` as a stack | 26–32 | undo, monotonic stack, sliding window maximum |
| 5 | `Queue` / `PriorityQueue` | 33–39 | round robin, circular buffer, top K, merge k lists |
| 6 | `LinkedHashMap` / `LinkedHashSet` | 40–43 | FIFO and LRU caches with the standard library |
| 7 | All of the above | 44–48 | inventory, voting, task manager, log analyzer, reservations |

The full list is in [STUDY_PLAN.md](STUDY_PLAN.md).

## Quick start

You need **Java 21+**. Maven is not required: the wrapper downloads it.

```bash
git clone https://github.com/mPadovani74/java-dsa-lab.git
cd java-dsa-lab

./mvnw -q test -Dtest=Ex01ProductCountTest     # one exercise
./mvnw -q test -Dtest='dsa.m1_hashmap.*'       # one module
```

On Windows use `mvnw.cmd`. Running `./mvnw test` with no filter runs everything and will
fail until you solve all 48 — that is expected.

Workflow for each exercise:

1. Read the theory file for the module (linked in the plan).
2. Open the exercise, read the header, replace the `TODO`.
3. Run its test until it is green.
4. Before ticking it in `STUDY_PLAN.md`, say the time and space complexity out loud.

## What an exercise looks like

```java
/*
 * Exercise 07 - Two Sum                               [Module 1 - HashMap - Easy]
 *
 * PROBLEM
 *   Given an int array and a target, return the indices of two DIFFERENT positions
 *   whose values add up to the target. Return an empty array if there is no pair.
 *
 * EXAMPLES
 *   [2, 7, 11, 15], 9 -> [0, 1]
 *   [3, 2, 4], 6      -> [1, 2]      (not [0, 0]: same index twice is not allowed)
 *
 * TOOLBOX
 *   Map<Integer, Integer>   value -> index where it was seen
 *   map.containsKey(k), map.get(k), map.put(k, v)
 *
 * HINT     For each number x, the partner you need is (target - x).
 *          Have you already seen it? Do it in ONE pass.
 *
 * TARGET   Time O(n)  -  Space O(n)    (the brute force with two loops is O(n^2))
 * THEORY   docs/collections/02-hashmap.md
 * TEST     ./mvnw test -Dtest=Ex07TwoSumTest
 */
public static int[] twoSum(int[] nums, int target) {
    // TODO
}
```

Headers also show the **TypeScript equivalent** of each Java API call, for students coming
from web development.

## Studying with Claude as your tutor

AI can make you a worse programmer if it writes the code for you. Used as a tutor, it is
the opposite: a patient teaching assistant available at any hour. This repo is set up for
the second option.

### With Claude Code (recommended)

[Claude Code](https://claude.com/claude-code) automatically reads [`CLAUDE.md`](CLAUDE.md)
when you open it in this folder. That file tells Claude to:

- **never write the solution** unless you explicitly ask for it;
- give hints **one level at a time** (clarify → concept → approach → pseudocode → small snippet);
- run the tests and classify your mistakes as *logic*, *syntax / Java API* or *wrong data structure*;
- ask **you** for the Big O before explaining it;
- reply in **your language**, even though the repo is in English.

```bash
cd java-dsa-lab
claude
```

Built-in commands:

| Command | What it does |
|---|---|
| `/next` | shows the next unchecked exercise and how to start |
| `/hint 09` | one hint for exercise 09, one level deeper than the last |
| `/review 27` | runs the tests for exercise 27 and reviews your code |
| `/explain TreeMap.floorKey` | explains a concept with a small example (not a solution) |

Or just talk to it:

> *"I'm on exercise 16. My solution passes but the performance test times out. Why?"*
> *"Is a TreeMap really needed in exercise 23, or would a HashMap work?"*
> *"Explain amortized O(1) using exercise 31 as the example, without solving it."*
> *"Estou travado no 10, me dá só uma dica sobre a lista duplamente encadeada."*

### With Claude on the web or the mobile app

1. Create a **Project** on [claude.ai](https://claude.ai).
2. Paste the contents of `CLAUDE.md` into the project instructions.
3. Paste the exercise file (and your attempt) into the chat and ask for a hint or a review.

## For teachers

Fork it and use it as you like (MIT). Some ideas:

- **One module per week**, with the theory file as pre-reading.
- **Tests as instant feedback** in the lab: students run them as often as they want.
- **Ask for the Big O in class**: passing the tests is not the same as understanding.
- **Grade with a twist**: ask students to explain one of their solutions out loud, or to
  solve a `VARIATION` from the header that has no test.

## Contributing

Found a confusing statement, a missing edge case or a typo? Open an issue or a pull request.
New exercises are welcome if they follow the same header format and come with tests.

## License

[MIT](LICENSE) © Matheus Padovani
