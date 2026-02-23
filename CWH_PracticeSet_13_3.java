// How do you get reference to the current thread in Java?
// Solution of Practice Set - 13 Qno:- 5

class Practice13d extends Thread {
    @Override
    public void run() {

        // Getting reference of current thread
        Thread t = Thread.currentThread();

        System.out.println("Current Thread Name: " + t.getName());
        System.out.println("Current Thread ID: " + t.getId());
        System.out.println("Current Thread Priority: " + t.getPriority());
    }
}
public class CWH_PracticeSet_13_3 {

    public static void main(String[] args) {

        // Reference of main thread
        Thread mainThread = Thread.currentThread();

        System.out.println("Main Thread Name: " + mainThread.getName());
        System.out.println("Main Thread ID: " + mainThread.getId());

        // Changing main thread name
        mainThread.setName("MyMainThread");
        System.out.println("Updated Main Thread Name: " + mainThread.getName());

        // Creating new thread
        Practice13d t1 = new Practice13d();
        t1.start();
    }
}
