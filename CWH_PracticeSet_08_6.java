class Circle {
    int radius;

    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

public class CWH_PracticeSet_08_6 {

    public static void main(String[] args) {
        Circle cir =  new Circle();

        cir.radius = 7;

        System.out.println("Area: " + cir.area());
        System.out.println("Perimeter: " + cir.perimeter());
    }
}
