package Together;

import java.util.logging.Level;

public class Test {
    public static void main(String[] args){
        Printing p = new Printing();
        p.printIt();
        Prophet prop = new Prophet("Lebioda");
        prop.prophesy();
        SuperProphet sp = new SuperProphet("Nabuchobonozor");
        sp.setMessage("The winter is coming");
        sp.prophesy();
        LessAbstractProphet lap = new LessAbstractProphet("The night is dark and full of terrors","Melisandre");
        lap.printMyMessage();
    }
}
