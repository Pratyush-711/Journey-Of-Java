package cwh_41;

// Simple Calculator
class Calculator {
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
class ScCalculator {
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
class HybridCalculator extends Calculator {
    public void power(int a, int b) {
        System.out.println("Power: " + Math.pow(a, b));
    }
}

// Main class
public class cwh_41_packages {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        c.add(10, 5);
        c.divide(10, 2);

        ScCalculator sc = new ScCalculator();
        sc.square(4);
        sc.squareRoot(25);

        HybridCalculator hc = new HybridCalculator();
        hc.multiply(3, 4);
        hc.power(2, 3);
    }
}
