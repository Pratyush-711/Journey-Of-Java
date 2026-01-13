class TommyVecetti {

    public void hit() {
        System.out.println("TommyVecetti is hitting the enemy!");
    }
    public void run() {
        System.out.println("TommyVecetti is running fast!");
    }
    public void fire() {
        System.out.println("TommyVecetti is firing with a gun!");
    }
    public void jump() {
        System.out.println("TommyVecetti is jumping!");
    }
}

public class CWH_PracticeSet_08_5 {

    public static void main(String[] args) {
        TommyVecetti tommy =  new TommyVecetti();

        tommy.hit();
        tommy.run();
        tommy.fire();
        tommy.jump();
    }
}
