import java.io.*;
import java.net.*;

public class StreamingClient {
    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 8080;

        try (Socket socket = new Socket(hostname, port);
             BufferedInputStream in = new BufferedInputStream(socket.getInputStream());
             FileOutputStream fileOutputStream = new FileOutputStream("path/to/save/largefile.mp4")) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File downloaded");
        } catch (UnknownHostException ex) {
            System.err.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.err.println("I/O error: " + ex.getMessage());
        }
    }
}
