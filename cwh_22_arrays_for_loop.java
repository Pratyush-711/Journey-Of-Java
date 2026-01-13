import java.util.Arrays;

public class cwh_22_arrays_for_loop {

    public static void main(String[] args) {
        int[] marks = {98, 45, 79, 99, 80};
        System.out.println(Arrays.toString(marks));
        // Marks Length
        System.out.println("Marks Length: " +marks.length);

        String[] students = {"Harry", "Rohan", "Shubham", "Lovish"};
        System.out.println("Students Length: " +students.length);
        System.out.println(students[2]);

        System.out.println("Displaying an array using for loop: ");
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Quick Quiz
        System.out.println("Program to print the elements of array in reverse order: ");
        for(int j = marks.length - 1; j >= 0; j--) {
            System.out.println(marks[j]);
        }

        // For-each loop in Java


        // Quick Quiz: Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for(int element: marks) {
            System.out.println(element);
        }
    }
}
