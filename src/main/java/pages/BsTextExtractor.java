package pages;

import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BsTextExtractor {

    public List<String> getExtracts(Document document) throws IOException {
        String text = document.body().text();
        String[] extractsToProcess = text.split("\\.");
        List<String> extracts = new ArrayList<>();
        for (String e : extractsToProcess) {
            extracts.add(e);
        }
        return extracts;
    }
}
