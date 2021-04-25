package com.company.clase3;

import com.company.clase.Account;
import com.company.clase.BankAccount;
import com.company.exceptii.IllegalFundsException;
import com.company.exceptii.IllegalTransferException;
import com.company.interfete.Depositable;
import com.company.interfete.Transferable;
import com.company.interfete.Withdrawable;

public class CreditAccount extends BankAccount implements Depositable, Withdrawable {

    public CreditAccount(double balance, String iban) {
        super(balance, iban);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0)
            this.balance += amount;
    }

    @Override
    public void withdraw(double amount) throws IllegalFundsException {
        if (amount > this.balance)
            throw new IllegalFundsException("Prea mare amount");
        if (amount > 0)
            this.balance += amount;
    }
}

