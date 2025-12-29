import java.util.Scanner;

public class CWH_PracticeSet_01_3 {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        System.out.println("My name is ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + " Have a good day!");
        sc.close();
    }
}
