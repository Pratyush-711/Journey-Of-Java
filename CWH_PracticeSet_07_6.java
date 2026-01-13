public class CWH_PracticeSet_07_6 {

    static double average(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
    public static void main(String[] args) {
        System.out.println("Average = " + average(10, 20, 30, 40, 50));
        System.out.println("Average = " + average(5, 15, 25));
    }
}
