
```java
public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");

    String name = "Elchin";
    boolean isElchin = name == "Elchin";
    boolean isAnna = name == "Anna";
    boolean isInvited = isElchin || isAnna;
    if(isInvited) {
      System.out.println("You are invited");
    }
    
  }
}
```

```java
public class Main {
  public static void main(String[] args) {

    System.out.println("Hello world!");
    // Door - 1 lock
    boolean isDoorLocked = false;
    
    if (isDoorLocked) {
      System.out.println("Door is closed!");
    } else {
      System.out.println("Door is open!");
    }
  }
}
```
```java
public class Main {
  public static void main(String[] args) {

    String name = "Oskars";    
    boolean isElchin = name == "Elchin";
    boolean isAnna = name == "Anna";
    //boolean isInvited = isElchin || isAnna;    
    // Guard, if the name is Elchin or Anna, please let them in!
    if(isElchin || isAnna) {
      System.out.println("You are invited!");
    }else{
      System.out.println("Next time!");
    }
  }
}
```


```java
public class Main {
  public static void main(String[] args) {

    String name = "Oskars";
    String name1 = "Elchin";
    String name2 = "Anna";

    boolean isElchin = name == name1;    
    boolean isAnna = name == name2;
    //boolean isInvited = isElchin || isAnna;    
    // Guard, if the name is Elchin or Anna, please let them in!
    if(isElchin || isAnna) {
      System.out.println("You are invited!");
    }else{
      System.out.println("Next time!");
    }
  }
}
```

```java
public class Main {
  public static void main(String[] args) {
 //one way
    String name = "Anna";
    int yearOfSchool = 12;
    double studentAge = 17.6;
    double grade = 9.2;

    // our condition
    // studetn age must be 18 or more 
    // AND
    // grade must be more than OR equal to 8
//another way

    boolean isAgeEligible = studentAge >= 18;
    boolean isGradeEligible = grade >= 8;

    if (isAgeEligible && isGradeEligible){
      System.out.println("You are accepted");
    } else {
      System.out.println("Try nex time");
    }
  

  }
}
```

```java
public class Main {
  public static void main(String[] args) {
 


    String name = "Anna";
    int yearOfSchool = 12;
    double studentAge = 18.5;
    double grade = 9.7;
    boolean olympicsWinner = false; 


    // our condition
    // studetn age must be 18 or more 
    // AND
    // grade must be more than OR equal to 8 
    //or must win som olimpiad 

    boolean isAgeEligible = studentAge >= 18;
    boolean isGradeEligible = grade >= 8;

    if (isAgeEligible && (isGradeEligible || olympicsWinner)){
      System.out.println("You are accepted");
    } else {
      System.out.println("Try nex time");
    }

  }
}
```
__________________________________
*TASK
__________________________________
AND

I will be able to open the doors, if the first key is unlocked AND if the second key is unlocked.

I will log you in if your username is correct AND if your password is correct.

OR

I will buy eggs if they will be on the sale OR they will cost less than 2.50

I will go running, if I will have enough energy OR if the weather is shiny.

AND OR

I will go in this restaurant if there is going to be squid OR shrimps, AND I need there to have white wine as well

NOT

I will go to a restaurant, if the waitress is NOT rude

Combine NOT with AND OR

I will go in this restaurant if there is going to be squid or shrimps, and I need there to have white wine as well. ALSO, waitress should NOT be rude
__________________________________

```java
public class Main {
  public static void main(String[] args) {
//AND
//I will be able to open the doors, if the first key is unlocked AND if the second key is unlocked.
    boolean firstKeyUnlocked = false;
    boolean secondKeyUnlocked = true;

    if (firstKeyUnlocked && secondKeyUnlocked){
      System.out.println("You are able to open the door.");
    } else {
      System.out.println("Try next time");
    }
 //AND
 //I will log you in if your username is correct AND if your password is correct.
    boolean correctUserName = true;
    boolean correctUserPassword = true;

    if (correctUserName && correctUserPassword){
      System.out.println("You are logged in.");
    } else {
      System.out.println("Try to correct the name or password");
    }
 //OR
 //I will buy eggs if they will be on the sale OR they will cost less than 2.50
    boolean isOnSale = false;
    double eggsCost = 2.60;
    
    if (isOnSale || eggsCost <= 2.50) {
      System.out.println("I will buy eggs.");
    } else {
      System.out.println("I won't buy eggs.");
    }
 //OR
 //I will go running, if I will have enough energy OR if the weather is shiny.

    boolean hasEnoughEnergy = false;
    boolean isSunShine = true;
      if (hasEnoughEnergy || isSunShine) {
      System.out.println("I will go running.");
    } else {
      System.out.println("I won't go running.");
    }


 //Combine NOT with AND OR
//I will go in this restaurant if there is going to be squid or shrimps, and I need there to have white wine as well. ALSO, waitress should NOT be rude
    boolean isWhiteWine = true;
    boolean isShrimps = false;
    boolean isSquid = true;
    boolean waitressIsRude = false;

      if (!waitressIsRude && isWhiteWine && (isShrimps || isSquid)) {
      System.out.println("I  will go to this restaurant.");
    } else {
      System.out.println("I won't go to this restaurant.");
    }

  }
}
```
