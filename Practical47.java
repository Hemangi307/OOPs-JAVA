import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Practical47 {
    public static void main(String[] args) {
        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");
        Scanner sc = new Scanner(System.in);
        // Accept sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        // Split sentence into words
        String[] words = sentence.split("\\s+");
        // Create HashMap
        HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
        // Count frequency
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        // Display result
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        sc.close();
    }
}
