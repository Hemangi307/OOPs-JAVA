public class VotingApp {

    // Method to check voting eligibility
    static void checkEligibility(int age) {

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {

        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");

        // Test ages
        int[] ages = {16, 18, 25};

        for (int age : ages) {

            System.out.println("Checking age: " + age);

            try {
                checkEligibility(age);

            } catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());

            } finally {
                System.out.println("Validation process completed\n");
            }
        }
    }
}
