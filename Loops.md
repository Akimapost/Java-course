
```java
//WHILE

public class Main {
  public static void main(String[] args) {

int amountOfTimesToDuck = 10;
    while (amountOfTimesToDuck !=0) { //do action
      System.out.println("Duck");
      amountOfTimesToDuck = amountOfTimesToDuck -1;
      
    }
   
  }
}
```
```java
public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    int amountOfTimesToDuck = 10;
    //10 != 0
    //9 != 0
    //8 != 0
    //7 != 0
    //...
    //0 != 0
    while (amountOfTimesToDuck != 0) {
      System.out.println(amountOfTimesToDuck);
      amountOfTimesToDuck = amountOfTimesToDuck - 1;
    }

  }
}
```
```java
public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    int i = 0;
    //counts from 0 to 10
    while (i < 10) {
      System.out.println(i);
      i = i+1;
    }

  }
}
```

```java
public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    int i = 1; // first number is always 1
    boolean isEven = false;  // first number if always odd
    //counts from 0 to 10
    while (i <= 10) {
      String result = "";
      
      if (isEven == true) {
      result = "even";
      } else {
      result = "odd";
      }
        
      System.out.println(i+ "" + result);
      i = i+1;
      isEven = !isEven;
    }

  }
}
```

```java
public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    int i = 1; // 1
          //1 <= 10 -> TRUE
          //2 <= 10 -> TRUE
          //3 <= 10 -> TRUE
          //...
          //11 <= 10 -> FALSE
    while (i <= 10) {
      String result = ""; // Result
      if (i % 2 == 0) { //Odd or even
        result = "even";
      } else {
        result = "odd";
      }
                        //1 odd
                        //2 even
      System.out.println(i + " " + result);
      i = i + 1; // i = i + 1;
      //i = 1 + 1;
      //i = 2 + 1;
      //i = 3 + 1;
    }
  }
}
```
```java
//FOR

public class Main {
  public static void main(String[] args) {
 
    for (int i = 1; i <= 10; i = i + 1) { // We do action before first cycle; condition for cycle; action after every cycle
      System.out.println(i);
    }
  }
}
```

```java

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Opening a channel for user input
    int number = scanner.nextInt(); // Waiting for a number

    String result = ""; // an empty string
                    // 1 <= 5
    for (int i = 1; i <= number; i++) { // We do action before first cycle; condition for cycle; action after every cycle
      result = result + "_";
      System.out.println(result);
    }

    scanner.close();
  }
}
```
