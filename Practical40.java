class Table {
// Synchronized method
    synchronized void printTable(int n) {
     for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
   System.out.println();
    }
}
// Thread for first table
class ThreadOne extends Thread {
    Table t;
 ThreadOne(Table t) {
        this.t = t;
    }
public void run() {
        t.printTable(5);
    }
}
// Thread for second table
class ThreadTwo extends Thread {
    Table t;
 ThreadTwo(Table t) {
        this.t = t;
    }
   public void run() {
        t.printTable(7);
    }
}
public class Practical40 {
    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");

        Table obj = new Table();

        ThreadOne t1 = new ThreadOne(obj);
        ThreadTwo t2 = new ThreadTwo(obj);

        t1.start();
        t2.start();
    }
}
