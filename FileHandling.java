import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class FileHandling {

    static final String FILE_NAME = "sample.txt";

    public static void main(String[] args) {
        createFile();
        writeFile("Hello, this is a file handling example.\n");
        appendToFile("Appending some more text.\n");
        readFile();
        readFileLineByLine();
        deleteFile();
    }

    // 1. Create a new file
    public static void createFile() {
        try {
            File file = new File(FILE_NAME);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error while creating file: " + e.getMessage());
        }
    }

    // 2. Write to a file (overwrite existing content)
    public static void writeFile(String content) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            writer.write(content);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // 3. Append content to the file
    public static void appendToFile(String content) {
        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(content);
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }

    // 4. Read entire content at once
    public static void readFile() {
        try {
            String data = Files.readString(Path.of(FILE_NAME));
            System.out.println("\nFile Content (all at once):\n" + data);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // 5. Read file line by line using Scanner
    public static void readFileLineByLine() {
        try (Scanner scanner = new Scanner(new File(FILE_NAME))) {
            System.out.println("\nFile Content (line by line):");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    // 6. Delete the file
    public static void deleteFile() {
        File file = new File(FILE_NAME);
        if (file.delete()) {
            System.out.println("\nFile deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
