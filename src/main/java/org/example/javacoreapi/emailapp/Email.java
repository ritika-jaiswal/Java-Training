package org.example.javacoreapi.emailapp;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength = 10;
    private String emailSufix = "";
    String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";

    public Email(String firstName, String lastName, String emailSufix) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailSufix = emailSufix;

        System.out.println("Email Created: " + firstName + " " + lastName);
        this.department = setDepartement();
        System.out.println("\nDepartment: " + this.department);

        this.password = randomPassword(defaultPasswordLength,passwordRegex);
        System.out.println("Your password is: " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + emailSufix.toLowerCase();
        System.out.println("Your email is : " + email);

        System.out.println("You want to change the password \n 1. yes\n 2. No\n press 1 Or 2");
        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();
        if (choise == 1) {
            System.out.println("Enter your new password: ");
            Scanner inputValue = new Scanner(System.in);
            String value = inputValue.nextLine();
//            if(value.length() < defaultPasswordLength){
                changePassword(value,passwordRegex);
                this.password = getPassword();
//            }else{System.out.println("Password may not be include more than ten character");}

        } else {
            showInfo();
        }
    }

    public String setDepartement() {
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

    public String randomPassword(int length, String passwordRegex) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@$!%*#?&";

//        char[] password = new char[length];
//        for (int i = 0; i < length; i++) {
//            int rand = (int) (Math.random() * passwordSet.length());
//            password[i] = passwordSet.charAt(rand);
//        }
//        return new String(password);

        Pattern pattern = Pattern.compile(passwordRegex);
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        while (true) {
            password.setLength(0); // Clear the password StringBuilder for each iteration

            // Generate a random password of the desired length
            for (int i = 0; i < length; i++) {
                int index = random.nextInt(passwordSet.length());
                password.append(passwordSet.charAt(index));
            }

            // Check if the generated password matches the regex pattern
            Matcher matcher = pattern.matcher(password);
            if (matcher.matches()) {
                break;
            }
        }

        return password.toString();
    }
    public void changePassword(String chngPass, String passwordRegex) {
//        String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(chngPass);
        try{
            if (matcher.matches()) {
                this.password = chngPass;
            }else{
                System.out.println("Password is invalid. Please use a stronger and valid password.");

            }
        }catch (Exception e){
            System.out.println("Password is invalid. Please use a stronger password.");
        }

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