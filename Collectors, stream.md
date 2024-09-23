```java
// Collectors: java.util.stream.Collectors

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        shopsItems.add("Glass table");        
        shopsItems.add("Wooden table");
        shopsItems.add("Round table");
        shopsItems.add("Doors");
        shopsItems.add("Trapdoor");
        shopsItems.add("Couch");
        shopsItems.add("Bed");
        shopsItems.add("Sofa");

        var filteredShopsItems = new ArrayList<String>();
        for(var item: shopsItems){
            if(item.contains("table")){
                filteredShopsItems.add(item);
            }
        }
        System.out.println(filteredShopsItems);
    }
}
```
```java
// Streams

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var shopsItems = new ArrayList<String>();
        shopsItems.add("Glass table");        
        shopsItems.add("Wooden table");
        shopsItems.add("Round table");
        shopsItems.add("Doors");
        shopsItems.add("Trapdoor");
        shopsItems.add("Couch");
        shopsItems.add("Bed");
        shopsItems.add("Sofa");

      var filteredShopsItems = shopsItems
        .stream()
        .filter(item -> item.contains("table")) //if true, item will be returned; searching field
        .collect(Collectors.toList());
        System.out.println(filteredShopsItems);
    }
}
```
```java
/*
      var filteredShopsItems = shopsItems
        .stream()
        // HERE we can do actions: 
        // .skip(3) 
        // .limit(2)
        // .filter(item -> item.contains("table"))
 	// .forEach(x -> System.out.println("Test " + x))
 	.collect(Collectors.toList());

        System.out.println(filteredShopsItems);

*/

/*
        shopsItems
                .stream()
                .filter(x -> x.contains("table")) //if x (items) contains "table"...
                .forEach(x -> Print("TEST " + x)); //so print...
    }
      public static void Print(String text) {
        System.out.println();
        System.out.println(text);
      }
}
*/
```
```java
/*
Easy: Create an integer ArrayList, skip the first 5 numbers. And then with the rest of them, print them out.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter 10 numbers
        System.out.println("Please enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            addNumber(numbers, number);
        }

        // Skip the first 5 numbers and print the rest
        numbers
          .stream()
          .skip(5)
          .forEach(x -> Print(x));

        scanner.close();
    }

    // Method to add a number to the list
    public static void addNumber(ArrayList<Integer> numbers, int number) {
        numbers.add(number); // adds number to the ArrayList
        System.out.println(number + " has been added to the array"); // Provide information to the user
    }

    // Method to print the number
    public static void Print(Integer number) {
        System.out.println(number);
    }
}
```
```java
/*
Medium: Create an integer ArrayList, make sure they divide by 2, skip the first 5, limit to three and print them out from another function.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

      // Fill the list with random even numbers
      for (int i = 0; i < 10; i++) {
          numbers.add(random.nextInt(100) * 2); 
      }

        // Display the numbers to the user
        System.out.println("Generated numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); 

      
        System.out.println("Filtered numbers:");
        numbers.stream()
               .skip(5) 
               .limit(3) 
               .forEach(x -> Print(x)); 
    }

       public static void Print(Integer number) {
           System.out.println();
           System.out.println(number);
        }
}
```


