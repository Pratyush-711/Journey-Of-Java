import java.util.Scanner;

public class cwh_19_for_loop {

    public static void main(String[] args) {

        System.out.println("For Loop");
        System.out.println("Print n natural numbers in sequential form: ");
        for (int i = 1; i<=10; i++) {
            System.out.println(i);
        }

        // Quick Quiz
        Scanner sc = new Scanner(System.in);
        System.out.println("Print n odd numbers");
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("First " + n + " odd numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.println(2 * i - 1);
        }
        sc.close();

        // Quick Quiz
        System.out.println("Print n natural numbers in reverse order: ");
        for (int i = 10; i>=1; i--) {
            System.out.println(i);
        }
    }
}
