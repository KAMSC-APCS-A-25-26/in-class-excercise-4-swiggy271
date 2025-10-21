import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        // TODO: Prompt the user with a welcome message
        // TODO: Generate a random secret number between 1 and 100 (inclusive)
        // TODO: Use a do...while loop to read guesses until correct
        // TODO: Print "Too low" / "Too high" / "You got it!" accordingly
        // TODO: Use Scanner for input

        int input;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int ans = rand.nextInt(100) + 1;
        System.out.print("Welcome to the Guessing Game!\nI'm thinking of a number between 1 and 100.");

        System.out.print("\n\n" + ans);

        do {
            System.out.println("Enter your Guess: ");
            input = sc.nextInt();
            if (input > ans)
            {
                System.out.println("Too high! Try again.");
            }
            else if (input < ans)
            {
                System.out.println("Too low! Try again.");
            }
            else
            {
                System.out.println("You got it!");
            }
        } while(input != ans);


    }
}
