class Point {
    int x;
    int y;

    // Default constructor
    Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    // Method to display point
    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

public class Practical12 {
    public static void main(String[] args) {

        System.out.println("Enrollment No:240390107011");
        // Using default constructor
        Point p1 = new Point();
        System.out.print("Default Constructor: ");
        p1.display();

        // Using parameterized constructor
        Point p2 = new Point(10, 20);
        System.out.print("Parameterized Constructor: ");
        p2.display();

        // Using copy constructor
        Point p3 = new Point(p2);
        System.out.print("Copy Constructor: ");
        p3.display();
    }
}
