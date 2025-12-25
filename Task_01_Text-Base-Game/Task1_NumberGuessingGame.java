import java.util.Scanner;
import java.util.Random;

public class Task1_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 to 100");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! You guessed in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}

