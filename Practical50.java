import java.util.LinkedList;
public class Practical50 {
    // Generic method to search element
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);    }
    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");
        // LinkedList for roll numbers
        LinkedList<Integer> rollNumbers = new LinkedList<Integer>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);
        // LinkedList for names
        LinkedList<String> names = new LinkedList<String>();
        names.add("Hemangi");
        names.add("Nimu");
        names.add("Lakshya");
        names.add("Yudhvir");
        // Search in roll numbers
        int searchRoll = 102;
        System.out.println("Searching Roll Number " + searchRoll + ": " +
                searchElement(rollNumbers, searchRoll));

        // Search in names
        String searchName = "Yudhvir";
        System.out.println("Searching Name " + searchName + ": " +
                searchElement(names, searchName));
    }
}
