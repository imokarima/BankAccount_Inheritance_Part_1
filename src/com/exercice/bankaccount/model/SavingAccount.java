package com.exercice.bankaccount.model;

public class SavingAccount extends BankAccount {

    private int primeRate;

    public SavingAccount(double sold) {
        super(sold);
        this.primeRate = 6;
    }

    public SavingAccount() {
        this.primeRate = 6;
    }

    public void calculPrimeRate() {
        this.sold = this.sold * this.primeRate / 100;
    }
}
