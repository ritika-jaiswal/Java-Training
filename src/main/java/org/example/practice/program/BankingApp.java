package org.example.practice.program;


import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Ritika Jaiswal", "6263@hd773933");
        obj.shownMenu();
    }
}

class BankAccount {
    int balance;
    int priviousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            priviousTransaction = amount;
            System.out.println("Your Deposited amount is : " + amount);
        }
    }

    void withdrawl(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            priviousTransaction = -amount;
        }
    }

    void getPriviousTransaction() {
        if (priviousTransaction > 0) {
            System.out.println("Deposited amount : " + priviousTransaction);
        } else if (priviousTransaction < 0) {
            System.out.println("withdrawl amont : " + Math.abs(priviousTransaction));
        } else {
            System.out.println("No Transaction Occured");
        }
    }

    void shownMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wellcome" + " " + customerName);
        System.out.println("Your Id is " + customerId);
        System.out.println("\n");
        System.out.println("A. Check balance");
        System.out.println("B. Deposite");
        System.out.println("C. Withdrawl");
        System.out.println("D. Privious Transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Enter an Option");
            System.out.println("-----------------------------------------------------------------------------");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Enter an amount to deposite");
                    System.out.println("----------------------------------------------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Enter an amount to withdrawl");
                    System.out.println("----------------------------------------------------------------------------");
                    int amount1 = scanner.nextInt();
                    withdrawl(amount1);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("----------------------------------------------------------------------------");
                    getPriviousTransaction();
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("===============================================================");
                    break;

                default:
                    System.out.println("Invalid Option!, Please enter again!");
                    break;
            }
        } while (option != 'E');
        System.out.println("Thankq for using our sevices");
        scanner.close();
    }
}
