import java.util.Scanner;

public class CWH_PracticeSet_05_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        long factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial = factorial * i;

            System.out.println(factorial);
        }
        sc.close();
    }
}
