package com.company;

import exceptii.IllegalTransferException;
import exceptii.InsufficientFundsException;

public abstract class Account {

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws InsufficientFundsException;

    public abstract void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException ;

    public abstract double getBalance();
}
