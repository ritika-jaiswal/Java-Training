package org.example.arraylistpractice;


import java.util.*;

public class LinkedListPract {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Ritz");
        names.add("Pari");
        names.add("Paro");
        names.add("Prkhr");

        System.out.println(names);
        names.addFirst("Ritika");
        names.addLast("Jaiswal");
        System.out.println(names);
        names.removeFirst();
        names.removeLast();
        System.out.println(names);
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
    }
}
