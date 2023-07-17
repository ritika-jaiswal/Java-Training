package org.example.javacoreapi.regularexpression;

import java.util.Scanner;
import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
//        String text = "Hello, my email is example@example.com";
//
//        // Creating a pattern and matching it against the text
//        Pattern pattern = Pattern.compile("\\b\\w+@\\w+\\.\\w+\\b");
//        Matcher matcher = pattern.matcher(text);
//
//        // Finding matches in the text
//        while (matcher.find()) {
//            String match = matcher.group();
//            System.out.println("Match found: " + match);
//        }
//
//        // Replacing matches in the text
//        String replacedText = matcher.replaceAll("[email]");
//        System.out.println("Replaced text: " + replacedText);

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)

        System.out.println("by character classes and quantifiers ...");
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true
        System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true

        System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)
        System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)
        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true


        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Enter regex pattern:");
            Pattern pattern = Pattern.compile(sc.nextLine());
            System.out.println("Enter text:");
            Matcher matcher = pattern.matcher(sc.nextLine());
            boolean found = false;
            while (matcher.find()) {
                System.out.println("I found the text "+matcher.group()+" starting at index "+
                        matcher.start()+" and ending at index "+matcher.end());
                found = true;
            }
            if(!found){
                System.out.println("No match found.");
            }
        }
    }


}

