import java.util.Scanner;

class BillGenerator {

    // For regular customers (no discount)
    void generateBill(int itemTotal) {
        System.out.println("Customer Type: Regular");
        System.out.println("Total Bill Amount: Rs. " + itemTotal);
    }

    // For privileged customers (flat discount in rupees)
    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Customer Type: Privileged");
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Total Bill Amount: Rs. " + finalAmount);
    }

    // For festive offers (percentage discount)
    void generateBill(int itemTotal, double discountPercent) {
        double discountAmount = itemTotal * discountPercent / 100;
        double finalAmount = itemTotal - discountAmount;
        System.out.println("Customer Type: Festive Offer");
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Total Bill Amount: Rs. " + finalAmount);
    }
}

public class Practical15 {
    public static void main(String[] args) {
 
        System.out.println("Enrollment No:240390107011");

        Scanner sc = new Scanner(System.in);
        BillGenerator bill = new BillGenerator();

        System.out.print("Enter item total amount: ");
        int total = sc.nextInt();

        System.out.println("Select Customer Type:");
        System.out.println("1. Regular Customer");
        System.out.println("2. Privileged Customer");
        System.out.println("3. Festive Offer");
        int choice = sc.nextInt();

        System.out.println();

        switch (choice) {
            case 1:
                bill.generateBill(total);
                break;

            case 2:
                System.out.print("Enter flat discount (Rs): ");
                int discount = sc.nextInt();
                bill.generateBill(total, discount);
                break;

            case 3:
                System.out.print("Enter discount percentage: ");
                double percent = sc.nextDouble();
                bill.generateBill(total, percent);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
