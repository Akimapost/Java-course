//CreepyStoryGenerator
import java.util.Scanner;   

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        // Prompt the user for their favorite animal
        System.out.print("Please enter your favorite animal: ");
        String animal = scanner.nextLine();

        // Prompt the user to enter a place
        System.out.print("Please enter a spooky place: ");
        String place = scanner.nextLine();

        // Prompt the user to enter an adjective
        System.out.print("Please enter an eerie adjective: ");
        String adjective = scanner.nextLine();

        // Prompt the user to enter a verb
        System.out.print("Please enter a chilling verb: ");
        String verb = scanner.nextLine();

        // Display the story based on the provided values
        System.out.println("\nIn a land far away, there lived a person named " + name + ".");
        System.out.println(name + " was " + age + " years old." + ".");
        System.out.println("Their favorite animal was the mighty " + animal + ".");
        System.out.println("One foggy night, " + name + " and the " + animal + " ventured into the " + place + ", feeling " + adjective + ".");
        System.out.println("Suddenly, they heard a faint whisper and felt a cold shiver down their spine.");
        System.out.println("They quickly " + verb + " away, but the feeling of dread lingered.");

        // Close the scanner
        scanner.close();
    }
}
