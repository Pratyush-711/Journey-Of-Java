class MyThread3 extends Thread {
    public MyThread3(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running... Count: " + i);

            // yield() method
            Thread.yield();

            try {
                // sleep() method
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread4 extends Thread {
    public MyThread4(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is executing... Count: " + i);

            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class cwh_47_thread_methods {
    public static void main(String[] args) {

        // currentThread()
        System.out.println("Current Thread: " + Thread.currentThread().getName());

        MyThread3 t1 = new MyThread3("Thread-3");
        MyThread4 t2 = new MyThread4("Thread-4");

        // setPriority()
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getName() + " Priority: " + t1.getPriority());
        System.out.println(t2.getName() + " Priority: " + t2.getPriority());

        // start() method
        t1.start();
        t2.start();

        try {
            // join() method
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // isAlive()
        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());

        System.out.println("Main thread finished execution.");
    }
}