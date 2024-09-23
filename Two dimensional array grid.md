```java
public class Main {
    public static void main(String[] args) { // Main method
        int size = 10;
        int[][] grid = new int[size][size];
        int bombColumn = 1;
        int bombRow = 0;
        // 1 1 1 0 0 0 0 0 0 0
        // 1 5 1 0 0 0 0 0 0 0
        // 1 1 1 0 0 0 0 0 0 0
        // 0 0 0 0 0 0 0 0 0 0
        // .... times 10

        grid[bombRow][bombColumn] = 5; // Center
        if(bombRow != 0) {
            grid[bombRow - 1][bombColumn] = 1; // Top middle
            grid[bombRow - 1][bombColumn - 1] = 1; // top left
            grid[bombRow - 1][bombColumn + 1] = 1; // top right
        }

        grid[bombRow + 1][bombColumn] = 1; // bottom middle
        grid[bombRow + 1][bombColumn - 1] = 1; //bottom left
        grid[bombRow + 1][bombColumn + 1] = 1; //bottom right

        grid[bombRow][bombColumn - 1] = 1; // middle left
        grid[bombRow][bombColumn + 1] = 1; //middle right

        
        printArray(grid, size);
    }

    public static void printArray(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
```java
public class Main {
    public static void main(String[] args) { // Main method
        int size = 10;
        int[][] grid = new int[size][size];
        int bombColumn = 1;
        int bombRow = 9;

        grid[bombRow][bombColumn] = 5; // Center
        if(bombRow != 0) {
            grid[bombRow - 1][bombColumn] = 1; // Top middle
            grid[bombRow - 1][bombColumn - 1] = 1; // top left
            grid[bombRow - 1][bombColumn + 1] = 1; // top right
        }

        if(bombRow != size - 1){
            grid[bombRow + 1][bombColumn] = 1; // bottom middle
            grid[bombRow + 1][bombColumn - 1] = 1; //bottom left
            grid[bombRow + 1][bombColumn + 1] = 1; //bottom right
        }

        grid[bombRow][bombColumn - 1] = 1; // middle left
        grid[bombRow][bombColumn + 1] = 1; //middle right


        printArray(grid, size);
    }

    public static void printArray(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
```java
public class Main {
    public static void main(String[] args) { // Main method
        int size = 10;
        int[][] grid = new int[size][size];
        int bombColumn = 9;
        int bombRow = 1;
        // 1 1 1 0 0 0 0 0 0 0
        // 1 5 1 0 0 0 0 0 0 0
        // 1 1 1 0 0 0 0 0 0 0
        // 0 0 0 0 0 0 0 0 0 0
        // .... times 10

        //grid[bombRow][bombColumn] = 5; // Center
        if(bombRow != 0) {
            grid[bombRow - 1][bombColumn] = 1; // Top middle

            if(bombColumn != 0){
                grid[bombRow - 1][bombColumn - 1] = 1; // top left
            }

            if(bombColumn != size - 1){
                grid[bombRow - 1][bombColumn + 1] = 1; // top right
            }
        }

        if(bombRow != size - 1){
            grid[bombRow + 1][bombColumn] = 1; // bottom middle
            if(bombColumn != 0){
                grid[bombRow + 1][bombColumn - 1] = 1; //bottom left
            }
            if(bombColumn != size - 1){
                grid[bombRow + 1][bombColumn + 1] = 1; //bottom right
            }
            
        }

        if(bombColumn != 0){
            grid[bombRow][bombColumn - 1] = 1; // middle left
        }
        if(bombColumn != size - 1){
            grid[bombRow][bombColumn + 1] = 1; //middle right
        }

        
        printArray(grid, size);
    }

    public static void printArray(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
_______________________________

```java
import java.util.Random;  //random place for a bomb 

public class Main {
    public static void main(String[] args) { // Main method
        int size = 10;
        int[][] grid = new int[size][size];

        Random rand = new Random();
        int bombRow = rand.nextInt(size); // Generate a random row
        int bombColumn = rand.nextInt(size); // Generate a random column

        grid[bombRow][bombColumn] = 5; // Center
        if(bombRow != 0) {
            grid[bombRow - 1][bombColumn] = 1; // Top middle

            if(bombColumn != 0){
                grid[bombRow - 1][bombColumn - 1] = 1; // top left
            }

            if(bombColumn != size - 1){
                grid[bombRow - 1][bombColumn + 1] = 1; // top right
            }
        }

        if(bombRow != size - 1){
            grid[bombRow + 1][bombColumn] = 1; // bottom middle
            if(bombColumn != 0){
                grid[bombRow + 1][bombColumn - 1] = 1; //bottom left
            }
            if(bombColumn != size - 1){
                grid[bombRow + 1][bombColumn + 1] = 1; //bottom right
            }

        }

        if(bombColumn != 0){
            grid[bombRow][bombColumn - 1] = 1; // middle left
        }
        if(bombColumn != size - 1){
            grid[bombRow][bombColumn + 1] = 1; //middle right
        }

        printArray(grid, size);
    }

    public static void printArray(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        int size = 21;
        int[][] grid = new int[size][size];

        // 1
        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j <= i; j++) {
                grid[i][j] = 5;
            }
        }

         // 2
        for (int i = size / 2; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                 grid[i][j] = 5;
            }
        }
        // 1 reverses
        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j <= i; j++) {
                grid[i][size - j - 1] = 5;
            }
        }

        // 2 reverses
        for (int i = size / 2; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                grid[i][size - j - 1] = 5;
            }
        }

        printArray(grid, size);
    }

    public static void printArray(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        int size = 21;
        int[][] grid = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size / 2 - Math.abs(size / 2 - i); j++) {
                grid[i][j] = 5;
                grid[i][size - 1 - j] = 5;
            }
        }

        printArray(grid, size);
    }

    public static void printArray(int[][] array, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
``

