package dsa.m7_integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import dsa.m7_integration.Ex45Voting.VotingSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class Ex45VotingTest {

    @Test
    void oneVotePerUser() {
        VotingSystem v = new VotingSystem();
        assertTrue(v.vote("u1", "Lia"));
        assertTrue(v.vote("u2", "Max"));
        assertFalse(v.vote("u1", "Max"));
        assertTrue(v.vote("u3", "Max"));
        assertEquals(Map.of("Lia", 1, "Max", 2), v.results());
        assertEquals(List.of("Max"), v.winners());
    }

    @Test
    void resultsSortedByName() {
        VotingSystem v = new VotingSystem();
        v.vote("a", "Zoe");
        v.vote("b", "Ana");
        v.vote("c", "Max");
        assertEquals(List.of("Ana", "Max", "Zoe"), new ArrayList<>(v.results().keySet()));
    }

    @Test
    void tieHasSeveralWinners() {
        VotingSystem v = new VotingSystem();
        v.vote("a", "Zoe");
        v.vote("b", "Ana");
        v.vote("c", "Max");
        v.vote("d", "Zoe");
        v.vote("e", "Ana");
        assertEquals(List.of("Ana", "Zoe"), v.winners());
    }

    @Test
    void noVotes() {
        VotingSystem v = new VotingSystem();
        assertEquals(Map.of(), v.results());
        assertEquals(List.of(), v.winners());
    }
}
