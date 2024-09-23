```java
public class Main {
  public static void main(String[] args) {

    var name = "Liga";
    var sex = "female";
    var age = 25;
    var maritalStatus = "single";
    var placeOfBirth = "Riga, Latvia";
    var bankAccount = "1234567890";
    var accOpeningDate = 2023;
    var month = "october";
    var salary = 1000.55f;
    var salaryForPeriod = salary * 6;


    System.out.println("name: " + name);
    System.out.println("sex: " + sex);
    System.out.println("age: " + age);
    System.out.println("marital status: " + maritalStatus);
    System.out.println("place of birth: " + placeOfBirth);
    System.out.println("bank account: " + bankAccount);
    System.out.println("account opening date: " + accOpeningDate + ", " + month); 
    System.out.println("salary: " + salary);
    System.out.println("available funds: " + salaryForPeriod); 

  } 
}
```
![H:W Lesson 2](https://github.com/user-attachments/assets/3c09b5e9-94f2-4e49-b22d-7c0d683a2498)

````java
//if statement
public class Main {
  public static void main(String[] args) {

    String username = "Anna";

    if (username != "John") { //false
      System.out.println("You can come to the party!"); 
//this run if the statement if true

    } else { //this run if the statement is false
      System.out.println("Go home!");
    }


  }
}
```



