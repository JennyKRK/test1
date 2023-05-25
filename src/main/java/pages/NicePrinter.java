package pages;

public class NicePrinter {

    protected String str;

    public NicePrinter(String str) {
        this.str = str;
    }

    void printNicely() {
        System.out.println(str.toUpperCase());
    }
}
