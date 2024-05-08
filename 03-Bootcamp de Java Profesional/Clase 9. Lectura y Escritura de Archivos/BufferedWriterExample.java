import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String content = "Hello, World!\nWelcome to Java Programming.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"))) {
            writer.write(content);
            writer.newLine(); // Adds a new line
            writer.write("End of message.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
