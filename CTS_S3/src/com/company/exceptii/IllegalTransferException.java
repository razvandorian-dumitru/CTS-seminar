package com.company.exceptii;

public class IllegalTransferException extends Exception {

    public IllegalTransferException() {
    }

    public IllegalTransferException(String message) {
        super(message);
    }
}
