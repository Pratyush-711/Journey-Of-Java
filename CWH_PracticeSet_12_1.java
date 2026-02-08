package pratyush;

// Simple Calculator
class Calculator1 {
    public void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    public void divide(int a, int b) {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Cannot divide by zero");
    }
}

// Scientific Calculator
class ScCalculator1 {
    public void square(int a) {
        System.out.println("Square: " + (a * a));
    }

    public void cube(int a) {
        System.out.println("Cube: " + (a * a * a));
    }

    public void squareRoot(double a) {
        System.out.println("Square Root: " + Math.sqrt(a));
    }
}

// Hybrid Calculator (Simple + Scientific)
class HybridCalculator1 extends Calculator1 {
    public void power(int a, int b) {
        System.out.println("Power: " + Math.pow(a, b));
    }
}
public class CWH_PracticeSet_12_1 {
    public static void main(String[] args) {
        Calculator1 c = new Calculator1();
        c.add(10, 5);
        c.divide(10, 2);

        ScCalculator1 sc = new ScCalculator1();
        sc.square(4);
        sc.squareRoot(25);

        HybridCalculator1 hc = new HybridCalculator1();
        hc.multiply(3, 4);
        hc.power(2, 3);
    }
}
