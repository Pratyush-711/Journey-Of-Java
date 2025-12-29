import java.util.Scanner;

public class CWH_PracticeSet_01_2 {
    public static void main(String[] args) {
        System.out.println("Calculate CGPA: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of Physics: ");
        double Physics = sc.nextDouble();
        System.out.println("Enter the value of Chemistry: ");
        double Chemistry = sc.nextDouble();
        System.out.println("Enter the value of Mathematics: ");
        double Mathematics = sc.nextDouble();

        double CGPA = ((Physics + Chemistry + Mathematics)/3);
        System.out.println("CGPA: " +CGPA);

        sc.close();
    }
}
