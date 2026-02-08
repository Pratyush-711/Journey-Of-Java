package pratyush;

import java.util.Scanner;
import java.util.Arrays;

public class CWH_PracticeSet_12_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting using built-in package method
        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nMessage: Sorting completed successfully!");

        sc.close();
    }
}
