package org.example;

public class IfDiverse {

    public static void main(String[] args){
        simpleif("John");
        switchName("Jimmy");
        switchName("Allie");
        divide(100,10);
        divide(20000,0);
    }

    static void simpleif(String name){
        if (name.equals("John")){
            System.out.println("hello John");
        }
        else {
            System.out.println("go away, please");
        }
    }

    static void switchName(String name){
        switch (name){
            case "John" -> {
                System.out.println("Hello John");
            }

            case "Jimmy" -> {
            System.out.println("Hello Jimmy");
            }

            default -> {
                System.out.println("ET go home!");
            }
        }
    }

    static void divide(int a, int b){
        try {System.out.println(a/b);}
        catch (Exception e) {
            System.out.println("wrong numbers");
            System.out.println(e.toString());
        }

    }

}
