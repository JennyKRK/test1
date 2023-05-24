package org.example;

import java.util.Random;

public class Simple1 {
    public static void main(String[] args) {
        String name = "John";
        String surname = "Brown ";
        int a = 3;
        System.out.println((name + " " + surname).repeat(a));

        Random random = new Random();
        int b = random.nextInt(11);
        System.out.println("hello ".repeat(b));

    }
}
