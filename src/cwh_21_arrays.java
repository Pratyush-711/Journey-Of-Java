import java.util.Arrays;

public class cwh_21_arrays {

    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        */
        int[] marks  = new int[5];
        marks[0] = 100;
        marks[1] = 70;
        marks[2] = 90;
        marks[3] = 80;
        marks[4] = 90;
        System.out.println(Arrays.toString(marks));
        System.out.println("Displaying an array using for loop: ");
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Quick Quiz
        System.out.println("Program to print the elements of array in reverse order: ");
        for(int j = marks.length - 1; j >= 0; j--) {
            System.out.println(marks[j]);
        }
    }
}
