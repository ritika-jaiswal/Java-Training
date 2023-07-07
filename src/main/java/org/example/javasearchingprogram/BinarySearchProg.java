package org.example.javasearchingprogram;

// Java implementation of recursive Binary Search
// Java implementation of recursive Binary Search
class BinarySearchProg {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[]) {
        BinarySearchProg ob = new BinarySearchProg();
        int arr[] = { 2, 3, 4, 10, 40, 20 };
        int n = arr.length;
        int x = 20;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " +
                    result);
    }
}

// Java Program to demonstrate working of binarySearch()
// Method of Arrays class In a sorted array

// Importing required classes
// import java.util.Arrays;

// // Main class
// public class BinarySearchProg {

// // Main driver method
// public static void main(String[] args) {
// // Declaring an integer array
// int arr[] = { 10, 20, 15, 22, 35 };

// // Sorting the above array
// // using sort() method of Arrays class
// Arrays.sort(arr);

// int key = 22;
// int res = Arrays.binarySearch(arr, key);

// if (res >= 0)
// System.out.println(
// key + " found at index = " + res);
// else
// System.out.println(key + " Not found");

// key = 40;
// res = Arrays.binarySearch(arr, key);
// if (res >= 0)
// System.out.println(
// key + " found at index = " + res);
// else
// System.out.println(key + " Not found");
// }
// }
