package pages;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


public class SimplestStructure {
    public static void main(String[] args) throws IOException {
        String myUrl = "https://www.gazeta.pl";
        simpleExtractor(myUrl);

    }

    public static void simpleExtractor(String url) throws IOException {
        Document document = null;
        document = Jsoup.connect(url).get();
        String extractedText = document.body().text();
        String[] extractedParts = extractedText.split("\\.");
        for (String s : extractedParts) {
            System.out.println(s);
        }
    }
}
