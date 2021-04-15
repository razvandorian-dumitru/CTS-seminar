package com.company.derivate;

import com.company.Account;
import com.company.BankAccount;
import com.company.exceptii.InsufficientFundsException;

public class CurrentAccount extends BankAccount {
    public static double MAX_CREDIT = 5000;

    public CurrentAccount() {
        super();
    }

    public CurrentAccount(double balance, String IBAN) {
        super(balance, IBAN);
    }

    @Override
    public void deposit(double amount) {
        this.setBalance(getBalance()+amount);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (this.getBalance() >= amount)
            this.setBalance(getBalance() - amount);
        else throw new InsufficientFundsException("Fonduri insuficiente");
    }

    @Override
    public void transfer(double amount, Account destination) {

    }
}
