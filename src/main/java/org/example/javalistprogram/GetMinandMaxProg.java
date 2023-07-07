package org.example.javalistprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GetMinandMaxProg {
    public static Integer findMin(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList.get(0);

    }

    public static Integer findMax(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList.get(sortedList.size() - 1);
    }

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(29);
        arrList.add(10);
        arrList.add(45);
        arrList.add(5);

        System.out.println("Original Array: " + arrList);
        System.out.println("Min: " + findMin(arrList));
        System.out.println("Max: " + findMax(arrList));
    }

}
