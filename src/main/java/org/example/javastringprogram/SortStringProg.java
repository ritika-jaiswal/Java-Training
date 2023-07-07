package org.example.javastringprogram;

import java.util.Arrays;

 public class SortStringProg {
     public static void main(String[] args) {
         // String str = new String("Ritika");
         String str = "Ritika";
         char[] arr = str.toCharArray();
         char temp;
         int i = 0;
         while (i < arr.length) {
             int j = i + 1;
             while (j < arr.length) {
                 if (arr[j] < arr[i]) {
                     temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
                 j += 1;
             }
             i += 1;
         }
         System.out.println(arr);
     }

 }
//class Sortarry {
//    public static String sortarry(String str) {
//        char[] tempArry = str.toCharArray();
//        Arrays.sort(tempArry);
//        return new String(tempArry);
//    }
//}
//
//public class SortStringProg {
//    public static void main(String[] args) {
//        String str = "Ritika ef efe";
//        System.out.println("Original String: " + str);
//        System.out.println("Sorted String: " + Sortarry.sortarry(str));
//    }
//}
