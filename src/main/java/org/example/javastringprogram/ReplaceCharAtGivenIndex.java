package org.example.javastringprogram;


// java program to Replace a character at a specific index
public class ReplaceCharAtGivenIndex {
    public static void main(String[] args) {
        String str = "Ritika jaiswal";
        System.out.println("Original String: " + str);
        int index = 7;
        char chng = 'J';
        char ch = str.charAt(index);
        String newStr = str.replace(ch, chng);

        // str = str.substring(0, index) + chng // Using String Class
        // + str.substring(index + 1);

        // StringBuilder string = new StringBuilder(str); // Using StringBuilder same as
        // StringBuffer
        // string.setCharAt(index, chng);

        System.out.println("The newley String is: " + newStr);
    }

}
