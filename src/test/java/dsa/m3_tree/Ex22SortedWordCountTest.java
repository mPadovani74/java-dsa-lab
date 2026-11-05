package dsa.m3_tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;

class Ex22SortedWordCountTest {

    @Test
    void countsAlphabetically() {
        TreeMap<String, Integer> c = Ex22SortedWordCount.count(new String[] {"grape", "banana", "grape", "avocado"});
        assertEquals("{avocado=1, banana=1, grape=2}", c.toString());
        assertEquals(List.of("avocado: 1", "banana: 1", "grape: 2"), Ex22SortedWordCount.format(c));
    }

    @Test
    void ignoresCaseAndSpaces() {
        assertEquals("{banana=1, grape=3}",
            Ex22SortedWordCount.count(new String[] {"Grape", " grape ", "GRAPE", "Banana"}).toString());
    }

    @Test
    void ignoresBlankWords() {
        assertEquals("{kiwi=1}", Ex22SortedWordCount.count(new String[] {"", "  ", "kiwi"}).toString());
    }

    @Test
    void empty() {
        assertEquals(Map.of(), Ex22SortedWordCount.count(new String[] {}));
        assertEquals(List.of(), Ex22SortedWordCount.format(new TreeMap<>()));
    }

    @Test
    void alphabeticalNotArrivalOrder() {
        assertEquals("{apple=2, pineapple=1, zebra=1}",
            Ex22SortedWordCount.count(new String[] {"zebra", "apple", "pineapple", "Apple"}).toString());
    }
}
