import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public
 
static
 
void
 
main(String[] args)
 
{
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generate random number between 1 and 100
        int guessCount = 0;

        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        while (guessCount < 5) {
            int guess;
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            guessCount++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + guessCount + " tries!");
                break; // Exit the loop if the guess is correct
            } else if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        if (guessCount == 5) {
            System.out.println("GAME OVER! The number was " + randomNumber);
        }
    }
}
    

