import java.util.Scanner;

class Practical6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnrollment No.: 240390107011\n");
        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int result = 0;
        int place = 1;
        int carry = 0;

        while (num > 0) {
            int digit = num % 10;      // extract last digit
            int sum = digit + 1 + carry;

            if (sum == 10) {
                result += 0 * place;  // store 0
                carry = 1;            // carry forward
            } else {
                result += sum * place;
                carry = 0;
            }

            place *= 10;
            num /= 10;
        }

        System.out.println("Resulting number: " + result);
    }
}
