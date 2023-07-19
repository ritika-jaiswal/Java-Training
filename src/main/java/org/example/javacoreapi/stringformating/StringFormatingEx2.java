package org.example.javacoreapi.stringformating;

public class StringFormatingEx2 {
    public static void main(String[] args) {
        String str1 = String.format("%d", 302);
        String str2 = String.format("|%10d|",302);
        String str3 = String.format("|%-10d|",302);
        String str4 = String.format("|%d|",302);
        String str5 = String.format("|%010d|",302);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

    }
}
