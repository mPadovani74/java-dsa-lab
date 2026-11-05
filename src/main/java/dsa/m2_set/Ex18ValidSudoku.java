package dsa.m2_set;

/*
 * Exercise 18 - Valid Sudoku                          [Module 2 - Set - Medium]
 *
 * PROBLEM
 *   Given a 9x9 board, return true if no digit 1-9 repeats in any row, any column or
 *   any of the nine 3x3 boxes. Empty cells are '.'. The board does NOT need to be
 *   solvable - only check the digits that are already there.
 *
 * EXAMPLE
 *   board[0] = {'5','3','.','.','7','.','.','.','.'}
 *   board[1] = {'6','.','.','1','9','5','.','.','.'}  ...   -> true
 *   Put a second '5' anywhere in row 0                    -> false
 *
 * TOOLBOX
 *   char[][] board, board[r][c]
 *   Set<Character>[] or List<Set<Character>>  - one set per row / column / box
 *   Box index of a cell: (r / 3) * 3 + (c / 3)       (integer division)
 *   Alternative: ONE Set<String> with keys like "5 in row 0", "5 in col 3", "5 in box 1"
 *
 * TARGET   Time O(81) = O(1)  -  Space O(1)
 * THEORY   docs/collections/03-hashset.md
 * TEST     ./mvnw test -Dtest=Ex18ValidSudokuTest
 */
public class Ex18ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        // TODO
        throw new UnsupportedOperationException("TODO");
    }
}
