class Rectangle2 {
    private int length;
    private int breadth;

    public Rectangle2() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle2(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getArea() {
        return length * breadth;
    }
}

public class CWH_PracticeSet_09_4 {
    public static void main(String[] args) {

        Rectangle2 r1 = new Rectangle2();
        System.out.println("Length: " + r1.getLength());
        System.out.println("Breadth: " + r1.getBreadth());
        System.out.println("Area: " + r1.getArea());

        System.out.println();

        Rectangle2 r2 = new Rectangle2(10, 8);
        System.out.println("Length: " + r2.getLength());
        System.out.println("Breadth: " + r2.getBreadth());
        System.out.println("Area: " + r2.getArea());
    }
}
