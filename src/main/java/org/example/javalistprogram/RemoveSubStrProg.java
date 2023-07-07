package org.example.javalistprogram;


import java.util.ArrayList;
import java.util.List;

public class RemoveSubStrProg {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(29);
        list.add(10);
        list.add(45);
        list.add(5);
        list.add(56);
        list.add(34);
        int fromIndex = 2, endIndex = 5;
        System.out.println("Original List: " + list);
        list.subList(fromIndex, endIndex).clear();
        System.out.println("Final List: " + list);

    }
}
