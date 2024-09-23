```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //arrays may use for string, boolean, int data types.
    
   // int [] arr = {5, 7, 9};
    int[] arr = new int[5];// this creates a nwe array of size 5
    arr[0] = 5;
    arr[1] = 7;
    arr[2] = 9;
    arr[3] = 12;
    arr[4] = 15;
    arr[4] = 115; //rewrite #4=15 to #4=115
    //System.out.println(arr[0]);

    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
   
  }
}
```

```java
//user input

import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int[] arr = new int[5];

    for(int i = 0; i < arr.length; i++){ //[0], [1], [2]
      arr[i] = scanner.nextInt();
    }
    
    for(int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }

  }
}
```
```java

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //

    int[] arr = new int[5]; // We ask the computer to create a closet
    //Where we could put 5 different boxes of a number
    // arr[0] = 5
    // arr[1] = 8
    // arr[2] = 13
    // arr[3] = 54
    // arr[4] = 80

    for (int i = 0; i < arr.length; i++) { // 0 ... 1 -> 4
      //int number = scanner.nextInt();
      //arr[4] = scanner.nextInt();
      arr[i] = scanner.nextInt(); // 80

    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    scanner.close();//
  }
}
```
____________________________

1. Easy -> Initialize a string array and try to input and output data
 We want to define an array city names.
 We want to add values to it (could be through the scanner, or just writing 

```java

arr[0] = "Riga";
```java
arr[0] = scanner.nextLine();

//user input

import java.util.Scanner; 
public class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
  
    String[] cities = new String[5];
    System.out.print("Enter the names of 5 cities. ");
    
    for(int i = 0; i < 5; i++){
      System.out.print("City " + (i+1) + ": ");
        cities[i] = scanner.nextLine();
    }

    for(int i = 0; i < 5; i++){
      System.out.println(cities[i]);
    }
     scanner.close(); 
  }
}
```


2. Challenging -> Find the largest number in the array and find the smallest number in the array

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list = new int[5];
        System.out.print("Enter 5 numbers. ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            list[i] = scanner.nextInt();
        }

        // Finding the largest and the smallest numbers
        int minNumber = list[0];
        int maxNumber = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < minNumber) {
              minNumber = list[i];
            }
            if (list[i] > maxNumber) {
               maxNumber = list[i];
            }
        }

        System.out.println("\nSmallest number of array is: " + minNumber);
        System.out.println("Largest number of array is: " + maxNumber);

        scanner.close();
    }
}
```

______________________var2_____________

/*
A step by step solution to the largest number (I will give hints only for largest number, but the solution for both are the same)

1.Define an int array that is x amounts large
 1.1. Put values in the array 

2.Define an int variable called maxNumber, this is where we store the value of largest number
 2.1. The value of maxNumber should be the first value of the array

3.Go through the array with a loop
 3.1. If the i number is bigger than the maxNumber, we need to change the value of maxNumber to i
 3.2. Repeat  3.1. on the next cycle until the end of the array
Print out - "Largest number of array is " + maxNumber 
*/

```java
public class Main {
  public static void main(String[] args) {

    int[] numbers = new int[5]; // int[] numbers = {1, 7, 3, -2, 100};
    numbers[0] = 1;
    numbers[1] = 7;
    numbers[2] = 3;
    numbers[3] = -2;
    numbers[4] = 100;
    int maxNumber = numbers[0]; // 1 > 1 ... 7 > 1 ... 3 > 7 .... ... 100 > 7
    //1st cycle -> maxNumber is 1
    //2nd cycle -> maxNumber is 7
    //3rd cycle -> maxNumber is 7
    //...
    //5th cycle -> maxNumber is 100
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] > maxNumber){
        maxNumber = numbers[i];
      }
    }
    System.out.println("Largest number of array is " + maxNumber);
  }
}
```
_____________________var3__________

```java
public class Main {
  public static void main(String[] args) {

    int[] numbers = new int[5];
    numbers[0] = 1;
    numbers[1] = 7;
    numbers[2] = 3;
    numbers[3] = -2;
    numbers[4] = 100;

    int maxNumber = numbers[0]; // maxNumber = 1

    if (numbers[0] > maxNumber){ // If 1 > 1
      maxNumber = numbers[0];
    }

    if (numbers[1] > maxNumber){ // If 7 > 1
      maxNumber = numbers[1];
    }

    if(numbers[2] > maxNumber){ // If 3 > 7
      maxNumber = numbers[2];
    }

    if(numbers[3] > maxNumber){// If -2 > 7
      maxNumber = numbers[3];
    }

    if(numbers[4] > maxNumber){ // If 100 > 7
      maxNumber = numbers[4];
    }

    System.out.println("Largest number of array is " + maxNumber);
    
  }
}
```
