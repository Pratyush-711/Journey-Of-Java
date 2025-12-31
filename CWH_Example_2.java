import java.util.Random;
import java.util.Scanner;

public class CWH_Example_2 {

    // Method to convert number to choice name
    public static String getChoice(int choice) {
        switch (choice) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "Invalid Choice";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("🎮 Welcome to Rock Paper Scissors Game!");
        System.out.println("Choose one:");
        System.out.println("0 - Rock");
        System.out.println("1 - Paper");
        System.out.println("2 - Scissors");

        System.out.print("Enter your choice: ");
        int userChoice = sc.nextInt();

        // Validate input
        if (userChoice < 0 || userChoice > 2) {
            System.out.println("❌ Invalid choice! Please choose 0, 1, or 2.");
            sc.close();
            return;
        }

        int computerChoice = random.nextInt(3);

        // Display choices
        System.out.println("\nYou chose: " + getChoice(userChoice));
        System.out.println("Computer chose: " + getChoice(computerChoice));

        // Game Logic
        if (userChoice == computerChoice) {
            System.out.println("🤝 It's a Tie!");
        }
        else if (
                (userChoice == 0 && computerChoice == 2) ||
                        (userChoice == 1 && computerChoice == 0) ||
                        (userChoice == 2 && computerChoice == 1)
        ) {
            System.out.println("🎉 You Win!");
        }
        else {
            System.out.println("💻 Computer Wins!");
        }

        sc.close();
    }
}
