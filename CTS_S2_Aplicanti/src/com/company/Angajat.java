package com.company;

import java.util.Arrays;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;

    public Angajat() {
        super();
        this.ocupatie = "-";
        this.salariu = 0;
    }

    public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect,
                   String ocupatie, int salariu) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.ocupatie = ocupatie;
        this.salariu = salariu;
    }

    public String getOcupatie() {
        return ocupatie;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "ocupatie='" + ocupatie + '\'' +
                ", salariu=" + salariu +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", punctaj=" + punctaj +
                ", nrProiecte=" + nrProiecte +
                ", denumireProiect=" + Arrays.toString(denumireProiect) +
                '}';
    }

    public int finantare() {
        int suma = 30;
        System.out.printf("Angajatul: " + this.nume + " " + this.prenume + " -> " + suma + " Euro/zi.\n");
        return suma;
    }
}
