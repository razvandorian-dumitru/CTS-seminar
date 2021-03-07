package com.company;

import exceptii.IllegalTransferException;
import exceptii.InsufficientFundsException;

public class SavingsAccount extends BankAccount{
    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {

    }

    @Override
    public void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException {

    }
}
