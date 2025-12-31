import java.util.Scanner;

public class cwh_15_elseif {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You are eligible for vote.");
        }
        else if (age < 18) {
            System.out.println("You are not eligible for vote.");
        }
        else {
            System.out.println("You are ready to vote.");
        }
    }
}
