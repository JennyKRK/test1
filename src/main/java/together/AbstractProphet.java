package together;

public abstract class AbstractProphet {
    protected String myMessage;

    protected AbstractProphet(String myMessage) {
        this.myMessage = myMessage;
    }

    public String getMyMessage() {
        return myMessage;
    }

    public void setMyMessage(String myMessage) {
        this.myMessage = myMessage;
    }

    protected void printMyMessage() {
        System.out.println(getMyMessage());
    }
}
