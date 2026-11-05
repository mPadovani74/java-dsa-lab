---
description: Get the next-level hint for an exercise without the solution
argument-hint: "[exercise number, e.g. 07]"
---

The student wants a hint for exercise $ARGUMENTS (if empty, find the exercise they are
working on from the conversation or ask).

1. Read the exercise file in `src/main/java/dsa/` and the student's current code in it.
2. Check what hints were already given in this conversation.
3. Give exactly ONE hint, one level above the last one, following the hint ladder in
   CLAUDE.md. Do not write the solution. Keep it to a few sentences.
4. End with a question that makes the student think about the next step.
