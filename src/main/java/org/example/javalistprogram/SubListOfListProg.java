package org.example.javalistprogram;


import java.util.ArrayList;
import java.util.List;

public class SubListOfListProg {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>() {
            {
                add(10);
                add(21);
                add(34);
                add(78);
                add(89);
            }
        };

        System.out.println("Original Array: " + arrList);
        List<Integer> arrList2 = new ArrayList<>();
        arrList2 = arrList.subList(2, 5);
        System.out.println("Substring List: " + arrList2);
    }
}

