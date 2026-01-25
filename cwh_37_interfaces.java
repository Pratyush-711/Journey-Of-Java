interface Bicycle {
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AvonCycle implements Bicycle {
    int speed = 7;

    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }
}

public class cwh_37_interfaces {

    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();

        System.out.println("Initial Speed: " + cycle.speed);

        cycle.speedUp(5);
        System.out.println("After Speed Up: " + cycle.speed);

        cycle.applyBrake(3);
        System.out.println("After Applying Brake: " + cycle.speed);
    }
}
