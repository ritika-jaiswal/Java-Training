package org.example.basicprogram;

import java.util.Scanner;

public class AramstrongOrNot {
    public static void main(String[] args) {
        int num, digit, originalNum;

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        originalNum = num;
        int cubeSum = 0;
        originalNum = num;
        while (num != 0) {
            digit = num % 10;
            cubeSum += Math.pow(digit, 4); // write second parameter according to total digits in our number
            num /= 10;
        }
        if (cubeSum == originalNum) {
            System.out.println(originalNum + " is an ArmsStrong number");
        } else
            System.out.println(originalNum + " is not a armsstrong number");
    }

}
