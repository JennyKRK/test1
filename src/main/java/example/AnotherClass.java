package example;

import java.util.ArrayList;

public class AnotherClass {
    private String name;
    private ArrayList<SimpleClass> listOfSimpleClasses;

    public AnotherClass(String name) {
        this.name = name;
        this.listOfSimpleClasses = new ArrayList<>();
    }

    public void addSimpleClass(SimpleClass sc) {
        listOfSimpleClasses.add(sc);
    }

    public String getName() {
        return name;
    }

    public int addAll() {
        int sum = 0;
        for (SimpleClass sc : this.listOfSimpleClasses) {
            sum += sc.simpleAddition();
        }
        return sum;
    }
}
