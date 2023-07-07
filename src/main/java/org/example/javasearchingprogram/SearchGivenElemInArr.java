package org.example.javasearchingprogram;
// Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].
import java.util.Scanner;

public class SearchGivenElemInArr {

    static int searchElement(int[] arr, int search, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 54, 12, 3, 10};
        System.out.println("Element of an array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nEnter the number which u want to fount in array");
        Scanner scanner = new Scanner(System.in);
        int search = scanner.nextInt();
        int n = arr.length;
        int index = searchElement(arr, search, n);

        if (index == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is fount in position: " + index);

    }

}
