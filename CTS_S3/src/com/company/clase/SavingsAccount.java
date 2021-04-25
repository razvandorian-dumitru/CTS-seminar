package com.company.clase;

import com.company.exceptii.IllegalFundsException;
import com.company.exceptii.IllegalTransferException;
import com.company.interfete.Profitable;

public class SavingsAccount extends BankAccount implements Profitable {


    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) throws IllegalFundsException {

        if (amount > this.balance) throw new IllegalFundsException("Illegal FUnds");
        else this.balance -= amount;
    }

    @Override
    public void transfer(double amount, Account destination)
            throws IllegalFundsException, IllegalTransferException {
        if (amount > destination.getBalance())
            throw new IllegalFundsException("Fonduri insuficiente!!!");
        if (((BankAccount) destination).iban.equals(this.iban))
            throw new IllegalTransferException("Iban Identic!!!");
        else {
            this.withdraw(amount);
            destination.deposit(amount);
        }
    }

    @Override
    public void addInterest(double interest) {
        this.balance *= (1 + interest / 100);
    }
}
