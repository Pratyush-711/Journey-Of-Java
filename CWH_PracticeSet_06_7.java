public class CWH_PracticeSet_06_7 {

    public static void main(String[] args) {
        int[] arr = {12, 45, 7, 89, 34};
        int min = arr[0];

        for(int num : arr) {
            if(num < min) {
                min = num;
            }
        }

        System.out.println("Minimum element = " +min);
    }
}
