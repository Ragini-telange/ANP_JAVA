

// Thread to calculate average of 10 numbers
class AverageThread extends Thread {
    public void run() {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / 10.0;
        System.out.println("Average of 10 numbers is: " + average);
    }
}

// Thread to calculate square of a number
class SquareThread extends Thread {
    private int number;

    public SquareThread(int number) {
        this.number = number;
    }

    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
}

// Main class
public class TwoThreadsExample {
    public static void main(String[] args) {
        // Create thread objects
        AverageThread avgThread = new AverageThread();
        SquareThread sqThread = new SquareThread(7);

        // Start the threads
        avgThread.start();
        sqThread.start();

        // Wait for both to finish
        try {
            avgThread.join();
            sqThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Both threads have completed.");
    }
}
