package org.example.basicprogram;
// Java Program to Read The Number From Standard Input


import java.util.Scanner;

public class ReadSccanerValue {
    public static void main(String[] args) {
        int num;
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        num = input.nextInt();
        System.out.println("Entered number is: " + num);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a  name: ");
        name = scanner.next();
        System.out.println("Entered name is: " + name);

    }

}
