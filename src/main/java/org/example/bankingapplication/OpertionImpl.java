package org.example.bankingapplication;

import java.util.Scanner;

public class OpertionImpl implements Opertions {

    int balance;
    int previousTransaction;
    String userName;
    String accountNo;

    OpertionImpl(String userName, String accountNo){
        this.userName = userName;
        this.accountNo = accountNo;
    }

    @Override
    public void deposit(int amount) {
        if(amount != 0){
            balance = balance + amount;
            previousTransaction = amount;
            System.out.println("Your Deposited amount is: " + amount);
            System.out.println("Total Balance : " + balance);
        }
    }

    @Override
    public void withdrwal(int amount) {
        if(amount <= balance){
            balance = balance - amount;
            previousTransaction = -amount;
            System.out.println("Withdrawl amount " + amount +" succesfully!");
            System.out.println("Total Balance : " + balance);

        }else if(amount > balance){
            System.out.println("Inefficient Balance, please first check your balance");
        }
    }

    @Override
    public String getPriviousTransaction() {
      if(previousTransaction > 0){
          return "Deposited amount: " + previousTransaction;
      }
      else if(previousTransaction < 0){
          return "Withdrwal Amount: " + previousTransaction;
        }
      else{
          return "No Transaction Occured";
      }
    }

    @Override
    public void shownMenu() {
         char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("**************************************************");
        System.out.println("WellCome to FRSPL Services!");
        System.out.println("USER_NAME: " + userName + "\n" + "Account Number: " + accountNo );
        System.out.println("**************************************************" + "\n");

        System.out.println("Please choose any option in below mentioned:");
        System.out.println("A. Check balance");
        System.out.println("B. Deposite");
        System.out.println("C. Withdrawal");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Exit");

        do{
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("Enter an Option");
            System.out.println("-----------------------------------------------------------------------------");
            option = scanner.next().charAt(0);
            if(Character.isLowerCase(option)){
                option = Character.toUpperCase(option);
            }else{}

            System.out.println("\n");

            switch (option){
                case 'A':
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Balance = " + balance);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B' :
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Enter an amount to deposite");
                    System.out.println("----------------------------------------------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C' :
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Enter an amount to withdrawl");
                    System.out.println("----------------------------------------------------------------------------");
                    int amount1 = scanner.nextInt();
                    withdrwal(amount1);
                    System.out.println("\n");
                    break;

                case 'D' :
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
        }while (option != 'E');
        System.out.println("Thank You! for using our services");
        scanner.close();
    }
}
