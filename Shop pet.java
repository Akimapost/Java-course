import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Pet> pets = new ArrayList<Pet>();

        var dog = new Dog();
        pets.add(dog);
        dog.name = "Spotty";
        dog.breed = "Poodle";
        dog.age = 2;
        dog.color = "Black & White";
        dog.price = 100;

        var snake = new Snake();
        pets.add(snake);
        snake.name = "Squeezy";
        snake.snakeType = "Python";
        snake.age = 1;
        snake.length = 125;
        snake.color = "Green";
        snake.environment = "Desert";
        snake.price = 70;

        System.out.println("These are all the pets I can sell to you:");
        for (var pet : pets) {
            System.out.println("Name: " + pet.name);
            System.out.println("Price: EUR" + pet.price);
            if (pet instanceof Snake) {
                Snake snakeInstance = (Snake) pet;
                System.out.println("Type: " + snakeInstance.snakeType);
                System.out.println("Length: " + snakeInstance.length + " cm");
                System.out.println("Environment: " + snakeInstance.environment);
            } else if (pet instanceof Dog) {
                Dog dogInstance = (Dog) pet;
                System.out.println("Breed: " + dogInstance.breed);
            }
            System.out.println("Age: " + pet.age);
            System.out.println("Color: " + pet.color);
            System.out.println();
        }
    }
}


public class Pet{
  public String name;
  public float price;
  public int age;
  public String color;
  
} 

public class Dog extends Pet{
  public String breed;
  public String voice;
}

public class Snake extends Pet{ 
  public String snakeType;
  public int length;
  public String environment;
}





