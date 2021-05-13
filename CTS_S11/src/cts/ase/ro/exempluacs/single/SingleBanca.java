package cts.ase.ro.exempluacs.single;

import cts.ase.ro.exempluacs.factory.ContBancar;
import cts.ase.ro.exempluacs.factory.ContCredit;
import cts.ase.ro.exempluacs.factory.ContDebit;

public class SingleBanca {
    private String denumire;
    private String adresa;
    public static int NRCONTURI=0;

    private static SingleBanca INSTANCE;

    private SingleBanca(String denumire, String adresa) {
        this.denumire = denumire;
        this.adresa = adresa;
    }

    public static synchronized SingleBanca getInstance(String denumire, String adresa) {
        if (INSTANCE == null)
            INSTANCE = new SingleBanca(denumire, adresa);
        return INSTANCE;
    }

    public ContBancar createInstance(String tipCont) {
        ContBancar contBancar;
        switch (tipCont) {
            case "CREDIT":
                contBancar = new ContCredit();
                NRCONTURI++;
                break;
            case "DEBIT":
                contBancar = new ContDebit();
                NRCONTURI++;
                break;
            default:
                contBancar = null;
                break;
        }
        return contBancar;
    }
}
