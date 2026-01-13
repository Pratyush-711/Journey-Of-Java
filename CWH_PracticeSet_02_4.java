import java.util.Scanner;

public class CWH_PracticeSet_02_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of v: ");
        int v = sc.nextInt();
        System.out.println("Enter the value of u: ");
        int u = sc.nextInt();
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of s: ");
        int s = sc.nextInt();
        int formula = (v * v - u * u) / (2 * a * s);

        System.out.println("The Final Result: " +formula);

        sc.close();
    }
}
