package com.company;

import com.company.clase.Account;
import com.company.clase.BankAccount;
import com.company.clase.CurrentAccount;
import com.company.exceptii.IllegalFundsException;
import com.company.exceptii.IllegalTransferException;

public class Main {

    public static void main(String[] args) {

        CurrentAccount ca = new CurrentAccount(200, "Test1");
        CurrentAccount ca2 = new CurrentAccount(200, "Test2");
        try {
            ca.transfer(200, ca2);
        } catch (IllegalTransferException e) {
            e.printStackTrace();
        } catch (IllegalFundsException e) {
            e.printStackTrace();
        }

        System.out.println(ca.getBalance());
        System.out.println(ca2.getBalance());

    }
}
