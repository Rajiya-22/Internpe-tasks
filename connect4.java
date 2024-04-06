package mccp;
import java.util.*;

public class connect4 {
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveWon(char[][] board, char player) {
        // Check horizontal
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col <= board[row].length - 4; col++) {
                if (board[row][col] == player && board[row][col + 1] == player &&
                    board[row][col + 2] == player && board[row][col + 3] == player) {
                    return true;
                }
            }
        }
        // Check vertical
        for (int col = 0; col < board[0].length; col++) {
            for (int row = 0; row <= board.length - 4; row++) {
                if (board[row][col] == player && board[row + 1][col] == player &&
                    board[row + 2][col] == player && board[row + 3][col] == player) {
                    return true;
                }
            }
        }
        // Check diagonals (left to right)
        for (int row = 0; row <= board.length - 4; row++) {
            for (int col = 0; col <= board[row].length - 4; col++) {
                if (board[row][col] == player && board[row + 1][col + 1] == player &&
                    board[row + 2][col + 2] == player && board[row + 3][col + 3] == player) {
                    return true;
                }
            }
        }
        // Check diagonals (right to left)
        for (int row = 0; row <= board.length - 4; row++) {
            for (int col = 3; col < board[row].length; col++) {
                if (board[row][col] == player && board[row + 1][col - 1] == player &&
                    board[row + 2][col - 2] == player && board[row + 3][col - 3] == player) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isValid(int row, int col) {
        return (row >= 0 && row < 6 && col >= 0 && col < 7);
    }

    public static boolean isColumnFull(int col, char[][] board) {
        return (board[0][col] != ' ');
    }

    public static void main(String[] args) {
        char[][] board = new char[6][7];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        char currentPlayer = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + " enter column (0-6): ");
            int column = scanner.nextInt();

            if (isColumnFull(column, board)) {
                System.out.println("Column is full. Please choose another column.");
                continue;
            }

            for (int i = 5; i >= 0; i--) {
                if (board[i][column] == ' ') {
                    board[i][column] = currentPlayer;
                    break;
                }
            }
            if (haveWon(board, currentPlayer)) {
                System.out.println("Player " + currentPlayer + " wins!");
                printBoard(board);
                gameOver = true;
            } else if (!Arrays.deepToString(board).contains(" ")) {
                System.out.println("It's a draw!");
                gameOver = true;
            } else {
                currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            }
        }
        scanner.close();
    }
}
