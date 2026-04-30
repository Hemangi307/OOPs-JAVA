import java.io.*;
public class Practical44 {
    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;
        BufferedReader br = null;
        try {
            // Open file
            br = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                // Count lines
                lineCount++;
                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
                // Count characters excluding spaces
                charCount += line.replace(" ", "").length();
            }
            // Display results
            System.out.println("File Name: data.txt");
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces): " + charCount);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }    } catch (IOException e) {
                System.out.println("Error closing file."); }
            System.out.println("\nFile processing completed.");
        } } }
