package com.company;

import interfete.AccountType;

public class Bank {
    public static int nextId;

    public BankAccount openBankAccount(AccountType tipCont) {
        if (tipCont == AccountType.CURRENT)
            return new CurrentAccount();
        if (tipCont == AccountType.SAVINGS)
            return new SavingsAccount();
        else throw new UnsupportedOperationException();
    }

}
