import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;

public class ImageProcessingExample {

    public static void main(String[] args) {
        try {
            File inputFile = new File("SomeExample.jpeg"); // Replace with your image file
            BufferedImage inputImage = ImageIO.read(inputFile);

            // Resize the image
            BufferedImage resizedImage = resizeImage(inputImage, 150, 150);

            // Convert to grayscale
            BufferedImage grayscaleImage = convertToGrayscale(resizedImage);

            // Save the processed image
            File outputFile = new File("SomeExample_processed.jpeg"); // Replace with your image file
            ImageIO.write(grayscaleImage, "jpeg", outputFile);

            System.out.println("Image processing completed successfully.");
        } catch (IOException e) {
            System.err.println("Error processing image: " + e.getMessage());
        }
    }

    private static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) {
        BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = resizedImage.createGraphics();
        graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
        graphics2D.dispose();
        return resizedImage;
    }

    private static BufferedImage convertToGrayscale(BufferedImage image) {
        final BufferedImage blackAndWhiteImage = new BufferedImage(
            image.getWidth(null), 
            image.getHeight(null), 
            BufferedImage.TYPE_BYTE_BINARY);
        final Graphics2D g = (Graphics2D) blackAndWhiteImage.getGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return blackAndWhiteImage;
    }
}