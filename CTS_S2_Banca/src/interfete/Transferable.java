package interfete;

import com.company.Account;
import exceptii.IllegalTransferException;
import exceptii.InsufficientFundsException;

public interface Transferable {

    public abstract void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException ;

}
