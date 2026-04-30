public class Practical35 {
 // Method to calculate average
    static double average(String[] values) throws NullPointerException, NumberFormatException {
 double sum = 0;
       for (String value : values) {
         if (value == null) {
                throw new NullPointerException("Null value found in array");
            }
         sum += Double.parseDouble(value);
        }   return sum / values.length;
    }
       public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");
        // Valid input
        String[] validValues = {"10.5", "20", "30.5"};
        // Invalid input examples
        String[] invalidNumber = {"10", "abc", "30"};
        String[] nullValue = {"10", null, "30"};
        // Valid case
        try {
            System.out.println("Valid Input Test:");
            double avg = average(validValues);
            System.out.println("Average: " + avg);
      } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Processing completed\n");
        }
  // Invalid number case
        try {
            System.out.println("Invalid Number Test:");
            double avg = average(invalidNumber);
            System.out.println("Average: " + avg);

        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());

        } finally {
            System.out.println("Processing completed\n");
        }

        // Null value case
        try {
            System.out.println("Null Value Test:");
            double avg = average(nullValue);
            System.out.println("Average: " + avg);

        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());

        } finally {
            System.out.println("Processing completed");
        }
    }
}
