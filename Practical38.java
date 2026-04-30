class ThreadOne extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1: " + i);
                Thread.sleep(1000); // 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 1 interrupted");
        }
    }
}
class ThreadTwo extends Thread {
   public void run() {
        try {
            for (int i = 11; i <= 20; i++) {
                System.out.println("Thread 2: " + i);
                Thread.sleep(500); // 500 ms
            }
        } catch (InterruptedException e) {
            System.out.println("Thread 2 interrupted");
        }
    }
}
public class Practical38 {
    public static void main(String[] args) {

        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");

        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        t1.start();
        t2.start();
    }
}
