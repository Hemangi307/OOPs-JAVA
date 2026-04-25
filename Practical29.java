import java.util.Scanner;

// Interface
interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

// Abstract class (partial implementation)
abstract class PartialOrder implements Order {
    protected String item;
    protected int qty;
    protected int orderId;
    protected static int idCounter = 1;

    // Implement only placeOrder()
    public void placeOrder(String item, int qty) {
        this.item = item;
        this.qty = qty;
        this.orderId = idCounter++;
        System.out.println("Order placed successfully!");
        System.out.println("Order ID: " + orderId);
    }
}

// Concrete class
class FinalOrder extends PartialOrder {

    // Implement cancelOrder()
    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order ID " + orderId + " has been cancelled.");
        } else {
            System.out.println("Invalid Order ID!");
        }
    }

    // Implement generateBill()
    public void generateBill() {
        int pricePerItem = 100; // fixed price for simplicity
        int total = qty * pricePerItem;

        System.out.println("\n----- BILL -----");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Price per item: Rs. " + pricePerItem);
        System.out.println("Total Amount: Rs. " + total);
    }
}
class Practical29 {
    public static void main(String[] args) {

        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");

        Scanner sc = new Scanner(System.in);

        FinalOrder order = new FinalOrder();

        // Take order input
        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        order.placeOrder(item, qty);

        // Menu
        System.out.println("\n1. Generate Bill");
        System.out.println("2. Cancel Order");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            order.generateBill();
        } else if (choice == 2) {
            System.out.print("Enter Order ID to cancel: ");
            int id = sc.nextInt();
            order.cancelOrder(id);
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}