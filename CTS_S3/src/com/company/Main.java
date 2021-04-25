package com.company;

import com.company.clase2.Bank;
import com.company.clase.BankAccount;
import com.company.clase2.AccountType;

public class Main {

    public static void main(String[] args) {
        Bank banca = new Bank();
        BankAccount cont1 = banca.openBankAccount(AccountType.CURRENT);

    }
}
