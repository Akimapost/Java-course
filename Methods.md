```java
//method == function
//!linear

//Access modifiers:
//public
//private
//protected

//Whether or not the function is static:
//static
//

//Return type:
//void
//int
//String
//int[]
//boolean
//... ...

public class Main {

  public static void main(String[] args) {
    printOutABorder();

    System.out.println("Hello world!");
    int number = getARandomNumber();
    System.out.println(number);
    printOutABorder();
  }


  public static void printOutABorder() {
    //Function starts here
    System.out.println("=====================");
    //Function ends here
  }

  public static int getARandomNumber() {
    //Function starts here
    return 5;
    //Function ends here
  }
}

// void == returns nothing; this is just an action 
```

```java
/*
Write a name and check whether or not it is at-least 3 char long
Write a surname and check whether or not it is at-least 3 char long
If it's not, then say. Sorry, your name is too short.
If both of them are valid, say. Thank you, your information has been registered!
*/

public class Main{
  public static void main(String[] args){

    String name = "a";
    String surname = "Klaumanis";
    boolean isUserNameValid = isNameValid(name); // Give the function "Oskars" as an argument
    //Because Oskars is longer than 3, isUserNameValid = true
    
    boolean isUserSurnameValid = isNameValid(surname); // Give the function "Klaumanis" as an argument
    //Because Klaumanis is longer than 3, isUserSurnameValid = true

    if(isUserNameValid && isUserSurnameValid){
      System.out.println("Thank you, your information has been registered!");
    } else {
      System.out.println("Sorry, your check your information");
    }
    
  }

  public static boolean isNameValid(String name){ //name == "Klaumanis"
    if(name.length() < 3){ //Checking whether or not "Klaumanis" length is less than 3
      System.out.println("Sorry, your name is too short.");
      return false;
    }

    return true; //Because "Klaumanis" length is more than 3, we return true
  }
}
```
```java
Easy:

/*
Sum of 2 numbers
User provides 2 numbers
Result is a sum of those numbers

Example: 
User inputs 5
User inputs 6
Result: 11
*/

import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Plese, enter number1: ");
    int number1 = scanner.nextInt();

    System.out.print("Plese, enter number2: ");
    int number2 = scanner.nextInt();


    int result = sum(number1, number2);
    System.out.println("Result: " + result);
    scanner.close();
  }
  

  public static int sum (int number1, int number2) {
    return number1 + number2;
  }
}
```


Hard:
1. Create a program, where user can provide a title and a small text below the title.
Title should be wrapped with ====== at top and bottom, based on the title length.
Example: 
System asks for title and user provides "WoTech and Java is easy"
System asks for description and user provides "I have been learning Java for 6 weeks now."

Result: 

=======================

WoTech and Java is easy

=======================

I have been learning Java for 6 weeks now.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a title: ");
        String title = scanner.nextLine();

        System.out.print("Enter a description: ");
        String description = scanner.nextLine();

        printOutABorder(title.length());
        System.out.println(title);
        printOutABorder(title.length());
        System.out.println(description);

        scanner.close();
    }

    public static void printOutABorder(int titleLength) {
        for (int i = 0; i < titleLength; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
```
