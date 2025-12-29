import java.util.Scanner;

public class CWH_PracticeSet_02_3 {

    public static void main(String[] args) {
        int givenNumber = 50;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNumber = sc.nextInt();

        // Comparison
        if (givenNumber > userNumber) {
            System.out.println("It is greater than");
        }
        else if ( givenNumber < userNumber) {
            System.out.println("It is less than");
        }
        else {
            System.out.println("Bothe numbers are equal");

            sc.close();
        }
    }
}
