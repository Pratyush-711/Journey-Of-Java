class Cylinder1 {
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

    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

public class CWH_PracticeSet_09_2 {

    public static void main(String[] args) {

        Cylinder1 myCylinder = new Cylinder1();
        myCylinder.setRadius(5);
        myCylinder.setHeight(5);

        System.out.println("Radius: " + myCylinder.getRadius());
        System.out.println("Height: " + myCylinder.getHeight());
        System.out.println("Surface Area: " + myCylinder.getSurfaceArea());
        System.out.println("Volume: " + myCylinder.getVolume());
    }
}
