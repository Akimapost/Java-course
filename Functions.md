```java
/* Easy:

1. Create a function that returns smallest number of 2 numbers.
For example:
User provides 5
User provides 7
Function returns 5
Main function prints out:
5 is the smallest number
*/

import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please, enter number1: ");
    int number1 = scanner.nextInt();

    System.out.print("Please, enter number2: ");
    int number2 = scanner.nextInt();

    int result = minNumber(number1, number2);
    System.out.println("The smallest number is " + result);
    scanner.close();
  }

public static int minNumber(int a, int b){
    if (a < b)
      return a;
    else
      return b;
  }
}
```
```java
/* 
2. Create a function that returns a multiplication of 3 different numbers
For example: 
User provides 5
User provides 7
User provides 3

Function returns 105
Main function prints out 105
*/

import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please, enter number1: ");
      int number1 = scanner.nextInt();
    
    System.out.print("Please, enter number2: ");
      int number2 = scanner.nextInt();

    System.out.print("Please, enter number3: ");
      int number3 = scanner.nextInt();

    int result = multip(number1, number2, number3);
    System.out.println("The multiplication of 3 numbers is " + result);
    
    scanner.close();
  }
  
public static int multip(int a, int b, int c){
      return a*b*c;
  }
}
```
_____________var2_______________

```java
/* 
2. Create a function that returns a multiplication of 3 different numbers
For example: 
User provides 5
User provides 7
User provides 3

Function returns 105
Main function prints out 105
*/

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 
      int[] numbers = getNumbers(scanner);
      int result = multip(numbers[0], numbers[1], numbers[2]);
    System.out.println("The multiplication of 3 numbers is " + result);

      scanner.close();
  }

  public static int[] getNumbers(Scanner scanner) {
    int[] numbers = new int[3];

    for (int i = 0; i < 3; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      numbers[i] = scanner.nextInt();
    }

    return numbers;
  }

  public static int multip(int a, int b, int c) {
    return a * b * c;
  }
}
```
```java
/* 
3. Create a function that returns a combination of first name and last name
User provides "Oskars"
User provides "Klaumanis"

Function receives both of the names and returns "Oskars Klaumanis"
Main function prints out the result
*/

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Please, enter first name: ");
    String firstName = scanner.nextLine();

    System.out.print("Please, enter last name: ");
    String lastName = scanner.nextLine();

    String fullName = fullName(firstName, lastName);
    System.out.println("The full name of user is " + fullName);
    
    scanner.close();
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName; 
  }
}
```
```java
/*
medium:
1. Parent simulator, a user provides a number (average grade) to the program, and if it's above 8, then parents go hooray, else they go sad

User creates 3 functions
    1. Function called hooraay(), is a void, and returns nothing. It's only job is to print out "Hooray" in the console
    2. Function called sad(), is a void, and returns nothing. It's only job is to print out "Sad" in the console
    2. Function is called CheckGrades and receives int as value, but returns nothing. It's job is to call hooray() function, if the grade that it received is above 8, and call sad() function, if the grades received is less than 8
*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please, enter a number: ");
    int number = scanner.nextInt();
    CheckGrades(number);
    scanner.close();
    }
  
    public static void hooray(){
    System.out.print("Parents say: Hoorray!");
  }
  public static void sad(){
    System.out.print("Parents go sad");
  }

  public static void CheckGrades(int number){
  if(number >= 8){
    hooray();
  }else{
    sad();
  }
}}
```
```java
/*
Hard:
Guess the Number Game
Generate a random number from 0 to 100
Make the user guess the number. If it's too high, or too low, let the user know
OPTIONAL: Give maximum of 6 guesses.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = 58;

        int attempts = 0;

        while ((attempts = attempts + 1) < 6) { // Increment attempts and then check if it's less than 6
            System.out.println("Please guess a number!");
            int guess = scanner.nextInt();
            checkGuess(guess, target);

            if (target == guess) {
              break;
            }
        }
      if (attempts >= 6) {
          System.out.println("Sorry, you've reached the maximum number of guesses. The correct number was: " + target);
      }

          scanner.close();
      }
       public static void checkGuess(int guess, int target) {
              if (guess == target) {
                  System.out.println("Good job, you guessed correctly");
              } else if (guess < target) {
                  System.out.println("Sorry, the number is too small.");
              } else {
                  System.out.println("Sorry, the number is too big.");
              }
          }
      }
```


