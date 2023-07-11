package org.example.basicprogram;

// Java Program to Swap Two values using third variable


public class SwapTwoNo {
     public static void swapNo(int num1, int num2){
         int temp;
         System.out.println("Before swaping num1 = " + num1 + " num2 = " + num2);
         temp = num1;
         num1 = num2;
         num2 = temp;
//         System.out.println("After swaping num1 = " + num1 + " num2 = " + num2);
         System.out.println(num1 + ", " +num2);
     }
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 44;
        swapNo(num1, num2);

    }

}

// creating a swapping method
// import java.util.*;

// class GFG {

// // Function to swap two numbers
// // Using temporary variable
// static void swapValuesUsingThirdVariable(int m, int n)
// {
// // Swapping the values
// int temp = m;
// m = n;
// n = temp;
// System.out.println("Value of m is " + m
// + " and Value of n is " + n);
// }

// // Main driver code
// public static void main(String[] args)
// {
// // Random integer values
// int m = 9, n = 5;

// // Calling above function to
// // reverse the numbers
// swapValuesUsingThirdVariable(m, n);
// }
// }
