package org.example.junitpractice;


public class JUnitPracticeEx {

    public static int findMin(int arr[]){
        int min = arr[0];
        for(int i = 0 ; i<arr.length ; i++){
            if(min>arr[i])
                min = arr[i];
        }
        return min;
    }
    public static int cube(int n) {
        return n * n * n;
    }

    public static String reverseString(String str) {
        String nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); //extracts each character
            nstr = ch + nstr; //adds each character in front of the existing string
        }
        return nstr;
    }
}
