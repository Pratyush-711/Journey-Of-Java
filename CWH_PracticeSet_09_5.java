class Sphere {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
public class CWH_PracticeSet_09_5 {

    public static void main(String[] args) {
        Sphere mySphere = new Sphere();
        mySphere.setRadius(5);

        System.out.println(mySphere.getRadius());
    }
}
