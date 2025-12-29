public class cwh_09_ch2_op_pre {

    public static void main(String[] args) {
        // Precedence & Associativity
        int a = 10, b = 5, c = 2;

        // Operator Precedence
        int result1 = a + b * c;
        System.out.println("a + b * c = " + result1);

        int result2 = (a + b) * c;
        System.out.println("(a + b) * c = " + result2);

        // Associativity (Right to Left)
        int x, y, z;
        x = y = z = 20;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);

        // Logical operators
        boolean result3 = a > b && b > c;
        System.out.println("a > b && b > c = " + result3);

        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Max value = " + max);
    }
}
