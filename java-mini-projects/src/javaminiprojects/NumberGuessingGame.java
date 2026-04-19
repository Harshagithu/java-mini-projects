package javaminiprojects;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secretNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Greater Number than Secret Number! Try again.");
            } 
            else if (guess < secretNumber) {
                System.out.println("Lower Number than Secret Number! Try again.");
            } 
            else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("Total attempts: " + attempts);
            }

        } while (guess != secretNumber);
    }
}