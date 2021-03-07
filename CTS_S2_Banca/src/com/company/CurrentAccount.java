package com.company;

import exceptii.IllegalTransferException;
import exceptii.InsufficientFundsException;

public class CurrentAccount extends BankAccount {
    //daca e scris cu litere mari si are o valoare default -> attr static

    public static double MAX_CREDIT = 5000;

    public CurrentAccount() {
        super();
    }

    public CurrentAccount(double balance, String iban) {
        super(balance, iban);

    }

    @Override
    public void deposit(double amount) {
        this.setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (this.getBalance() >= amount)
            this.setBalance(getBalance() - amount);
        else throw new InsufficientFundsException("Fonduri insuficiente!");
    }

    @Override
    public void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException {
        if (((BankAccount) destination).iban.equals(this.iban))
            throw new IllegalTransferException("Conturile coincid!");
        else {
            this.withdraw(amount);
            destination.deposit(amount);
        }
    }
}
