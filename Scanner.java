
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); //opening a channel

    int number;
    number = scanner.nextInt(); // Waits for us to provide an integer
    System.out.println("This is the provided number: " + number);
    scanner.close(); //closing the channel (important thing for saving resourses)
    //scanner.nextLine(); // Waits for us to provide a string until pressed enter 
  }
}


_________________________

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); //Opening a channel
    System.out.println("Hello!");
    int age; //number = 7
    System.out.println("What is your age?");
    age = scanner.nextInt(); // Waits for us to provide an integer
    System.out.println("The users age is:" + age);

    //
    
    scanner.close(); // Closing the channel
    //scanner.nextLine(); // Waits for us to provide a string until pressed enter 
  }
}

__________________________


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in); //opening a channel
    System.out.println("Write a number: ");
    int a = scanner.nextInt();
    System.out.println("Write an another number: ");
    int b = scanner.nextInt();

    System.out.println("A summ of a nd b: " + (a+b));
    scanner.close(); //closing the channel (important thing for saving resourses)
    //scanner.nextLine(); // Waits for us to provide a string until pressed enter 
    // ask the suer: enter a number to choose an operation: 1 = sum; 2 = deduction; etc.
  }
}
