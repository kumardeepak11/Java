// File: multhreading.java

// Example of multithreading in Java
public class multithreadingExample {

    public static void main(String[] args) {
        // Creating threads using the Thread class
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        // Starting the threads
        thread1.start();
        thread2.start();

        // Creating threads using the Runnable interface
        Thread thread3 = new Thread(new MyRunnable(), "Thread-3");
        Thread thread4 = new Thread(new MyRunnable(), "Thread-4");

        // Starting the threads
        thread3.start();
        thread4.start();
    }
}

// Extending the Thread class
class MyThread extends Thread {
    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running: " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
    }
}

// Implementing the Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running: " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
    }
}