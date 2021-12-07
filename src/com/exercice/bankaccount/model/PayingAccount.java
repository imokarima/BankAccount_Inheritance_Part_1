package com.exercice.bankaccount.model;

public class PayingAccount extends BankAccount {

    private double operationFees = 5;

    @Override
    public void deposit(double value) {
        this.sold += Math.abs(value) - operationFees;
    }

    @Override
    public void withdraw(double value) {
        this.sold -= Math.abs(value) - operationFees;
    }
}
