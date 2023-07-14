package org.example.generics.collections;

import java.util.ArrayList;
import java.util.List;

public class GCList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Devin");
        list.add("lesli");
        list.add("ally");

//        System.out.println(list);

        for(String s : list){
            System.out.println(s);
        }
    }


}
