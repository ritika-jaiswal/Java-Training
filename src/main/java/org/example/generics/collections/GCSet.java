package org.example.generics.collections;

import java.util.HashSet;
import java.util.Set;

public class GCSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(110);
        set.add(22);
        set.add(33);

        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
