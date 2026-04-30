import java.io.*;

public class Practical43 {
    public static void main(String[] args) {

        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");

        FileWriter fw = null;
        BufferedReader br = null;

        try {
            // Writing student records to file
            fw = new FileWriter("students.txt");

            fw.write("101 Hemangi 85\n");
            fw.write("102 Nimu 90\n");
            fw.write("103 Lakshya 78\n");

            fw.close();

            System.out.println("Student records written successfully.\n");

            // Reading student records from file
            br = new BufferedReader(new FileReader("students.txt"));

            String line;

            System.out.println("Student Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());

        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }

                if (br != null) {
                    br.close();
                }

            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }

            System.out.println("\nFile handling process completed.");
        }
    }
}