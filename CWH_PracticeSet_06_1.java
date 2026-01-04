public class CWH_PracticeSet_06_1 {

    public static void main(String[] args) {
        float[] numbers = new float[5];

        numbers[0] = 1.5f;
        numbers[1] = 2.5f;
        numbers[2] = 3.5f;
        numbers[3] = 4.5f;
        numbers[4] = 5.5f;

        float sum = 0;
        for(int i=0; i<numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum of the array elements = " +sum);
    }
}
