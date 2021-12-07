package com.exercice.bankaccount;

import com.exercice.bankaccount.model.BankAccount;
import com.exercice.bankaccount.model.PayingAccount;
import com.exercice.bankaccount.model.SavingAccount;

public class Main {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(100);
        SavingAccount b2 = new SavingAccount();
        BankAccount b3 = new PayingAccount();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b1.deposit(10);
        b2.deposit(200);
        b3.deposit(300);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b1.withdraw(8);
        b2.withdraw(8);
        b3.withdraw(8);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        b2.calculPrimeRate();

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        if (b1.equals(b1)) {
            System.out.println("b1 == b1");
        }

        if (b1.equals(b2)) {
            System.out.println("b1 == b2");
        }else {
            System.out.println("b1 != b2");
        }

    }
}
