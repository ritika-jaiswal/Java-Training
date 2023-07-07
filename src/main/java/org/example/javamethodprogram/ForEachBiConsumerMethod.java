package org.example.javamethodprogram;


import java.util.Hashtable;
import java.util.Map;

public class ForEachBiConsumerMethod {
    public static void main(String[] args) {
        Map<String, Integer> table = new Hashtable<>();
        table.put("Pen", 100);
        table.put("Copy", 200);
        table.put("Mobile", 20000);

        table.forEach((k, v) -> {
            v = v + 100;
            table.replace(k, v);
        });
        table.forEach((k, v) -> {
            System.out.println("Key: " + k + " Value: " + v);
        });
    }

}
