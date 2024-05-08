import java.io.File;

public class GetFileDataExample {
    public static void main(String[] args) {
        File file = new File("example.txt");

        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Readable: " + file.canRead());
        System.out.println("File size in bytes: " + file.length());
    }
}
