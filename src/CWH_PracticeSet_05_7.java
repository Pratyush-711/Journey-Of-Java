public class CWH_PracticeSet_05_7 {

    public static void main(String[] args) {

        int n = 1;
        int i = 1;
        int factorial = 1;

        while(i <= n) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of 1 is: " + factorial);
    }
}
