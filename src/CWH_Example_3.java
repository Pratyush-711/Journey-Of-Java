import java.util.Random;
import java.util.Scanner;

// Game Class
class GuessTheNumber {
    private int number;
    private int userInput;
    private int noOfGuesses = 0;

    // Constructor to generate random number
    public GuessTheNumber() {
        Random rand = new Random();
        number = rand.nextInt(100) + 1;
    }

    // Take user input
    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number: ");
        userInput = sc.nextInt();
        noOfGuesses++;
    }

    // Check guess
    public boolean isCorrectNumber() {
        if(userInput == number) {
            System.out.println("🎉 Correct guess!");
            System.out.println("You guessed it in " + noOfGuesses + " attempts.");
            return true;
        } else if(userInput < number) {
            System.out.println("📉 Too low...");
        } else {
            System.out.println("📈 Too high...");
        }
        return false;
    }
}

public class CWH_Example_3 {

    public static void main(String[] args) {
        /*
           Create a class Game, which allows a user to play 'Guess the Number"
            game once.
        */
        GuessTheNumber game = new GuessTheNumber();
        boolean guessedCorrectly = false;

        while(!guessedCorrectly) {
            game.takeUserInput();
            guessedCorrectly = game.isCorrectNumber();
        }
    }
}
