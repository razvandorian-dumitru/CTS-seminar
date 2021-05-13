package cts.ase.ro.exempluacs;

import cts.ase.ro.exempluacs.adapter.AdapterCont;
import cts.ase.ro.exempluacs.adapter.BankAccount;
import cts.ase.ro.exempluacs.factory.ContBancar;
import cts.ase.ro.exempluacs.single.SingleBanca;

public class Program {
    public static void main(String[] args) {
        SingleBanca singleBanca = SingleBanca.getInstance("BCR", "Centru");

        ContBancar contBancar1 = singleBanca.createInstance("CREDIT");

        ContBancar contBancar2 = singleBanca.createInstance("DEBIT");
        BankAccount bankAccount = new AdapterCont();
        System.out.println(SingleBanca.NRCONTURI);


        ContBancar adapterCont = new AdapterCont();
        System.out.println(adapterCont);

        adapterCont.transfer(contBancar1, 200);
        System.out.println(adapterCont);

        adapterCont.depune(500);
        System.out.println(adapterCont);

        ((BankAccount) adapterCont).accountTransfer(bankAccount, 200);
        System.out.println(adapterCont);


    }
}
