import java.util.Scanner;

class Practical19 {

    String collegeName;

    // Constructor to initialize college name
    Practical19(String name) {
        collegeName = name;
    }

    // Non-static inner class
    class Admission {

        String studentName;
        String course;

        // Method to accept student details
        void acceptDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        // Method to display admission details
        void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course Enrolled: " + course);
        }
    }

    public static void main(String[] args) {

        System.out.println("240390107011");
        // Creating object of outer class
        College c = new College("S.P.B Patel Engineering College");

        // Creating object of inner class
        College.Admission a = c.new Admission();

        // Accept and display details
        a.acceptDetails();
        a.displayDetails();
    }
}