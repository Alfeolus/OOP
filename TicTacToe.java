import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static final char EMPTY = '-';

    public static void main(String[] args) {
        initializeBoard();
        Scanner scanner = new Scanner(System.in);
        boolean playerOneTurn = true;

        while (true) {
            printBoard();
            System.out.print((playerOneTurn ? "Player 1 (O) move: " : "Player 2 (X) move: "));
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (isValidMove(x, y)) {
                board[x][y] = playerOneTurn ? 'O' : 'X';
                if (checkWin(playerOneTurn ? 'O' : 'X')) {
                    printBoard();
                    System.out.println((playerOneTurn ? "Player 1 (O) wins!" : "Player 2 (X) wins!"));
                    break;
                }
                if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    break;
                }
                playerOneTurn = !playerOneTurn;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void printBoard() {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(int x, int y) {
        return x >= 0 && x < 3 && y >= 0 && y < 3 && board[x][y] == EMPTY;
    }

    private static boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) return true;
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) return true;
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) return true;
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) return true;
        return false;
    }

    private static boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == EMPTY) return false;
            }
        }
        return true;
    }
}
