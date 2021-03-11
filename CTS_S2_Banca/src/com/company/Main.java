package com.company;

import exceptii.IllegalTransferException;
import exceptii.InsufficientFundsException;
import interfete.AccountType;

public class Main {

    public static void main(String[] args) {

       /* CurrentAccount currentAccount1 = new CurrentAccount(600, "123");
        System.out.printf(currentAccount1.getBalance() + "\n");
        CurrentAccount currentAccount2 = new CurrentAccount(1600, "124");
        System.out.printf(currentAccount2.getBalance() + "\n");

        try {
            currentAccount1.transfer(444200, currentAccount2);
        } catch (IllegalTransferException e) {
            e.printStackTrace();
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }*/

        SavingsAccount s1=new SavingsAccount(300,"IBAN");
        SavingsAccount s2=new SavingsAccount(400,"IBAN");
        s1.deposit(700);
        System.out.printf(""+s1.balance);
        s1.addInterest(20);
        System.out.printf(""+s1.balance);

        Bank banca =new Bank();

        BankAccount acc4=banca.openBankAccount(AccountType.SAVINGS);

    }
}

