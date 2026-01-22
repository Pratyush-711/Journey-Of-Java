class Rectangle1 {
    public int length;
    public int breadth;

    Rectangle1(int l, int b) {
        System.out.println("I am rectangle parameterized constructor");
        this.length = l;
        this.breadth = b;
    }

    public int area() {
        return length * breadth;
    }
}

class Cuboid extends Rectangle1 {
    public int height;

    Cuboid(int l, int b, int h) {
        super(l, b);
        System.out.println("I am cuboid parameterized constructor");
        this.height = h;
    }

    public int volume() {
        return length * breadth * height;
    }
}

public class CWH_PracticeSet_10_2 {
    public static void main(String[] args) {

        Cuboid obj = new Cuboid(10, 5, 4);

        System.out.println("Area of Rectangle: " + obj.area());
        System.out.println("Volume of Cuboid: " + obj.volume());
    }
}
