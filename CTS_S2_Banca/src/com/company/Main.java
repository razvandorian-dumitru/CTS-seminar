package com.company;

import exceptii.IllegalTransferException;
import exceptii.InsufficientFundsException;

public class Main {

    public static void main(String[] args) {

        CurrentAccount currentAccount1 = new CurrentAccount(600, "123");
        System.out.printf(currentAccount1.getBalance() + "\n");
        CurrentAccount currentAccount2 = new CurrentAccount(1600, "124");
        System.out.printf(currentAccount2.getBalance() + "\n");

        try {
            currentAccount1.transfer(444200, currentAccount2);
        } catch (IllegalTransferException e) {
            e.printStackTrace();
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }
}

