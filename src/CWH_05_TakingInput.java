import java.util.Scanner;

public class CWH_05_TakingInput {

    public static void main(String[] args) {
        System.out.println("Taking Input From The User");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Addition of two numbers: ");
        int sum = a + b;
        System.out.println(+sum);

        sc.close();
    }
}
