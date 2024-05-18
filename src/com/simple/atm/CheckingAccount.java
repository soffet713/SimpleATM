package com.simple.atm;

public class CheckingAccount extends Account{

    private double fee;

    public CheckingAccount(double bal, int pin, String type, double fee) {
        super(bal, pin, type);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }
}
