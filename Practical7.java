import java.util.Scanner;

class Practical7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnrollment No.: 240390107011\n");

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();

        System.out.print("Enter side b: ");
        double b = sc.nextDouble();

        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        // Triangle validity check
        if (a + b > c && a + c > b && b + c > a) {

            double s = (a + b + c) / 2;   // semi-perimeter
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("The given sides do NOT form a valid triangle.");
        }
    }
}
