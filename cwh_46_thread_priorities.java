class MyThread extends Thread {

    public MyThread(String name) {
        super(name);   // Set thread name
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread: " + getName() +
                    " | Priority: " + getPriority() +
                    " | Count: " + i);
        }
    }
}

public class cwh_46_thread_priorities {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("Low Priority Thread");
        MyThread t2 = new MyThread("Normal Priority Thread");
        MyThread t3 = new MyThread("High Priority Thread");

        // Setting Priorities
        t1.setPriority(Thread.MIN_PRIORITY);     // 1
        t2.setPriority(Thread.NORM_PRIORITY);    // 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY);     // 10

        // Start Threads
        t1.start();
        t2.start();
        t3.start();
    }
}
