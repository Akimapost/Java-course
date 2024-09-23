```java
// Initialize ArrayList
// Create an element in the arraylist
// REmove the element
// Get the element

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // ArrayList<String> shopsItems = new ArrayList<String>();
    var shopsItems = new ArrayList<String>();

    // Initializes an ArrayList, creates a new object and gives a reference
    var scanner = new Scanner(System.in);
    while (true) {
      var item = scanner.nextLine();
      if (item.equals("exit")) {
        break;
      }
      addItem(shopsItems, item);
    }

    printArrayList(shopsItems);
  }

  public static void printArrayList(ArrayList<String> items) {
    // for (VariableType nameOfArgument : nameOfArrayList)
    for (String item : items) {
      System.out.println(item);
    }
  }

  public static void addItem(ArrayList<String> items, String item) {
    items.add(item);
    System.out.println(item + " has been added to the store.");
  }
}
```
```java

  import java.util.ArrayList;
  import java.util.stream.Collectors;
  import java.util.Scanner;

  public class Main {
      // shopsItems here
      public static void main(String[] args) {
          var shopsItems = new ArrayList<String>();
          // Initializes an ArrayList, creates a new object and gives a reference
          var scanner = new Scanner(System.in);
          // These 2 lines in a function
          while (true) {
              var item = scanner.nextLine(); // Asks the user for input

              if(item.equals("exit")){
                  break;
              }

              addItem(shopsItems, item);
          }

          printArrayList(shopsItems);
      }

      public static void printArrayList(ArrayList<String> items) {
          System.out.println("Store has these items:");
          for (String item : items) {
              System.out.println(item);
          }
      }

      public static void addItem(ArrayList<String> shopsItems, String item) {
          shopsItems.add(item); // adds the item to the shopsItems arrayList
          System.out.println(item + " has been added to the store"); // Provide information to the user
      }
  }

  // Initialize ArrayList
  // Create an element in the arrayList
  // Remove an element
  // Get the elements
```
```java
// itemToRemove

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    // shopsItems here
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        // Initializes an ArrayList, creates a new object and gives a reference
        var scanner = new Scanner(System.in);
        // These 2 lines in a function
        while (true) {
            System.out.println("Enter the item you want to add to the list or type exit to stop: ");
            var item = scanner.nextLine(); // Asks the user for input

            if(item.equals("exit")){
                break;
            }
            
            addItem(shopsItems, item);
        }

        printArrayList(shopsItems);
        
        System.out.println("Enter the item you want to remove from the list:");
        var itemToRemove = scanner.nextLine(); // Asks the user for input
        shopsItems.removeIf(item -> item.equals(itemToRemove));

        printArrayList(shopsItems);
    }

    public static void printArrayList(ArrayList<String> items) {
        System.out.println("Store has these items:");
        for (String item : items) {
            System.out.println(item);
        }
    }

    public static void addItem(ArrayList<String> shopsItems, String item) {
        shopsItems.add(item); // adds the item to the shopsItems arrayList
        System.out.println(item + " has been added to the store"); // Provide information to the user
    }
}

// Initialize ArrayList
// Create an element in the arrayList
// Remove an element
// Get the elements
```
```java
// Filtering
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    // shopsItems here
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        // Initializes an ArrayList, creates a new object and gives a reference
        var scanner = new Scanner(System.in);
        // These 2 lines in a function
        while (true) {
            System.out.println("Enter the item you want to add to the list or type exit to stop: ");
            var item = scanner.nextLine(); // Asks the user for input

            if(item.equals("exit")){
                break;
            }

            addItem(shopsItems, item);
        }

        printArrayList(shopsItems);

        System.out.println("Enter the item you want to remove from the list:");
        var itemToRemove = scanner.nextLine(); // Asks the user for input
        shopsItems.removeIf(item -> item.equals(itemToRemove));

        printArrayList(shopsItems);

        var filteredArrayList = new ArrayList<String>();
        for (String item: shopsItems){
//if the length of the item is less or equal to 5 characters, it will be added to the filteredArrayList
            if(item.length() <= 5){
                filteredArrayList.add(item);
            }
        }
        printArrayList(filteredArrayList);
    }

    public static void printArrayList(ArrayList<String> items) {
        System.out.println("Store has these items:");
        for (String item : items) {
            System.out.println(item);
        }
    }

    public static void addItem(ArrayList<String> shopsItems, String item) {
        shopsItems.add(item); // adds the item to the shopsItems arrayList
        System.out.println(item + " has been added to the store"); // Provide information to the user
    }
}

// Initialize ArrayList
// Create an element in the arrayList
// Remove an element
// Get the elements
```
___________________

```java
/*
Easy: Create an arrayList for integers
Add 5 numbers.
Filter the arrayList and print out only numbers that divide by 2  (number % 2 == 0)
*/

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 5 numbers
        System.out.println("Please enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            addNumber(numbers, number);
        }

        // Filter only numbers that divide by 2 
        var filteredArrayList = new ArrayList<Integer>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                filteredArrayList.add(number);
            }
        }

        // Print the filtered list
        System.out.println("Even numbers in the list:");
        printArrayList(filteredArrayList);

        scanner.close();
    }

    // Method to add a number to the list
    public static void addNumber(ArrayList<Integer> numbers, int number) {
        numbers.add(number); // adds number to the ArrayList
        System.out.println(number + " has been added to the array"); // Provide information to the user
    }

    // Method to print the ArrayList
    public static void printArrayList(ArrayList<Integer> list) {
        for (int number : list) {
            System.out.println(number);
        }
    }
}
```
```java
/*
Medium: Put 100 random numbers in arrayList
Filter the arrayList and print out only numbers that divide by 2  (number % 2 == 0)
*/

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Random random = new Random();

        // Fill the ArrayList with 100 random numbers
        System.out.println("Generating 100 random numbers:");
        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(100); 
            numbers.add(number);
        }

        // Filter numbers that divide by 2 
        var filteredArrayList = new ArrayList<Integer>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                filteredArrayList.add(number);
            }
        }

        // Print the filtered list
        System.out.println("Even numbers in the list:");
        printArrayList(filteredArrayList);
    }

    // Method to print the ArrayList
    public static void printArrayList(ArrayList<Integer> list) {
        for (int number : list) {
            System.out.println(number);
        }
    }
}
```



