package org.example.arraylistpractice;


import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<>();
        languages.add("C");
        languages.add("C++");
        languages.add("Java");
        languages.add("React Js");
        languages.add("C");
        // System.out.println(languages);
        // System.out.println(languages.contains("C"));
        // System.out.println(languages.remove("C++"));
        // System.out.println(languages);
        // System.out.println(languages.clear());
        // System.out.println(languages.size());

        // Loop through hashset
        for (String string : languages) {
            System.out.println(string);
        }
    }
}
