package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcard {

    public static void display(List<?> list){
        for(Object o : list){
            System.out.println(o);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println("Displaying integre value:");
        display(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("This");
        list2.add("is");
        list2.add("the");
        list2.add("UnboundedWildcard Generic");
        list2.add("Exapmle.");
        System.out.println("Displaying the String values.");
        display(list2);
    }
}
