package com.company.derivate;

import com.company.Account;
import com.company.BankAccount;
import com.company.exceptii.InsufficientFundsException;

public class SavingsAccount extends BankAccount {
    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount)throws InsufficientFundsException {

    }

    @Override
    public void transfer(double amount,Account destination) {

    }

    @Override
    public double getBalance() {
        return 0;
    }
}
