public class CWH_PracticeSet_07_3 {

    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    static int sumRec(int n) {
        // Base Condition
        if(n==1) {
            return 1;
        }
        return n + sumRec(n-1);
    }

    public static void main(String[] args) {
        int c = sumRec(5);
        System.out.println(c);
    }
}
