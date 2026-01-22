class Rectangle3 {
    private int length;
    private int breadth;

    Rectangle3(int length, int breadth) {
        System.out.println("I am rectangle parameterized constructor");
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }
}

class Cuboid1 extends Rectangle3 {
    private int height;

    Cuboid1(int length, int breadth, int height) {
        super(length, breadth);
        System.out.println("I am cuboid parameterized constructor");
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Surface Area of Cuboid
    @Override
    public int area() {
        return 2 * (
                getLength() * getBreadth()
                        + getBreadth() * height
                        + getLength() * height
        );
    }

    // Volume of Cuboid
    public int volume() {
        return getLength() * getBreadth() * height;
    }
}

public class CWH_PracticeSet_10_4 {
    public static void main(String[] args) {

        Cuboid1 obj = new Cuboid1(10, 5, 4);

        System.out.println("Surface Area of Cuboid: " + obj.area());
        System.out.println("Volume of Cuboid: " + obj.volume());

        obj.setHeight(6);
        obj.setLength(12);

        System.out.println("\nAfter updating dimensions:");
        System.out.println("Surface Area of Cuboid: " + obj.area());
        System.out.println("Volume of Cuboid: " + obj.volume());
    }
}
