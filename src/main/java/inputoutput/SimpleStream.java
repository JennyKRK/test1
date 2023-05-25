package inputoutput;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SimpleStream implements Serializable {
    private String name;
    private List<String> booksRead;

    public SimpleStream(String name) {
        super();
        this.name = name;
        this.booksRead = new ArrayList<>();
    }

    public void addABook(String title) {
        booksRead.add(title);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getBooksRead() {
        return booksRead;
    }

    public void setBooksRead(List<String> booksRead) {
        this.booksRead = booksRead;
    }
}
