import java.io.*;
import java.util.Date;

public class Practical45  {
    public static void main(String[] args) {

        System.out.println("Name: Hemangi Chavda");
        System.out.println("Enrollment Number: 240390107011\n");

        // Check minimum arguments
        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("Copy: java FileOperations copy source.txt destination.txt");
            System.out.println("Delete: java FileOperations delete filename.txt");
            System.out.println("Rename: java FileOperations rename oldname.txt newname.txt");
            return;
        }

        String command = args[0].toLowerCase();

        try {

            switch (command) {

                case "copy":
                    if (args.length != 3) {
                        System.out.println("Invalid arguments for copy");
                        return;
                    }

                    copyFile(args[1], args[2]);
                    displayProperties(new File(args[2]));
                    break;

                case "delete":
                    File deleteFile = new File(args[1]);

                    if (deleteFile.exists()) {
                        if (deleteFile.delete()) {
                            System.out.println("File deleted successfully.");
                        } else {
                            System.out.println("Unable to delete file.");
                        }
                    } else {
                        throw new FileNotFoundException("File not found.");
                    }
                    break;

                case "rename":
                    if (args.length != 3) {
                        System.out.println("Invalid arguments for rename");
                        return;
                    }

                    File oldFile = new File(args[1]);
                    File newFile = new File(args[2]);

                    if (!oldFile.exists()) {
                        throw new FileNotFoundException("Source file not found.");
                    }

                    if (oldFile.renameTo(newFile)) {
                        System.out.println("File renamed successfully.");
                        displayProperties(newFile);
                    } else {
                        System.out.println("Unable to rename file.");
                    }
                    break;

                default:
                    System.out.println("Invalid command.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }

    // Copy file method
    static void copyFile(String source, String destination) throws IOException {

        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(destination);

        int data;

        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();

        System.out.println("File copied successfully.");
    }

    // Display file properties
    static void displayProperties(File file) {
        System.out.println("\nFile Properties:");
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Last Modified: " + new Date(file.lastModified()));
    }
}