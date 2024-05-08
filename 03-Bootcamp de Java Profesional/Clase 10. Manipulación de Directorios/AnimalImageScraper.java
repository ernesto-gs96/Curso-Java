import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.net.URL;
// https://www.kaggle.com/datasets/akash2907/bird-species-classification/data

public class AnimalImageScraper {

    public static void main(String[] args) {
        try {
            // Example: Scraping from a specific website
            String url = "http://example.com/animals";
            Document doc = Jsoup.connect(url).get();
            Elements images = doc.select("img[src$=.jpg]"); // Select jpg images

            for (Element img : images) {
                String imgUrl = img.absUrl("src");
                String fileName = imgUrl.substring(imgUrl.lastIndexOf("/") + 1);
                String animalType = determineAnimalType(fileName); // Implement this based on file name or another attribute

                // Save in directory based on animal type
                File saveDir = new File("images/" + animalType);
                if (!saveDir.exists()) saveDir.mkdirs();

                FileUtils.copyURLToFile(new URL(imgUrl), new File(saveDir, fileName));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String determineAnimalType(String fileName) {
        // Implement logic to determine animal type based on the file name or other attributes
        return "unknown"; // Default directory
    }
}
