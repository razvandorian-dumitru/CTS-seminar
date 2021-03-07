package com.company;

import java.util.Arrays;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public int getAnStudii() {
        return anStudii;
    }

    public void setAnStudii(int anStudii) {
        this.anStudii = anStudii;
    }

    public Student(String facultate, int anStudii) {
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

    public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect,
                   String facultate, int anStudii) {
        super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
        this.facultate = facultate;
        this.anStudii = anStudii;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", punctaj=" + punctaj +
                ", nrProiecte=" + nrProiecte +
                ", denumireProiect=" + Arrays.toString(denumireProiect) +
                ", facultate='" + facultate + '\'' +
                ", anStudii=" + anStudii +
                '}';
    }

    public int finantare() {
        int suma = 20;
        System.out.printf("Angajatul: " + this.nume + " " + this.prenume + " -> " + suma + " Euro/zi.\n");
        return suma;
    }
}
