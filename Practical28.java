import java.util.Scanner;

// Interface 1
interface Exam {
    boolean isPassed(int mark);
}

// Interface 2
interface Classify {
    String getDivision(double average);
}

// Class implementing both interfaces
class Result implements Exam, Classify {

    // Implementation of Exam interface
    public boolean isPassed(int mark) {
        return mark >= 40;   // pass if marks >= 40
    }

    // Implementation of Classify interface
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No First Division";
        }
    }
}

class Practical28 {
    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.print("Enter average: ");
        double avg = sc.nextDouble();

        Result r = new Result();

        // Using Exam interface method
        if (r.isPassed(marks)) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        // Using Classify interface method
        System.out.println("Division: " + r.getDivision(avg));

        sc.close();
    }
}