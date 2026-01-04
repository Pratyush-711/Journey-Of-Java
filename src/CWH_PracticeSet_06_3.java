public class CWH_PracticeSet_06_3 {

    public static void main(String[] args) {
        int [] marks = {75, 80, 65, 90, 85};
        int sum = 0;

        for(int mark : marks) {
            sum = sum + mark;
        }

        float average = (float) sum/marks.length;
        System.out.println("Average Marks = " +average);
    }
}
