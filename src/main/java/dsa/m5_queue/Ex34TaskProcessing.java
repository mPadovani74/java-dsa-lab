package dsa.m5_queue;

import java.util.List;

/*
 * Exercise 34 - Task processing (round robin)         [Module 5 - Queue - Medium]
 *
 * PROBLEM
 *   A single CPU processes tasks in arrival order, but each task may only run for at
 *   most `quantum` time units per turn. If it does not finish, it goes back to the END
 *   of the queue with its remaining time. This is how operating systems share a CPU.
 *   Return the task names in the order they FINISH.
 *
 * EXAMPLE   quantum = 2
 *   tasks: A(3), B(1), C(4)
 *   A runs 2 (1 left, back to queue) -> B runs 1 (done) -> C runs 2 (2 left)
 *   -> A runs 1 (done) -> C runs 2 (done)
 *   result: [B, A, C]
 *
 *   quantum >= every duration -> plain FIFO order.
 *   A task with duration 0 finishes on its first turn.
 *
 * TOOLBOX
 *   record Task(String name, int duration) {}  - already declared below
 *   Queue<Task> queue = new ArrayDeque<>(tasks);   offer / poll / isEmpty
 *   Records are immutable: to "change" the remaining time, offer a NEW Task.
 *
 * TARGET   Time O(sum(duration) / quantum + n)  -  Space O(n)
 * THEORY   docs/collections/06-queue-priorityqueue.md
 * TEST     ./mvnw test -Dtest=Ex34TaskProcessingTest
 */
public class Ex34TaskProcessing {

    public record Task(String name, int duration) {}

    public static List<String> roundRobin(List<Task> tasks, int quantum) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
