public class CWH_PracticeSet_07_1 {

    static void multiplication(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n*i);
        }
    }

    public static void main(String[] args) {
        multiplication(7);
    }
}
