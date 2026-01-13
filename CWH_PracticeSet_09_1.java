class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

public class CWH_PracticeSet_09_1 {

    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();
        myCylinder.setRadius(5);
        myCylinder.setHeight(5);

        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.getHeight());
    }
}
