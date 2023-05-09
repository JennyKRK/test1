package Patterns;

public class Printer {
    private IWelcome iwelcome;

    public Printer() {
        Configuration c = Configuration.getInstance();
        iwelcome = c.getDefaultWelcome();
    }

    public IWelcome getIwelcome() {
        return iwelcome;
    }

    public void setIwelcome(IWelcome iwelcome) {
        this.iwelcome = iwelcome;
    }

    public void printMe(){
        getIwelcome().printWelcome();
    }
}
