package org.example.bankingapplication;

public class BankingApp {
    public static void main(String[] args) {
        OpertionImpl bankAccount = new OpertionImpl("Ritika Jaiswal" , "877005279332");
        bankAccount.shownMenu();
    }
}
