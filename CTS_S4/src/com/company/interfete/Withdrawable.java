package com.company.interfete;

import com.company.exceptii.IllegalFundsException;

public interface Withdrawable {
    public void withdraw(double amount) throws IllegalFundsException;

}
