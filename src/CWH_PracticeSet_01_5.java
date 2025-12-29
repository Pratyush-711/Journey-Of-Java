import java.util.Scanner;

public class CWH_PracticeSet_01_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value: ");

        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("The entered value is an Integer: "+num);
        } else {
            System.out.println("The entered value is not an Integer");
        }

        sc.close();
    }
}
