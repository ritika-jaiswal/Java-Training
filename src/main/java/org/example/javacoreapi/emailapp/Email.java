package org.example.javacoreapi.emailapp;

import java.util.Scanner;

class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength = 10;
    private String companySufix = "";

    public Email(String firstName, String lastName, String companySufix) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companySufix = companySufix;

        System.out.println("Email Created: " + firstName + " " + lastName);
        this.department = setDepartement();
        System.out.println("\nDepartment: " + this.department);

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySufix.toLowerCase();
        System.out.println("Your email is : " + email);

        System.out.println("You want to change the password \n 1. yes\n 2. No\n press 1 Or 2");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();
        if (choise == 1) {
            System.out.println("Enter your new password: ");
            Scanner inputValue = new Scanner(System.in);
            changePassword(inputValue.nextLine());
            this.password = getPassword();
        } else {
            showInfo();
        }

    }

    private String setDepartement() {
        System.out.println(
                "Department Codes\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\n Enter Department code");
        Scanner sc = new Scanner(System.in);
        int departmentchoise = sc.nextInt();
        if (departmentchoise == 1) {
            return "sales";
        } else if (departmentchoise == 2) {
            return "Development";
        } else if (departmentchoise == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }


    public void changePassword(String chngPass) {
        this.password = chngPass;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "\nDISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMAPNY EMAIL: " + email +
                "\nEMAIL PASSWORD: " + password ;
    };
}