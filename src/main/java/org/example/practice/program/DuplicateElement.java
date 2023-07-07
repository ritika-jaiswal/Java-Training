package org.example.practice.program;


public class DuplicateElement {
    public static void main(String argu[]) {
        int arr[] = { 2, 3, 7, 2, 4, 7, 8, 3, };
        // int count = 0;
        int ans[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            ans[arr[i] - 1]++;
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.println(ans[i]);
        }

    }
}
