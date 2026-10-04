import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingDemo {

    public static void main(String[] args) {

        String fileName = "students.txt";

        // Writing data to the file
        try (FileWriter writer = new FileWriter(fileName)) {

            writer.write("Student ID: 300\n");
            writer.write("Name: Likhitha\n");
            writer.write("Course: Computer Science\n");
            writer.write("Age: 20\n");

            System.out.println("Data written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing to file: "
                    + e.getMessage());
        }

        // Reading data from the file
        System.out.println("\n===== FILE CONTENT =====");

        try (FileReader reader = new FileReader(fileName)) {

            int character;

            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

        } catch (IOException e) {
            System.out.println("Error while reading file: "
                    + e.getMessage());
        }
    }
}