package com.company.exceptii;

public class IllegalFundsException extends Exception {
    public IllegalFundsException() {
    }

    public IllegalFundsException(String message) {
        super(message);
    }
}
