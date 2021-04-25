package com.company.clase2;

import com.company.clase.BankAccount;
import com.company.clase.CurrentAccount;
import com.company.clase.SavingsAccount;

public class Bank {
    public static int nextId;

    public BankAccount openBankAccount(AccountType accountType) {
        //in main, o sa ne returneze BA, nu CA sau SA, face upcasting?

        if (accountType == AccountType.CURRENT) return new CurrentAccount();
        else if (accountType == AccountType.SAVINGS) return new SavingsAccount();
        else throw new UnsupportedOperationException("Codul nu e bun");
    }
}
