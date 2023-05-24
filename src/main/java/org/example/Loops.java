package org.example;

import java.util.Scanner;

public class Loops {


    static void yourName() {
        Scanner scanner = new Scanner(System.in);
        String reply = null;
        do {
            System.out.println("Give me your name");
            reply = scanner.next();
            if (reply.equals("x")) {
                System.out.println("Goodbye");
            } else {
                System.out.println("hello " + reply);
            }
        } while (!reply.equals("x"));
    }

    public static void printANumber() {
        for (int a = 1; a < 11; a++) {
            System.out.println(("x").repeat(a));
        }
    }

    void printATable() {
        int[] myTable = {1, 2, 3, 4, 5, 6};
        for (int a : myTable) {
            System.out.println(a);
        }
    }

}
