package org.example.practice.program;

import java.text.DecimalFormat;

public class CheckPercantageInString {

    static void charPercentage(String input) {
        int totalChar = input.length();
        int uppercase = 0;
        int lowerCase = 0;
        int digits = 0;
        int others = 0;

        for (int i = 0; i < totalChar; i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                others++;
            }
        }

        double upperCaseLetterPercentage = (uppercase * 100) / totalChar;
        double lowerCaseLetterPercentage = (lowerCase * 100) / totalChar;
        double digitsPercentage = (digits * 100) / totalChar;
        double otherCharPercentage = (others * 100) / totalChar;

        DecimalFormat format = new DecimalFormat("##.##");
        System.out.println("In '" + input + "' : ");
        System.out.println("Uppercase letters are " + format.format(upperCaseLetterPercentage) + "% ");
        System.out.println("Lowercase letters are " + format.format(lowerCaseLetterPercentage) + "%");
        System.out.println("Digits Are " + format.format(digitsPercentage) + "%");
        System.out.println("Other Characters Are " + format.format(otherCharPercentage) + "%");
    }

    public static void main(String[] args) {
        charPercentage("India is my country 100%");
    }
}
