import java.util.Scanner;

public class CWH_PracticeSet_05_9 {

    public static void main(String[] args) {

        int n = 8;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + (n * i);
        }

        System.out.println("Sum of numbers in the multiplication table of 8 = " + sum);
    }
}
