public class CWH_Ch2_Operators {

    public static void main(String[] args) {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // 3. Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > b && a > 0) : " + (a > b && a > 0));
        System.out.println("(a > b || a < 0) : " + (a > b || a < 0));
        System.out.println("!(a > b) : " + !(a > b));

        // 4. Assignment Operators
        System.out.println("\nAssignment Operators:");
        int x = 10;
        x += 5;
        System.out.println("x += 5 -> " + x);
        x -= 3;
        System.out.println("x -= 3 -> " + x);
        x *= 2;
        System.out.println("x *= 2 -> " + x);
        x /= 4;
        System.out.println("x /= 4 -> " + x);

        // 5. Bitwise Operators
        System.out.println("\nBitwise Operators:");
        int p = 5;  // 0101
        int q = 3;  // 0011
        System.out.println("p & q = " + (p & q));
        System.out.println("p | q = " + (p | q));
        System.out.println("p ^ q = " + (p ^ q));
        System.out.println("~p = " + (~p));
    }
}
