import java.io.*;
import java.net.*;

public class StreamingServer {
    public static void main(String[] args) {
        int port = 8080;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port " + port);

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     FileInputStream fileInputStream = new FileInputStream("path/to/largefile.mp4");
                     BufferedOutputStream out = new BufferedOutputStream(clientSocket.getOutputStream())) {

                    System.out.println("Connected to client: " + clientSocket.getInetAddress());

                    byte[] buffer = new byte[4096];
                    int bytesRead;

                    while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                        out.write(buffer, 0, bytesRead);
                    }
                } catch (IOException e) {
                    System.err.println("Error: " + e.getMessage());
                }
            }
        } catch (IOException ex) {
            System.err.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
