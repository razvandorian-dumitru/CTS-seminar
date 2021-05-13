package cts.ase.ro.exempluacs.factory;

public interface ContBancar {
    void transfer(ContBancar destinatie, double suma);

    void depune(double suma);
}
