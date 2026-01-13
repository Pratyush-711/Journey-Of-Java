public class CWH_PracticeSet_07_8 {

    static void repeat(int n){
        if(n == 0){
            return;
        }
        System.out.println("Hello Pratyush");
        repeat(n-1);
    }
    public static void main(String[] args) {
        repeat(2);
    }
}
