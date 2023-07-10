package org.example.basicprogram;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
         System.out.println("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return originalNumber == sum;
    }
}
