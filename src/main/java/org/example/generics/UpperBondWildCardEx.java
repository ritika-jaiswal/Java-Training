package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBondWildCardEx {
    private static Double add(List<? extends Number> list){
        double sum = 0.0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(10);
        System.out.println(add(list1));

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(10.0);
        list2.add(20.2);
        System.out.println(add(list2));
    }
}
