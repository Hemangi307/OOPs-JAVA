import java.util.ArrayList;
// Generic class
class Box<T> {
    private ArrayList<T> items = new ArrayList<T>();
    // Method to add item
    public void addItem(T item) {
        items.add(item);
    }
    // Method to display items
    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
// Main class
public class Practical49 {
    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");
        // Box for names
        Box<String> nameBox = new Box<String>();
        nameBox.addItem("Hemangi");
        nameBox.addItem("Priya");
        nameBox.addItem("Rahul");
        // Box for roll numbers
        Box<Integer> rollBox = new Box<Integer>();
        rollBox.addItem(101);
        rollBox.addItem(102);
        rollBox.addItem(103);
        // Display names
        System.out.println("Names in Box:");
        nameBox.displayItems();
        // Display roll numbers
        System.out.println("\nRoll Numbers in Box:");
        rollBox.displayItems();
    }
}
