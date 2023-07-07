package org.example.basicprogram;


import java.util.Scanner;

public class Factorial {

    public static int findFactorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter a number which you want to know factorial of that number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("The Factorial of " + num + " is " + findFactorial(num));
    }

}
