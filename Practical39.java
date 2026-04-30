class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
class T2 extends Thread {
    public void run() {
        for (int i = 101; i <= 200; i++) {
            System.out.println(i);
        }
    }
}
class T3 extends Thread {
    public void run() {
        for (int i = 201; i <= 300; i++) {
            System.out.println(i);
        }
    }
}
public class Practical39 {
    public static void main(String[] args) {

        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");

        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        try {
            // Start T1 and wait until it finishes
            t1.start();
            t1.join();

            // Start T2 and wait until it finishes
            t2.start();
            t2.join();

            // Start T3 and wait until it finishes
            t3.start();
            t3.join();

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("\nAll threads executed sequentially.");
    }
}
