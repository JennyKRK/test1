package org.example;
import java.util.Scanner;

public class ScannerIf {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me your name");
        String reply = scanner.next();
        if (reply.startsWith("J")){
            System.out.println("Hello J");
        } else if (reply.startsWith("A")) {
            {
                System.out.println("Hello A");
            }
        }
        else {
            System.out.println("Hello " + reply);
        }

    }
}

