---
description: Run the tests for an exercise and review the student's code
argument-hint: "[exercise number, e.g. 27]"
---

Review exercise $ARGUMENTS (if empty, use the exercise the student is working on).

1. Find the exercise file under `src/main/java/dsa/` and its test under `src/test/java/dsa/`.
2. Run only that test class: `./mvnw -q test -Dtest=<ClassName>Test`.
3. Report passed / failed tests in a short list.
4. Review the code following "Reviewing the student's code" in CLAUDE.md: classify each
   problem (logic / syntax-API / data structure choice), point to the line, and ask a guiding
   question instead of giving the fix. Mention what is good.
5. If everything passes, ask the student for the Big O before giving it, then offer the
   THINK / VARIATION / CHALLENGE section from the header if there is one.

Do not edit the exercise file.
