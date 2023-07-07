package org.example.javastringprogram;


// Java program to Remove leading/preceding
// zeros from a given String
public class RemoveLeadingZerosProg {

    public static String removeZero(String str) {
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;

        StringBuffer stb = new StringBuffer(str);
        stb.replace(0, i, "");
        return stb.toString();
    }

    public static void main(String[] args) {
        String str = "0000012334";
        System.out.println("Original string: ");
        str = removeZero(str);
        System.out.println("Newly String: " + str);
    }
}
