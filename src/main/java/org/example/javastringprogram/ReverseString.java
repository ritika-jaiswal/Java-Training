package org.example.javastringprogram;

public class ReverseString {
    public static void main(String[] args) {
        String name = "ritika";

        // Using nrml implementaion method
        // String nstr = "";
        // char ch;
        System.out.println("Original String: " + name);
        // for (int i = name.length() - 1; i >= 0; i--) {
        // ch = name.charAt(i);
        // nstr += ch;
        // }
        // System.out.println("Reverse String: " + nstr);

        // Using StringBuilder Class
        // StringBuilder stb = new StringBuilder(name); // Same as SgtringBuffer

        // System.out.println("Reverse String: " + stb.reverse());

        // Usinf toCharArray method
        char[] chArr = name.toCharArray();
        System.out.print("Reverse Array: ");
        for (int i = chArr.length - 1; i >= 0; i--) {
            System.out.print(chArr[i]);
        }
    }
}
