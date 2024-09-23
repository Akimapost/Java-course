
// Create a new Class

//Constructor is a function, that is called when an object is created

Main.java
```java
public class Main {
  public static void main(String[] args) {

    //var1
    Person person = new Person("Oskars", "Klaumanis"); // "new" - creates an instance

    //var2
    Person person2 = new Person();
    person2.name = "Elchin";// its a variable inside a class
    person2.surname = "Datorium";
    
    System.out.println(person.name);
    System.out.println(person2.name);
  }

}
```
Person.java
```java
public class Person {
  public String name;
  public String surname;

  // new Person("Oskars", "Klaumanis");
  //This is a constructor
  // Constructor always launches when you create a new object -> new Person(name, surname);
  // You can provide values to constructor
  public  Person(String inputName, String inputSurname){
    name = inputName;
    surname = inputSurname;
  }
//new person
   public Person(){
  }
}
//DTO - Data Transfer Object
```
Main.java
```java
// A book, that has it's writer and book name to it
// We create a book and then we print out the values of the book in a fancy way

public class Main {
  public static void main(String[] args) {
    var book = new Book();
    book.title = "The Hobbit";
    book.author = "J.R.R. Tolkien";
    book.pageCount = 310; 

    System.out.println(book.title);
    System.out.println(book.author);
    System.out.println(book.pageCount);

  }
}
```

Book.java
```java
public class Book{
    public String title;
    public String author;
    public int pageCount;
}
```

Main.java
```java

// A book, that has it's writer and book name to it
// We create a book and then we print out the values of the book in a fancy way

public class Main {
  public static void main(String[] args) {
    var book = new Book("The Hobbit", "Tolkien", 310); //reference to the book object
//var1
    System.out.println(book.title);
    System.out.println(book.author);
    System.out.println(book.pageCount);
//var2
    var book2 = new Book();
    System.out.println(book2.title);
    System.out.println(book2.author);
    System.out.println(book2.pageCount);

  }

}
```


Book.java
```java
// A book, that has it's writer and book name to it
// We create a book and then we print out the values ot the book in a fancy way

public class Main {
  public static void main(String[] args) {
    var book = new Book("The Hobbit", "Tolkien", 310);
//var1
    System.out.println(book.title);
    System.out.println(book.author);
    System.out.println(book.pageCount);
//var2
    var book2 = new Book();
    System.out.println(book2.title);
    System.out.println(book2.author);
    System.out.println(book2.pageCount);

  }

}
```
_________________________________

main.java
```java
/*
Create a class for an object that you can find on your table or for something you own - 
For example: Vehicle
Brand
Year
Color
OwnersName
Initialize 3 different objects out of this class, and print it out.
Try to use as many data types as you can (int, String, boolean and so on)
*/

public class Main {
  public static void main(String[] args) {
    var cat = new Cat("Minka", "Scottish straight", 4);
    
    System.out.println("Kitty " + cat.name);
    System.out.println("From " + cat.breed + "'s");
    System.out.println("Has " + cat.catPaws + " cute paws.");
    System.out.println();

    var cat2 = new Cat();
    System.out.println("Kitty " + cat2.name);
    System.out.println("From " + cat2.breed + "'s");
    System.out.println("Has also " + cat2.catPaws + " paws.");
    System.out.println();

    var cat3 = new Cat();
    cat3.name = "Snowball";
    cat3.breed = "Persian";
    cat3.catPaws = 4; 

    System.out.println("Kitty " + cat3.name);
    System.out.println("From " + cat3.breed + "'s");
    System.out.println("Also with " + cat3.catPaws+ " cute paws.");

    
    System.out.println("Total cats at home: " + Cat.totalCatCount);
  }

}
```

cat.java
```java
public class Cat{
    public static int totalCatCount = 0;
    public String name;
    public String breed;
    public int catPaws;

  public Cat(String name, String breed, int catPaws){
    this.name = name;
    this.breed = breed;
    this.catPaws = catPaws;
    totalCatCount++;
  }
 
  public Cat(){
    this.name = "Coder";
    this.breed = "Maine Coon";
    this.catPaws = 4;
    totalCatCount++;
  }
}
```
