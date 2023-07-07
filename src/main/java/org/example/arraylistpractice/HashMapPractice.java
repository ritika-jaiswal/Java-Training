package org.example.arraylistpractice;


import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> mapValue = new HashMap<>();
        mapValue.put(1, "Ritika");
        mapValue.put(2, "Mayuri");
        mapValue.put(3, "Muskan");
        mapValue.put(4, "Himanshu");
        mapValue.put(1, "Ritika");

        // System.out.println(mapValue.remove(2));
        // System.out.println(mapValue);
        // System.out.println(mapValue.keySet());
        // System.out.println(mapValue.get(1));
        // System.out.print(mapValue.clear());
        // System.out.println(mapValue.size());

        // Print keys:
        // for (int i : mapValue.keySet()) {
        // System.out.println(i);
        // }

        // Print Values
        // for (String string : mapValue.values()) {
        // System.out.println(string);
        // }

        // Print Keys & Values
        for (int value : mapValue.keySet()) {
            System.out.println("Keys:" + value + "  Values:" + mapValue.get(value));
        }
    }
}
