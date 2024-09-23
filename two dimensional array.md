```java
//two dimensional array 

int[][] array = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for(int i = 0; i < array.length; i++){
    //array[0] = {1, 2, 3}
    //array[0].length = 3
    int[] row = array[i]; // {1, 2, 3} OR {4, 5, 6} OR, {7, 8, 9}
    for(int j = 0; j < row.length; j++){
        System.out.print(row[j]); //PROCESSING ROWS HERE
      }
      System.out.println(); //goes from a new line to a new row 
    }
}  
```
```java

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            int[] row = array[i];
            for (int j = 0; j < row.length; j++) {
                row[j] = i; // print indexes for every row
            }
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
            System.out.println("----------");
        }
    }
}
```
```java

  public class Main {
      public static void main(String[] args) {
          int[][] array = new int[10][10];

          for (int i = 0; i < array.length; i++) {
              int[] row = array[i];
              for (int j = 0; j < row.length; j++) {
                  row[j] = i*j;
              }
          }

          for(int i = 0; i < array.length; i++){
              for(int j = 0; j < array[i].length; j++){
                  if(array[i][j] < 10){
                      System.out.print(array[i][j] + "  ");
                  }
                  else{
                      System.out.print(array[i][j] + " ");
                  }
              }
              System.out.println();
          }
      }
  }
```
```java
// Easy: Fill the 5x5 array with numbers from 1 to 25
//1 2 3 4 5
//6 7 8 9 10
//...
//But you have to use for loop to fill it up automatically.
public class Main {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int count = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count;
                count++;
                if(array[i][j] < 10){
                    System.out.print(array[i][j] + "  ");
                }
                else{
                    System.out.print(array[i][j] + " "); // Print the element of the array
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
```
```java
/*
Easy: Fill the array with random digits from 0 to 9
*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10); // Generates random number between 0 and 9
               System.out.print(array[i][j] + " ");
            }
           System.out.println();
        }

    }
}
```

```java
/*
Medium: 
1. Fill up every second row with value 1
2. Fill up every second column with value 1
*/

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 1 || j % 2 == 1) {
                    array[i][j] = 1;
                }
                if (array[i][j] == 0) {
                System.out.print(" ");
              } else {
                System.out.print(array[i][j]);
                }
            }
            System.out.println();
        }
    }
}
```
```java
/*Hard: 
1. Hide a number 10 in the array somewhere
2. Do not print out the values immediately
3. ask the user for the row and column and then tell them the value that was found
4. Make them repeat until they find 10*/


import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      int[][] array = new int[5][5];
      array[1][3] = 10;
    System.out.println("Welcome to the game! Try to find the number 10 hidden in the array!");
      Scanner scanner = new Scanner(System.in);
      boolean found = false;
      while (!found) {
        System.out.println("Guess the row (1-5): ");
          int rowGuess = scanner.nextInt() - 1; 
        System.out.println("Guess the column (1-5): ");
          int columnGuess = scanner.nextInt() - 1; 
          if (rowGuess >= 0 && rowGuess < 5 && columnGuess >= 0 && columnGuess < 5) {
              if (array[rowGuess][columnGuess] == 10) {
                found = true;
          System.out.println("Congratulations! You found the number 10 at row " + (rowGuess + 1) + ", column " + (columnGuess + 1));
              } else {
                System.out.println("Sorry, try again!");
              }
          } else {
            System.out.println("Invalid input! Please enter row and column values between 1 and 5.");
          }
      }
    scanner.close();
    }
}
```
