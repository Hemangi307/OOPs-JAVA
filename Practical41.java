class SumThread extends Thread {
    private int start, end;
    private long sum = 0;
  // Constructor
    SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }
    // Thread task
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }
     // Getter method
    public long getSum() {
        return sum;
    }
}
public class Practical41 {
    public static void main(String[] args) {

        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");

        // Create threads
        SumThread t1 = new SumThread(1, 1000);
        SumThread t2 = new SumThread(1001, 2000);

        // Start threads
        t1.start();
        t2.start();

        try {
            // Wait for threads to finish
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        // Combine results
        long totalSum = t1.getSum() + t2.getSum();

        System.out.println("Sum from 1 to 1000: " + t1.getSum());
        System.out.println("Sum from 1001 to 2000: " + t2.getSum());
        System.out.println("Final Total Sum: " + totalSum);
    }
}
