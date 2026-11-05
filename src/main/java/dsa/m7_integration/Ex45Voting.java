package dsa.m7_integration;

import java.util.List;
import java.util.Map;

/*
 * Exercise 45 - Voting system                         [Module 7 - Integration - Medium]
 *
 * PROBLEM
 *   - vote(userId, candidate)   register a vote. Each user votes ONCE: a second vote from
 *                               the same user is rejected (return false, nothing changes).
 *   - results()                 candidate -> votes, sorted by candidate name
 *   - winners()                 candidate(s) with the most votes, sorted by name
 *                               (more than one on a tie; empty list if no votes)
 *
 * EXAMPLE
 *   vote("u1", "Lia") -> true;  vote("u2", "Max") -> true
 *   vote("u1", "Max") -> false  (u1 already voted)
 *   vote("u3", "Max") -> true
 *   results() -> {Lia=1, Max=2};  winners() -> ["Max"]
 *
 * DESIGN   You need to answer "did this user vote already?" fast and keep counts in name
 *          order. Two different structures, each doing one job.
 *
 * THEORY   docs/collections/03-hashset.md, docs/collections/04-treemap-treeset.md
 * TEST     ./mvnw test -Dtest=Ex45VotingTest
 */
public class Ex45Voting {

    public static class VotingSystem {

        // TODO: which fields do you need?

        public boolean vote(String userId, String candidate) {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public Map<String, Integer> results() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }

        public List<String> winners() {
            // TODO
            throw new UnsupportedOperationException("TODO");
        }
    }
}
