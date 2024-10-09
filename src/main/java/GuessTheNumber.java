import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    // Create a main() method
    public static void main(String[] args) {
        // Create a random number from 1 to 100
        int randomNumber = new Random().nextInt(100) + 1;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Number of guess attempts
        int guessAttempts = 6;

        // While the user has more than 0 guess attempts
        while (guessAttempts > 0) {
            System.out.print("Guess a number between 1 and 100: ");
            int userGuess = scanner.nextInt();

            // If the user's number matches the random number
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed correctly!");
                System.exit(0);
            }
            // If the user's number is lower than the random number
            else if (userGuess < randomNumber) {
                System.out.println("Your guess is too low.");
            }
            // Otherwise, the user's number is higher
            else {
                System.out.println("Your guess is too high.");
            }

            // Decrease the number of attempts by 1
            guessAttempts--;

            // Provide feedback on remaining attempts
            if (guessAttempts > 0) {
                System.out.println("You have " + guessAttempts + " attempts left.");
            }
        }

        // Outside the loop, tell the user they have lost and reveal the random number
        System.out.println("You've run out of attempts! The correct number was: " + randomNumber);
    }
}