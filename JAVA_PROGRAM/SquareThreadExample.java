class SquareThread extends Thread {
    private int number;

    // Constructor
    public SquareThread(int number) {
        this.number = number;
    }

    // run() method — this is what the thread will execute
    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
}

public class SquareThreadExample {
    public static void main(String[] args) {
        // Create thread objects
        SquareThread t1 = new SquareThread(2);
        SquareThread t2 = new SquareThread(4);
        SquareThread t3 = new SquareThread(6);

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for threads to finish using join()
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("All threads have finished.");
    }
}
