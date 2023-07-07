package org.example.arraylistpractice;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrListPract {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(65);
        nums.add(26);
        nums.add(22);
        nums.add(80);
        nums.add(55);

        System.out.println(nums);
        // System.out.println(nums.get(3));
        // System.out.println(nums.size());
        // System.out.println(nums.set(3, 66));
        // nums.clear();
        // System.out.println(nums);

        // System.out.println(nums.remove(3));

        // Loop through an arraylist using for loop
        // for (int i = 0; i < nums.size(); i++) {
        // System.out.println(nums.get(i));
        // }

        // Loop through an arraylist using forEach loop
        Collections.sort(nums);
        for (Integer integer : nums) {
            System.out.println(integer);

        }
    }

}
