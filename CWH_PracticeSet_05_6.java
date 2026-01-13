public class CWH_PracticeSet_05_6 {

    public static void main(String[] args) {
        // Repeat 5 using while loop
        int n = 5;
        int i = 1;
        int factorial = 1;
        while(i <= n) {
            factorial = factorial * i;
            i++;
        }
        System.out.println(factorial);
    }
}
