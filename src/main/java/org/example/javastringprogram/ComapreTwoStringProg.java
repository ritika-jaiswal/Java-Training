package org.example.javastringprogram;

public class ComapreTwoStringProg {

    public static int stringCompare(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);

        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int) str1.charAt(i);
            int str2_ch = (int) str2.charAt(i);
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }

        if (l1 != l2) {
            return l1 - l2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        String str1 = "Ritika";
        String str2 = "Jaiswal";
        String str3 = "Muskan";
        String str4 = "Muskan";

        System.out.println("Comapring: " + str1 + " and " + str2 + " : " + stringCompare(str1, str2));
        System.out.println("Comapring: " + str2 + " and " + str3 + " : " + stringCompare(str2, str3));
        System.out.println("Comapring: " + str3 + " and " + str4 + " : " + stringCompare(str3, str4));
    }
}

