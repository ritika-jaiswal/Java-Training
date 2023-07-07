package org.example.javastringprogram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLetterOfEachWord {
    public static void main(String[] args) {
        String s1 = "What are you doing?";
        String s2 = "I am Doing Some Importent work";
        Pattern p1 = Pattern.compile("\\b[a-zA-Z]");
        Pattern p2 = Pattern.compile("\\b[a-zA-Z]");
        Matcher m1 = p1.matcher(s1);
        Matcher m2 = p2.matcher(s2);
        System.out.println("First letter of each word");
        while (m1.find())
            System.out.print(m1.group() + " ");
        ;
        System.out.println();
        while (m2.find())
            System.out.print(m2.group() + " ");
    }
}
