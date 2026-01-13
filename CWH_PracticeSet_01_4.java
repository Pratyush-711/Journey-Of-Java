import java.util.Scanner;

public class CWH_PracticeSet_01_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();

        // Conversion formula
        double miles = km * 0.621371;

        // Output result
        System.out.println("Distance in miles: " + miles);

        sc.close();
    }
}
