import java.util.Scanner;

public class CWH_Example_1 {
    public static void main(String[] args) {
        System.out.println("CBSE Board Exam Result");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of physics: ");
        int physics = sc.nextInt();
        System.out.println("Enter the value of chemistry: ");
        int chemistry = sc.nextInt();
        System.out.println("Enter the value of mathematics: ");
        int mathematics = sc.nextInt();
        System.out.println("Enter the value of painting: ");
        int painting = sc.nextInt();
        System.out.println("Enter the value of english: ");
        int english = sc.nextInt();

        int marks = ((physics + chemistry + mathematics + painting + english) / 5);
        System.out.println("Total Marks Obtained: " +marks);
    }
}
