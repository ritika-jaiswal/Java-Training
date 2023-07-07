package org.example.practice.program;

public class SwapWithoutThirdVar {
    public static void main(String[] args) {
        String a = "Love";
        String b = "Mumma";
        System.out.println("before Swapping " + a + " " + b);
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("after Swapping " + a + " " + b);

        // Swpaing two numbers
        // int a = 6;
        // int b = 2;
        // System.out.println("before Swapping " + a + " " + b);
        // a = a + b;
        // b = a - b;
        // a = a - b;
        // System.out.println("after Swapping " + a + " " + b);

    }

}
