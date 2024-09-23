import java.util.Scanner;

public class Main {

    public static String[][] grid = new String[3][3];
    public static int row, col;
    public static Scanner scan = new Scanner(System.in);
    public static String currentTurn = "X";

    public static void main(String[] args) {
        welcome();
        createGrid();
        printGrid();

        while (!checkWin() && !checkDraw()) {
            playerMove();
            printGrid();
            if (checkWin()) {
                System.out.println("Player " + currentTurn + " wins!");
                return;
            }
            if (checkDraw()) {
                System.out.println("Draw");
                return;
            }
            switchTurn();
        }
        System.out.println();
    }

    public static void welcome() {
        System.out.println("Welcome to Tic Tac Toe game!");
    }

    public static void createGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = "-";
            }
        }
    }

    public static void printGrid() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(grid[i][j] + " | ");
            }
        }
        System.out.println();
    }

    public static void playerMove() {
        System.out.println();
        System.out.println("Player " + currentTurn + ", please enter your coordinates for your location row (1-3) and column (1-3): ");
        while (true) {
            row = scan.nextInt() - 1;
            col = scan.nextInt() - 1;
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && grid[row][col].equals("-")) {
                grid[row][col] = currentTurn;
                break;
            } else {
                System.out.println("Invalid entry. Please go again.");
            }
        }
    }

    public static void switchTurn() {
        if (currentTurn.equals("X")) {
            currentTurn = "O";
        } else {
            currentTurn = "X";
        }
    }

    public static boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if ((!grid[i][0].equals("-") && grid[i][0].equals(grid[i][1]) && grid[i][0].equals(grid[i][2])) || 
                (!grid[0][i].equals("-") && grid[0][i].equals(grid[1][i]) && grid[0][i].equals(grid[2][i]))) {
                return true;
            }
        }
        if ((!grid[0][0].equals("-") && grid[0][0].equals(grid[1][1]) && grid[0][0].equals(grid[2][2])) || 
            (!grid[0][2].equals("-") && grid[0][2].equals(grid[1][1]) && grid[0][2].equals(grid[2][0]))) {
            return true;
        }
        return false;
    }

    public static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }
}

