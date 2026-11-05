package dsa.m2_set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Ex18ValidSudokuTest {

    private static char[][] board(String... rows) {
        char[][] b = new char[9][];
        for (int i = 0; i < 9; i++) {
            b[i] = rows[i].toCharArray();
        }
        return b;
    }

    private static char[][] valid() {
        return board(
            "53..7....",
            "6..195...",
            ".98....6.",
            "8...6...3",
            "4..8.3..1",
            "7...2...6",
            ".6....28.",
            "...419..5",
            "....8..79");
    }

    @Test
    void validBoard() {
        assertTrue(Ex18ValidSudoku.isValidSudoku(valid()));
    }

    @Test
    void emptyBoardIsValid() {
        String e = ".........";
        assertTrue(Ex18ValidSudoku.isValidSudoku(board(e, e, e, e, e, e, e, e, e)));
    }

    @Test
    void repeatedInRow() {
        char[][] b = valid();
        b[0][8] = '5';
        assertFalse(Ex18ValidSudoku.isValidSudoku(b));
    }

    @Test
    void repeatedInColumn() {
        char[][] b = valid();
        b[8][0] = '5';
        assertFalse(Ex18ValidSudoku.isValidSudoku(b));
    }

    @Test
    void repeatedInBoxOnly() {
        // 8 at (1,1) clashes with the 8 at (2,2): same box, different row and column.
        char[][] b = valid();
        b[1][1] = '8';
        assertFalse(Ex18ValidSudoku.isValidSudoku(b));
    }
}
