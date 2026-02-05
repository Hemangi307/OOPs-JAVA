class Rectangle {
    double width;
    double height;

    // Method to calculate area
    double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Practical13 {
    public static void main(String[] args) {


        System.out.println("Enrollment No:240390107011");
        // First rectangle
        Rectangle r1 = new Rectangle();
        r1.width = 4;
        r1.height = 40;

        // Second rectangle
        Rectangle r2 = new Rectangle();
        r2.width = 3.5;
        r2.height = 35.9;

        // Display details of first rectangle
        System.out.println("Rectangle 1:");
        System.out.println("Width = " + r1.width);
        System.out.println("Height = " + r1.height);
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        System.out.println();

        // Display details of second rectangle
        System.out.println("Rectangle 2:");
        System.out.println("Width = " + r2.width);
        System.out.println("Height = " + r2.height);
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());

        System.out.println();

        // Compare areas
        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have equal area.");
        }
    }
}
