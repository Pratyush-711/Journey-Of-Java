class Rectangle {
    int length;
    int breadth;

    public int area() {
        return length * breadth;
    }
    public int perimeter() {
        return 2 * (length + breadth);
    }
}

public class CWH_PracticeSet_08_4 {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();

        rec.length = 5;
        rec.breadth = 4;

        System.out.println(rec.area());
        System.out.println(rec.perimeter());
    }
}
