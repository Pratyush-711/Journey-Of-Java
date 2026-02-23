public class cwh_48_errors {
        static void generateError() {
            generateError();
        }
    public static void main(String[] args) {
        System.out.println("--- Exception Examples ----");

        // 1️⃣ ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Caught: " + e);
        }

        // 2️⃣ NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException Caught: " + e);
        }

        // 3️⃣ ArrayIndexOutOfBoundsException
        try {
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Caught: " + e);
        }

        System.out.println("\n---- Error Example ----");

        try {
            generateError();   // This will cause StackOverflowError
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError Caught: " + e);
        }

        System.out.println("\nProgram Completed.");
    }
}
