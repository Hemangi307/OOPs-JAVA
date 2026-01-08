import java.util.Scanner;

class Practical5{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnrollment No.: 240390107011\n");
        System.out.print("Enter amount to be dispensed: ");
        int amount = sc.nextInt();

        int note100, note50, note10, note5, note2, note1;

        note100 = amount / 100;
        amount = amount % 100;

        note50 = amount / 50;
        amount = amount % 50;

        note10 = amount / 10;
        amount = amount % 10;

        note5 = amount / 5;
        amount = amount % 5;

        note2 = amount / 2;
        amount = amount % 2;

        note1 = amount;

        System.out.println("\nCurrency Notes:");
        System.out.println("100 : " + note100);
        System.out.println("50  : " + note50);
        System.out.println("10  : " + note10);
        System.out.println("5   : " + note5);
        System.out.println("2   : " + note2);
        System.out.println("1   : " + note1);
    }
}
