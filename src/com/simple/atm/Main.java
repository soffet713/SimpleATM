package com.simple.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pinNum;
        int userOption = 0;

        SavingsAccount account1 = new SavingsAccount(5000,1423, "Savings", .034f);
        CheckingAccount account2 = new CheckingAccount(10000, 9876, "Checking", 2.00);

        Scanner scanner = new Scanner(System.in);

        account1.printTransactions();

//        ATM atm = new ATM();
//
//        pinNum = scanner.nextInt();
//
//        if(account1.validatePin(pinNum)){
//            do {
//                atm.menu();
//                userOption = scanner.nextInt();
//                switch(userOption) {
//                    case 1 :
//                        atm.withdrawMenu();
//                        double withdrawAmount = scanner.nextDouble();
//                        if(account1.getType()=="Savings") {
//                            account1.withdraw(withdrawAmount);
//                        } else {
//                            account1.withdraw(withdrawAmount + account2.getFee());
//                        }
//                        break;
//                    case 2 :
//                        atm.depositMenu();
//                        double depositAmount = scanner.nextDouble();
//                        account1.deposit(depositAmount);
//                        break;
//                    case 3 :
//                        atm.balanceInquiryMenu(account1.getBalance());
//                        if(account1.getType()=="Savings") {
//                            System.out.printf("\nThe interest is: $%.2f", account1.calculateInterest()); // savings account
//                        }
//                        break;
//                    case 4 :
//                        atm.exitMenu();
//                        break;
//                    default :
//                        atm.invalidMessageMenu();
//                        break;
//                }
//            } while (userOption != 4);
//        }

//        System.out.println(account1.getBalance());
//        account1.deposit(700);
//        System.out.println(account1.getBalance());
//        account1.withdraw(10000);
//        System.out.println(account1.getBalance());
    }
}