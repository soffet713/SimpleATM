package com.simple.atm;

public class ATM {
    public ATM() {
        System.out.println("Enter your PIN: ");
    }

    public void menu() {
        System.out.println("\n1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Balance Inquiry");
        System.out.println("4. Exit");
    }

    public void withdrawMenu() { System.out.println("Enter the amount you would like to withdraw: "); }
    public void depositMenu() { System.out.println("Enter the amount you would like to deposit: "); }
    public void balanceInquiryMenu(double balance) { System.out.printf("The balance is: $%.2f", balance); }
    public void invalidMessageMenu() { System.out.println("Invalid Option. Please try again."); }
    public void exitMenu() { System.out.println("Thank you for banking with us."); }
}
