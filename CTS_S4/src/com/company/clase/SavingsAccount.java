package com.company.clase;

import com.company.exceptii.IllegalFundsException;
import com.company.exceptii.IllegalTransferException;
import com.company.interfete.Depositable;
import com.company.interfete.Profitable;
import com.company.interfete.Transferable;
import com.company.interfete.Withdrawable;

public class SavingsAccount extends BankAccount
        implements Depositable, Withdrawable, Transferable, Profitable {
    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) throws IllegalFundsException {

        if (amount > this.balance) throw new IllegalFundsException("Illegal Funds");
        else this.balance -= amount;
    }

    @Override
    public void transfer(double amount, Depositable destination)
            throws IllegalFundsException, IllegalTransferException {
        if (amount > ((BankAccount) destination).getBalance())
            throw new IllegalFundsException("Fonduri insuficiente!!!");
        if (((BankAccount) destination).iban.equals(this.iban))
            throw new IllegalTransferException("Iban Identic!!!");
        else {
            this.withdraw(amount);
            destination.deposit(amount);
        }
    }
        public void addInterest(double interest) {
        this.balance *= (1 + interest / 100);
    }
}
