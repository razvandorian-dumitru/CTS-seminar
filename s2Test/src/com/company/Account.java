package com.company;

import com.company.exceptii.InsufficientFundsException;

public abstract class Account {
    //abstracta -> sablon pt alte clase

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws InsufficientFundsException;

    public abstract void transfer(double amount, Account destination);

    public abstract double getBalance();
}
