package org.example.basicprogram;

import java.util.Scanner;

public class Fibonacci {

    public static void fibonacci_series(int count) {
        int num1 = 0, num2 = 1, num3, i;
        System.out.print(num1 + " " + num2);
        for (i = 2; i < count; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3 + " ");
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String[] args) {
        System.out.println("Eneter a num upto end fibonacci series:");
        Scanner scanner = new Scanner(System.in);
        fibonacci_series(scanner.nextInt());

    }

}
