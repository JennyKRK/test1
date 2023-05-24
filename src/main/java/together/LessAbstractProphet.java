package together;

public class LessAbstractProphet extends AbstractProphet {
    protected String myName;

    protected LessAbstractProphet(String myMessage, String myName) {
        super(myMessage);
        this.myName = myName;
    }

    protected String getMyName() {
        return myName;
    }

    @Override
    protected void printMyMessage() {
        super.printMyMessage();
        System.out.println("By the way, my name is " + getMyName());
    }
}
