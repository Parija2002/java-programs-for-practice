public class NQueen {

    private static final int N = 4; // Change N to desired board size

    private static boolean isSafe(int[][] board, int row, int col) {
        // Check if there is a queen in the same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static boolean solveNQueensUtil(int[][] board, int row) {
        if (row == N) {
            // All queens are successfully placed, print the board
            printBoard(board);
            return true;
        }

        boolean res = false;
        for (int col = 0; col < N; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1; // Place queen

                // Recur to place rest of the queens
                res = solveNQueensUtil(board, row + 1) || res;

                // If placing queen in board[row][col] doesn't lead to a solution, then remove queen from board[row][col]
                board[row][col] = 0; // Backtrack
            }
        }

        return res;
    }

    public static void solveNQueens() {
        int[][] board = new int[N][N];

        if (!solveNQueensUtil(board, 0)) {
            System.out.println("Solution does not exist.");
        }
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        solveNQueens();
    }
}
