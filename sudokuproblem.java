public class sudokuproblem {

    private static final int N = 9; // Size of the Sudoku grid

    // Check if a given number can be placed in a particular cell
    private static boolean isSafe(int[][] board, int row, int col, int num) {
        // Check if the number exists in the current row or column
        for (int x = 0; x < N; x++) {
            if (board[row][x] == num || board[x][col] == num) {
                return false;
            }
        }

        // Check if the number exists in the current 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }

        return true; // If no conflicts, the number can be placed
    }

    // Solve Sudoku using backtracking
    private static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                // Find an empty cell
                if (board[row][col] == 0) {
                    // Try placing numbers from 1 to 9
                    for (int num = 1; num <= 9; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num; // Place the number
                            if (solveSudoku(board)) { // Recur to solve the rest of the grid
                                return true; // If successful, return true
                            }
                            board[row][col] = 0; // If placement leads to failure, backtrack
                        }
                    }
                    return false; // If no number can be placed, return false
                }
            }
        }
        return true; // If all cells are filled, return true
    }

    // Print the Sudoku grid
    private static void printBoard(int[][] board) {
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
