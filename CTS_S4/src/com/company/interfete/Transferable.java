package com.company.interfete;

import com.company.clase.Account;
import com.company.exceptii.IllegalFundsException;
import com.company.exceptii.IllegalTransferException;

public interface Transferable {
    public void transfer(double amount, Depositable destination)
            throws IllegalFundsException, IllegalTransferException;
}
