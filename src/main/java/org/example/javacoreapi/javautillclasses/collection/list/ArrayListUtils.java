package org.example.javacoreapi.javautillclasses.collection.list;

import java.util.ArrayList;

public class ArrayListUtils {
    public static int findSum(ArrayList<Integer> list){
        if(list == null || list.isEmpty()){
            throw  new IllegalArgumentException("Input list can not be empty");
        }
        int sum = 0;
        for(int num : list){
            sum += num;
        }
        return  sum;
    }

    public static double average(ArrayList<Integer> list){
        if(list == null || list.isEmpty()){
            throw  new IllegalArgumentException("Input list can not be empty");
        }
        int sum = findSum(list);
        return (double) sum/list.size();
    }
}
