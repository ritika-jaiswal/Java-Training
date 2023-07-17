package org.example.javacoreapi.emailapp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {

        System.out.println("Enter your first name: ");
        Scanner sc1 = new Scanner(System.in);
        String fn = sc1.nextLine();
        System.out.println("Enter your last name: ");
        Scanner sc2 = new Scanner(System.in);
        String ln = sc2.nextLine();

        Email email = new Email(fn, ln, "" + fn.charAt(0) + ln.charAt(0) + ".com");
        System.out.println(email.showInfo());
    }
}
