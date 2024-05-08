import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try (InputStream input = new BufferedInputStream(new FileInputStream("example.txt"))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buffer)) != -1) {
                String data = new String(buffer, 0, bytesRead);
                System.out.print(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
