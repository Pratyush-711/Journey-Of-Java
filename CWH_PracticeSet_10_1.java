class Circle1 {
    Circle1(int r) {
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }
    public int radius;
    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder3 extends Circle1 {
    Cylinder3(int r, int h) {
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height = h;
    }
    public int height;
    public double volume() {
        return Math.PI * this.radius * this.radius * this.radius * height;

    }
}
public class CWH_PracticeSet_10_1 {

    public static void main(String[] args) {
        // Circle1 cir = new Circle1(12);
         Cylinder3 obj = new Cylinder3(12, 4);
    }
}
