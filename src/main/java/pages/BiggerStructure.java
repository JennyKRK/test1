package pages;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BiggerStructure {
    protected String url;
    protected BsTextExtractor bsTextExtractor;
    protected BsSaver bsSaver;
    protected List<Ibsfilter> ibsFilterList;

    public BiggerStructure(String url, BsTextExtractor bsTextExtractor, BsSaver bsSaver) {
        this.url = url;
        this.bsTextExtractor = bsTextExtractor;
        this.bsSaver = bsSaver;
        this.ibsFilterList = new ArrayList<>();
    }

    public void startMe() throws IOException {
        Document document = null;
        document = Jsoup.connect(this.url).get();
        List<String> extracts = bsTextExtractor.getExtracts(document);
        for (Ibsfilter bsFilter : ibsFilterList) {
            bsSaver.printToAFile(bsFilter.filterExtracts(extracts));
            System.out.println("done");
        }
    }

    public void addFilter(Ibsfilter bsFilter) {
        ibsFilterList.add(bsFilter);
    }
}
