package org.example.javalistprogram;


import java.util.ArrayList;
import java.util.List;

public class GetFrstAndLastElem {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(29);
        list.add(10);
        list.add(45);
        list.add(10);
        list.add(56);
        list.add(45);
        System.out.println("List of nums: " + list);
        // Collections.sort(list);
        int first = list.get(0);
        int last = list.get(list.size() - 1);

        System.out.println("First element of list: " + first);
        System.out.println("Last element of List: " + last);
    }

}
