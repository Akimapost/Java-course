//Number Guessing Game
//In this program:
//We generate a random number between 0 and 100 using Math.random() method.
//We use a do-while loop to repeatedly prompt the user for guesses until the correct number is guessed.
//It handles cases where the user enters invalid input, such as non-numeric input or negative numbers. 
//Inside the loop, we compare the user's guess with the randomly generated number and provide feedback accordingly.
//The loop continues until the user's guess matches the random number.
//Once the correct number is guessed, the program congratulates the user and exits.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Generate a random number between 0 and 100
        int randomNumber = (int) (Math.random() * 101); // generates a random number between 0 and 100

        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 0 and 100:");

        do {
            try {
                // Prompt the user to guess a number
                System.out.print("Your guess: ");
                guess = scanner.nextInt();

                // Check if the guess is within the valid range (0 to 100)
                if (guess < 0 || guess > 100) {
                    System.out.println("Please enter a number between 0 and 100.");
                } else {
                    // Provide feedback based on the guess
                    if (guess < randomNumber) {
                        System.out.println("Too low! Try again.");
                    } else if (guess > randomNumber) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly!");
                    }
                }
            } catch (InputMismatchException e) {
                // Handle non-integer input
                System.out.println("Wrong input! Please enter a valid number.");
                // Clear the invalid input from the scanner
                scanner.next();
                // Assign a value that won't match the random number to continue the loop
                guess = -1;
            }
        } while (guess != randomNumber);

        // Close the scanner
        scanner.close();
    }
}
