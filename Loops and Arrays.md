
We have an array with different numbers {1, 3, 4, 2, 5, 8}

User is providing a number.

Check whether or not this number exists in the array.
:
1. Define an array with numbers
2. Ask the user for a favouriteNumber
3. Defining a isFound boolean (represents whether or not the number is found)
4. Go through the array with a for loop
4.1. On every cycle we check whether or not the number is equal to the favouriteNumber
4.1.1. If it is, we set isFound to true and exit the searching loop with a "break;"
4.1.2. If it is not, we set isFound to false and we repeat the 4.1. steps 
5. At the end of the cycle we check whether or not isFound is true
5.1. If isFound == true -> Then we print your favourite number is found
5.2. If isFound == false -> Then we print NOT FOUND!


```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int[] numbers = { 1, 3, 4, 2, 5, 8 }; // numbers.length = size of the numbers = 6

    System.out.println("Please write your favourite digit");

    Scanner scanner = new Scanner(System.in);
    int favouriteNumber = scanner.nextInt();

    boolean isFound = false;
    
    for (int i = 0; i < numbers.length; i++) {

      if (numbers[i] == favouriteNumber) {
        isFound = true;
        break; //EXITS THE FOR LOOP ALTOGETHER, ignoring the i < numbers.length
      }
      
    }
    if(isFound){
      System.out.println("Your favourite number " + favouriteNumber + " is in the array");
    } else {
      System.out.println("Your favourite number " + favouriteNumber + " is NOT FOUND!");
    }
    
    scanner.close();
  }
}
```
__________________________________________

Easy: 
Fill the array with random numbers

Find the sum of all elements in the array.
For example in an array like this:
[2, 3, 5, 1]
Result: 11 (2 + 3 + 5 + 1)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[7];
        System.out.println("Enter 7 different numbers to find out the sum of them.");

        for (int i = 0; i < 7; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

	// find and print the sum

        int sum = 0;
        for (int number : arr) {
            sum += number;
        }

        System.out.println("Sum of the numbers: " + sum);

        scanner.close();
    }
}
```

Find all the elements in the array that is below 0
[-2, 3, -5, 1]

Result:

-2

-5

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[7];
        System.out.println("Enter 7 different numbers including negative.");

        for (int i = 0; i < 7; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

      System.out.println("Numbers below 0:");

      // print elements below 0
      for (int number : arr) {
          if (number < 0) {
              System.out.println(number);
          }
      }

        scanner.close();
    }
}
```

Fill the party list with people you would like to invite to the party.
Check whether or not "Anna" is in the array.
Check whether or not "Maris" is in the array.
["Oskars", "Anna", "Andris"]
Result: 
"Anna is in the party list"
"Maris is not in the party list"

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String[] arr = new String[7];
        arr[0] = "Anna";
        arr[1] = "Hanna";
        arr[2] = "Maria";
        arr[3] = "Maris";
        arr[4] = "Peter";
        arr[5] = "Oskars";
        arr[6] = "Andris";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to check if it's in the party list: ");
        String name = scanner.nextLine();

        // Check if the name is in the guest list
        boolean namePresent = false;
        for (String guest : arr) {
            if (name.equalsIgnoreCase(guest)) {
                namePresent = true;
                break;
            }
        }
        if (namePresent) {
            System.out.println(name + " is in the party list");
        } else {
            System.out.println(name + " is not in the party list");
        }
        scanner.close();
    }
}
```
___________var2_____________

```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    String[] partyList = {"Oskars", "Maris", "Andrea"};

    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    
    boolean isInvited = false;
    
    for (int i = 0; i < partyList.length; i++){
      if(partyList[i].equals(name)){
        isInvited = true;
        System.out.println(name + " is invited");
        break;
      }
    }

    if(!isInvited){
      System.out.println(name + " is not invited");
    }
  }
}
```
Difficult: 
Given an array of integers, write a Java program to find the maximum sum of two integers in the array.
For example in an array like this:
[2, 3, 1, 5, 4]
The maximum sum would be 5 + 4

```java
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] arr = new int[7];
            System.out.println("Enter 7 different numbers.");
          for (int i = 0; i < 7; i++) {
              System.out.print("Number " + (i + 1) + ": ");
              arr[i] = scanner.nextInt();
          }
          // Finding the largest number
          int maxNumber = arr[0];
          for (int i = 1; i < arr.length; i++) {
              if (arr[i] > maxNumber) {
                 maxNumber = arr[i];
              }
          }

          System.out.println("Largest number of array is: " + maxNumber);
          // Finding the second largest number
          int secMaxNumber = arr[0];
          for (int i = 1; i < arr.length; i++) {
            if(arr[i] > secMaxNumber && arr[i] != maxNumber) {
                secMaxNumber = arr[i];
            }
          }
          System.out.println("The second large number is: " + secMaxNumber);
        // Finding the sum of the largest numbers
          int sum = maxNumber + secMaxNumber;

          System.out.println("The sum of the largest numbers is: " + sum);
          
           scanner.close();
  }
}
```

Very difficult
Fill the array with human names.
Check how many different names are in the array
["Oskars", "Anna", "Andris"]
Result: 3

["Andris", "Oskars", "Elizabeth", "Oskars",  "Elizabeth"]
Result: 3

["Oskars"] - An empty array
Result: 1

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = new String[6];
        System.out.print("Enter 6 names: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Next name " + (i + 1) + ": ");
            arr[i] = scanner.nextLine();
        }

        scanner.close();

        // Count the number of unique names
        int uniqueCount = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }

        System.out.println("Number of unique names: " + uniqueCount);
    }
}
```

