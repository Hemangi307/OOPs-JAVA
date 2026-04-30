import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Practical51 {
    // Generic method to sort list
    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }
    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");
        // Integer list
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(23);
        numbers.add(56);
        // String list
        ArrayList<String> names = new ArrayList<String>();
        names.add("Rahul");
        names.add("Hemangi");
        names.add("Priya");
        names.add("Amit");
        names.add("Neha");
        // Before sorting
        System.out.println("Numbers before sorting: " + numbers);
        System.out.println("Names before sorting: " + names);
        // Sorting
        sortList(numbers);
        sortList(names);
        // After sorting
        System.out.println("\nNumbers after sorting: " + numbers);
        System.out.println("Names after sorting: " + names);
    }
}
