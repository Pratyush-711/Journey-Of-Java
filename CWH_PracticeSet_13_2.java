// How do you get state of a given thread in Java?
// Solution of Practice Set - 13 Qno:- 4

class Practice13c extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Inside run() method");

            // TIMED_WAITING state
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class CWH_PracticeSet_13_2 {

    public static void main(String[] args) throws InterruptedException {
        Practice13c t1 = new Practice13c();

        // 1️⃣ NEW State
        System.out.println("State after creation: " + t1.getState());

        // Start thread
        t1.start();

        // 2️⃣ RUNNABLE State
        System.out.println("State after start(): " + t1.getState());

        // Small delay to ensure sleep is called
        Thread.sleep(500);

        // 3️⃣ TIMED_WAITING State (because of sleep)
        System.out.println("State during sleep(): " + t1.getState());

        // Wait for thread to finish
        t1.join();

        // 4️⃣ TERMINATED State
        System.out.println("State after completion: " + t1.getState());
    }
}
