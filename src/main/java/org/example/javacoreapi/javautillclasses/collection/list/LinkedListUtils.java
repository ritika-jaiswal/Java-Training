package org.example.javacoreapi.javautillclasses.collection.list;

import java.util.LinkedList;

public class LinkedListUtils {
    public static int findSum(LinkedList<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Input list cannot be empty.");
        }
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public static double findAverage(LinkedList<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Input list cannot be empty.");
        }
        int sum = findSum(list);
        return (double) sum / list.size();
    }
}

