package Together;

public class SuperProphet extends Prophet{
    private String message;
    public SuperProphet(String name){
        super(name);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void prophesy(){
        super.prophesy();
        System.out.println(getMessage());
    }
}
