package com.company;

import java.util.Arrays;

public class Elev extends Aplicant {
    private int clasa;
    private String tutore;

    public Elev() {
        this.clasa = 0;
        this.tutore = "-";
    }

    public Elev(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect,
                int clasa, String tutore) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.clasa = clasa;
        this.tutore = tutore;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", punctaj=" + punctaj +
                ", nrProiecte=" + nrProiecte +
                ", denumireProiect=" + Arrays.toString(denumireProiect) +
                ", clasa=" + clasa +
                ", tutore='" + tutore + '\'' +
                '}';
    }

    public int finantare() {
        int suma = 10;
        System.out.printf("Angajatul: " + this.nume + " " + this.prenume + " -> " + suma + " Euro/zi.\n");
        return suma;
    }
}