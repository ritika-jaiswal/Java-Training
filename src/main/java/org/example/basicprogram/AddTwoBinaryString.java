package org.example.basicprogram;

public class AddTwoBinaryString {

    static String add_binary(String x, String y) {

        int num1 = Integer.parseInt(x, 2);
        int num2 = Integer.parseInt(y, 2);
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);
        return result;
    }

    public static void main(String[] args) {
        String x, y;
        x = "1011";
        y = "0100";
        System.out.println("The sum two binary number is: " + add_binary(x, y));

    }
}

