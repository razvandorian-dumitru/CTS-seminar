package com.company.clase;

import com.company.exceptii.IllegalFundsException;
import com.company.exceptii.IllegalTransferException;

public abstract class Account {
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws IllegalFundsException;

    public abstract void transfer(double amount, Account destination)
            throws IllegalFundsException, IllegalTransferException;

    public abstract double getBalance();
}
