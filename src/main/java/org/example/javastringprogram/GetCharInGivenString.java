package org.example.javastringprogram;

// Java program to get a specific character
// from a given String at a specific index
public class GetCharInGivenString {
    public static char getCharFromString(String str, int index) {
        return str.charAt(index); // using chatAt() mehtod find character at given
        // index
        // return str.toCharArray()[index]; //using toCharArray() mehtod find character
        // at given index
        // return (char) str.codePointAt(index); //using codePointAt() method
    }

    public static void main(String[] args) {
        String name = "Ritika Jaiswal";
        int index = 5;
        char ch = getCharFromString(name, index);
        System.out.println("The Character for " + name + " at index: " + ch);
    }
}
