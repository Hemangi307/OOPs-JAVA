import java.io.*;
public class Practical42 {
    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");
 // Check command-line argument
        if (args.length != 1) {
            System.out.println("Usage: java FileCount <filename>");
            return;
        }
        String fileName = args[0];

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                // Count characters
                charCount += line.length();
                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
            br.close();
            System.out.println("File Name: " + fileName);
            System.out.println("Number of Lines: " + lineCount);
            System.out.println("Number of Words: " + wordCount);
            System.out.println("Number of Characters: " + charCount);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
