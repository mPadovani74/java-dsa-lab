package dsa.m1_hashmap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;

class Ex08GroupAnagramsTest {

    // Order of groups and inside groups does not matter: sort everything before comparing.
    private static List<List<String>> normalize(List<List<String>> groups) {
        List<List<String>> result = new ArrayList<>();
        for (List<String> g : groups) {
            List<String> copy = new ArrayList<>(g);
            copy.sort(null);
            result.add(copy);
        }
        result.sort(Comparator.comparing(List::toString));
        return result;
    }

    @Test
    void groupsAnagrams() {
        List<List<String>> expected = List.of(List.of("eat", "tea", "ate"), List.of("tan", "nat"), List.of("bat"));
        assertEquals(normalize(expected),
            normalize(Ex08GroupAnagrams.groupAnagrams(List.of("eat", "tea", "tan", "ate", "nat", "bat"))));
    }

    @Test
    void emptyList() {
        assertEquals(List.of(), Ex08GroupAnagrams.groupAnagrams(List.of()));
    }

    @Test
    void emptyWord() {
        assertEquals(List.of(List.of("")), normalize(Ex08GroupAnagrams.groupAnagrams(List.of(""))));
    }

    @Test
    void repeatedWordsStayInTheSameGroup() {
        assertEquals(normalize(List.of(List.of("ab", "ba", "ab"), List.of("c"))),
            normalize(Ex08GroupAnagrams.groupAnagrams(List.of("ab", "c", "ba", "ab"))));
    }
}
