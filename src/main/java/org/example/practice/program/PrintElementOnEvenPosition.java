package org.example.practice.program;

public class PrintElementOnEvenPosition {
    public static void main(String args[]) {
        int[] arr = new int[] { 2, 3, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i + 1]);
            }
        }

    }
}
