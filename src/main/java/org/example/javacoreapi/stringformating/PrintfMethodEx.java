package org.example.javacoreapi.stringformating;

public class PrintfMethodEx {
    public static void main(String[] args) {
        int intValue = 321;
        double doubleValue = 32.1232;
        String stringValue = "Ritika";

        System.out.printf("Integer %d, Double %.2f, String %s%n", intValue, doubleValue,stringValue);

//        Formating number

        double value = 123.4321;
        System.out.printf("Formetted value: %.2f%n", value);

        String name = "Ritzz";
        int age = 22;
        System.out.printf("Name is %s, Age is %d%n", name,age);

        int number = 42;
        System.out.printf("Number: %+d%n", number);

        double pi = 3.141592652589;
        System.out.printf("PI: %.4f%n",pi);

    }
}
