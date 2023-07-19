package org.example.javacoreapi.stringformating;

public class StringFormatingEx3 {
    public static void main(String[] args) {
        String name = "Ritika Jaiswal";
        int age = 22;
        double weight = 39.2;

        String formattedString = String.format("Hello, My name is %s, I'm %d years old, and my weight is %.1f kg.", name, age,weight);
        System.out.println(formattedString);
    }
}
