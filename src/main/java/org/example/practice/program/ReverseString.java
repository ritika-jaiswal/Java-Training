package org.example.practice.program;

public class ReverseString {
    public static void main(String[] args) {
        String input = "thiru";
        // StringBuilder sb = new StringBuilder();
        // sb.append(input);
        // sb.reverse();
        // System.out.println(sb);
        char[] str = input.toCharArray();
        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i]);
        }
    }
}