package org.example.javacoreapi.stringformating;

public class StringFormatingEx1 {
    public static void main(String[] args) {
        String name = "Ritiika";
        String sf1 = String.format("My name is %s",name);
        String sf2 = String.format("age is %d", 22);
        String sf3 = String.format("Salary is %f", 30321.2123);
        String sf4 = String.format("Vlaue is %30.1f", 32.334323);

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
        System.out.println(sf4);
        System.out.println();

        String str1 = String.format("%d", 201);
        String str2 = String.format("%s","Ritika Jaiswal");
        String str3 = String.format("%f", 201.212);
        String str4 = String.format("%x", 300);
        String str5 = String.format("%c",'r');
        String st6 = "Jaiswal";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(st6);
    }
}
