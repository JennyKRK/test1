package patterns;


public class Configuration {
    private static Configuration instance;

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public IWelcome getDefaultWelcome() {
        return new Welcome2();
    }
}
