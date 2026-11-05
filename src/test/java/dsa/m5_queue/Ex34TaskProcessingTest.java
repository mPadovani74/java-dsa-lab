package dsa.m5_queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dsa.m5_queue.Ex34TaskProcessing.Task;
import java.util.List;
import org.junit.jupiter.api.Test;

class Ex34TaskProcessingTest {

    @Test
    void roundRobin() {
        List<Task> tasks = List.of(new Task("A", 3), new Task("B", 1), new Task("C", 4));
        assertEquals(List.of("B", "A", "C"), Ex34TaskProcessing.roundRobin(tasks, 2));
    }

    @Test
    void bigQuantumIsPlainFifo() {
        List<Task> tasks = List.of(new Task("A", 3), new Task("B", 1), new Task("C", 4));
        assertEquals(List.of("A", "B", "C"), Ex34TaskProcessing.roundRobin(tasks, 10));
    }

    @Test
    void quantumOfOne() {
        List<Task> tasks = List.of(new Task("A", 2), new Task("B", 3), new Task("C", 1));
        // t1 A(1 left) t2 B(2) t3 C done t4 A done t5 B(1) t6 B done
        assertEquals(List.of("C", "A", "B"), Ex34TaskProcessing.roundRobin(tasks, 1));
    }

    @Test
    void zeroDurationFinishesOnFirstTurn() {
        List<Task> tasks = List.of(new Task("A", 5), new Task("B", 0));
        assertEquals(List.of("B", "A"), Ex34TaskProcessing.roundRobin(tasks, 2));
    }

    @Test
    void noTasks() {
        assertEquals(List.of(), Ex34TaskProcessing.roundRobin(List.of(), 3));
    }
}
