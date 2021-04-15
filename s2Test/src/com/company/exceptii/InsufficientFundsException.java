package com.company.exceptii;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
