package org.example.javalistprogram;


import java.util.ArrayList;
import java.util.List;

public class FindCommonElemInTwoArray {
    public static void main(String[] args) {
        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
        List<Integer> num3 = new ArrayList<>();

        num1.add(20);
        num1.add(28);
        num1.add(30);
        num1.add(40);

        num2.add(10);
        num2.add(20);
        num2.add(30);
        num2.add(28);

        System.out.println("list1 : " + num1);
        System.out.println("List2: " + num2);

        // Using collection.retail]nsAl() method
        // num1.retainAll(num2);
        // System.out.println(num1);

        // using loop find commomn element
        for (Integer temp : num1) {
            if (num2.contains(temp))
                num3.add(temp);
        }

        System.out.println("Commmon Element in list1 & list2 is: " + num3);
    }

}

