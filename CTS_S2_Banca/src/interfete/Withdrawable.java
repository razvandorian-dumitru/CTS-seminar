package interfete;

import exceptii.InsufficientFundsException;

public interface Withdrawable {
    public abstract void withdraw(double amount) throws InsufficientFundsException;

}
