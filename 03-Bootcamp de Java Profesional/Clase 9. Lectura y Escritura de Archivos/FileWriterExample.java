import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String data = "Hello, this is a sample text.";

        try (FileWriter writer = new FileWriter("sample.txt")) {
            writer.write(data);
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
