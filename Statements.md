
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
