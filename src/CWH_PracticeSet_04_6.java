import java.util.Scanner;

public class CWH_PracticeSet_04_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the website URL: ");
        String url = sc.nextLine();

        if (url.endsWith(".com")) {
            System.out.println("This is a Commercial Website.");
        }
        else if (url.endsWith(".org")) {
            System.out.println("This is an Organization Website.");
        }
        else if (url.endsWith(".in")) {
            System.out.println("This is an Indian Website.");
        }
        else if (url.endsWith(".edu")) {
            System.out.println("This is an Educational Website.");
        }
        else if (url.endsWith(".gov")) {
            System.out.println("This is a Government Website.");
        }
        else {
            System.out.println("Website type not recognized.");
        }

        sc.close();
    }
}
