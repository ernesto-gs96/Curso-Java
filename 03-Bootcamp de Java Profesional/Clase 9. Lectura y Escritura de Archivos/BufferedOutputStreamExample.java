import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        String data = "This is a test of BufferedOutputStream.";

        try (FileOutputStream fileOutput = new FileOutputStream("test.txt");
             BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput)) {

            byte[] bytes = data.getBytes();
            bufferedOutput.write(bytes);

            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
