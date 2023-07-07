package org.example.basicprogram;
// java program to check whether input
// character is a vowel or consonant


public class VowelOrConstant {
    public static String isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return (ch + " is a vowel");
        else
            return (ch + " is a constant");
    }

    public static void main(String[] args) {

        System.out.println(isVowel('r'));
        System.out.println(isVowel('u'));
    }

}
