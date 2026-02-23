// Solution Of Practice Set - 13 Qno:- 1, 2 and 3

class Practice13 extends Thread {
    public void run() {
        while(true) {
            try {
                Thread.sleep(200);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning!");
        }
    }
}

class Practice13b extends Thread {
    public void run() {
        while(true) {
            try {
                Thread.sleep(200);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome...");
        }
    }
}

public class CWH_PracticeSet_13_1 {

    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        p1.start();
        p2.start();
    }
}
