// Custom Exception
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
// Library class
class Library {
    private int availableBooks;
  // Constructor
    public Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }
  // Method to issue books
    public void issueBook(int count) throws BookNotAvailableException {

        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining Books: " + availableBooks);

        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}
public class Practical37 {
    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");
       Library lib = new Library(3);

        try {
            // Valid issue
            lib.issueBook(2);
            System.out.println();

            // Invalid issue
            lib.issueBook(2);

        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("\nLibrary process completed.");
    }
}
