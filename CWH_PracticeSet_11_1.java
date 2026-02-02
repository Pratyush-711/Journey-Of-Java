abstract class Pen {
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("Write");
    }
    void refill() {
        System.out.println("Refill");
    }
    void changeNib() {
        System.out.println("Changing the nib");
    }
}

public class CWH_PracticeSet_11_1 {

    public static void main(String[] args) {
        // Solution of Qno-1 and Qno-2
        FountainPen pen = new FountainPen();
        pen.changeNib();
        pen.write();
        pen.refill();
    }
}
