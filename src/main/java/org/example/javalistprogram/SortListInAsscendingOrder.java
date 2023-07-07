package org.example.javalistprogram;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListInAsscendingOrder {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("I");
        strList.add("am");
        strList.add("Learning");
        strList.add("Core");
        strList.add("Java");
        System.out.println("UnSorted List: " + strList);
        Collections.sort(strList);
        System.out.println("Sorted List: " + strList);

    }

}
