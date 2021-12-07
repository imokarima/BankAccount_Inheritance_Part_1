package com.exercice.bankaccount.model;

import java.util.Objects;

public class BankAccount extends Object {

    private static int counterNumAccount;

    private final int numAccount;
    protected double sold;

    public BankAccount(double sold) {
        this.numAccount = ++counterNumAccount;
        this.sold = sold;
    }

    public BankAccount() {
        this.numAccount = ++counterNumAccount;
        this.sold = 0;
    }

    public void deposit(double value) {
        this.sold += value;
    }

    public void withdraw(double value) {
        this.sold -= value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        BankAccount that = (BankAccount) obj;
        return this.numAccount == that.numAccount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numAccount);
    }

    @Override
    public String toString() {
        return "Account n " + this.numAccount + " with balance : " + this.sold;
    }
}
