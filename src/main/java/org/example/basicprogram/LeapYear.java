package org.example.basicprogram;

import java.util.Scanner;

public class LeapYear {

    public static void leapyearOrNot(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Specified year is leap year");
        else
            System.out.println("Specified year is not a leap year");
    }

    public static void main(String[] args) {
        int year;
        System.out.println("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        leapyearOrNot(year);

    }
}
