package com.simple.atm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class Account implements Transactions{
    private final int accountNumber;
    private int pin;
    private double balance;
    private String accountType;

    // Feature to auto increment account number
    private static int nextAccountNumber = 1001;

    public Account(double bal, int pin, String type) {
        this.balance = bal;
        this.pin = pin;
        this.accountType = type;

        accountNumber = getNextAccountNumber();
    }

    public boolean validatePin(int p) {
        if(this.pin == p) {
            return true;
        }
        System.out.println("Invalid pin");
        return false;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public static int getNextAccountNumber() {
        int acctNo = nextAccountNumber;
        nextAccountNumber++;
        return acctNo;
    }

    @Override
    public boolean withdraw(double debitAmt) {
        if(debitAmt>this.balance) {
            System.out.println("Insufficient funds for withdrawal of " + debitAmt + ".");
            return false;
        }
        balance -= debitAmt;
        Transactions.recordTransaction(debitAmt, "debit");
        System.out.println("Please take your card and money.");
        return true;
    }

    @Override
    public boolean deposit(double creditAmt) {
        balance += creditAmt; // balance = balance + creditAmt
        Transactions.recordTransaction(creditAmt, "Credit");
        System.out.println("Deposit successful.");
        return true;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public String getType() {
        return accountType;
    }

    public boolean printTransactions() {
        StringBuilder content = new StringBuilder();

        try(BufferedReader reader = new BufferedReader(new FileReader("transactions.txt"))) {
            String currentLine;
            while((currentLine = reader.readLine()) != null) {
                content.append(currentLine).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(content);
        return true;
    }
}
