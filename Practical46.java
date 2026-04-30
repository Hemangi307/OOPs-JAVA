import java.util.ArrayList;
import java.util.Collections;
public class Practical46 {
    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");
        // Create ArrayList
        ArrayList<Integer> marks = new ArrayList<Integer>();
        // Add marks
        marks.add(85);
        marks.add(92);
        marks.add(78);
        marks.add(88);
        marks.add(95);
        // Display marks
        System.out.println("Student Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }
        // Find highest and lowest
        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);
        System.out.println("\nHighest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);
    }
}
