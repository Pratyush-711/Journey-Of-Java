class Circle2 {
    public int radius;

    Circle2(int r) {
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}
class Cylinderrr extends Circle2 {
    public int height;

    Cylinderrr(int r, int h) {
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height = h;
    }

    public double area() {
        return 2 * Math.PI * this.radius * (this.radius + this.height);
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class CWH_PracticeSet_10_3 {

    public static void main(String[] args) {

        Cylinderrr obj = new Cylinderrr(12, 4);

        System.out.println("Area of Cylinder: " + obj.area());
        System.out.println("Volume of Cylinder: " + obj.volume());
    }
}
