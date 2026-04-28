public class Practical33 {
    public static void main(String[] args) {

    
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");

        try {
            // Check if exactly 2 arguments are provided
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("Please provide numerator and denominator.");
            }

            // Convert command-line arguments to integers
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            // Check division by zero
            int result = numerator / denominator;

            // Display result
            System.out.println("Numerator: " + numerator);
            System.out.println("Denominator: " + denominator);
            System.out.println("Result: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integer values.");

        } catch (ArithmeticException e) {
            System.out.println("Error: Denominator cannot be zero.");

        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        }
    }
}