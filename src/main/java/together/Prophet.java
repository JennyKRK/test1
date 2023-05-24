package together;

public class Prophet {

    protected String name;

    public Prophet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void prophesy() {
        System.out.println("Hello, my dear. My name is " + getName() + " I am a prophet");
    }
}
