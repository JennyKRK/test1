package org.example;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class DiverseForms {

    public static void main(String[] args) {
        System.out.println(createAnArray());
        System.out.println(createAHashSet());
        System.out.println(createAHashMap2());
        String[] someNames = new String[]{"Allie", "Bob", "Allie", "Cillian", "Doreah", "Bob"};
        String[] someNames2 = new String[]{"Allie", "Bob", "Cillian", "Doreah"};
        System.out.println(createAHashMap(someNames));
        System.out.println(createALinkedList(someNames2));

    }

    static ArrayList createAnArray() {
        ArrayList al = new ArrayList<String>();
        al.add("A");
        al.add("B");
        return al;
    }

    static HashSet createAHashSet() {
        HashSet hs = new HashSet<String>();
        hs.add("Allie");
        hs.add("Bob");
        hs.add("Cillian");
        hs.add("Doreah");
        hs.add("Bob");
        return hs;
    }

    static HashMap createAHashMap(String[] someNames) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (String name : someNames) {
            if (hm.containsKey(name)) {
                int i = hm.get(name);
                hm.replace(name, i + 1);
            } else {
                hm.put(name, 1);
            }
        }
        return hm;
    }

    static HashMap createAHashMap2() {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        String[] someNames = new String[]{"Allie", "Bob", "Cillian", "Doreah", "Bob", "Bob"};
        for (String name : someNames) {
            if (hm.containsKey(name)) {
                int i = hm.get(name);
                hm.replace(name, i + 1);
            } else {
                hm.put(name, 1);
            }
        }
        return hm;
    }

    static LinkedList createALinkedList(String[] someNames) {
        LinkedList myList = new LinkedList<>();


        for (String name : someNames) {
            HashMap hm = new HashMap<>();
            hm.put(name, name.length());
            myList.add(hm);
        }
        return myList;
    }


}
