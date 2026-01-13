class Cylinder2 {
    private int radius;
    private int height;

    public Cylinder2(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
}

public class CWH_PracticeSet_09_3 {

    public static void main(String[] args) {
        Cylinder2 myCylinder = new Cylinder2(5,7);

        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.getHeight());
    }
}
