package com.company;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    public String[] denumireProiect;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }


    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }


    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }


    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }


    public int getNrProiecte() {
        return nrProiecte;
    }

    public void setNrProiecte(int nrProiecte) {
        this.nrProiecte = nrProiecte;
    }

    public void statut() {
        if (punctaj >= 80)
            System.out.printf("Aplicant: " + this.nume + " " + this.prenume + " -> ACCEPTAT\n");
        else System.out.printf("Aplicant: " + this.nume + " " + this.prenume + " -> RESPINS\n");

    }

    public Aplicant() {
        this.nume = "_";
        this.prenume = "_";
        this.varsta = 0;
        this.punctaj = 0;
        this.nrProiecte = 0;
        this.denumireProiect = null;
    }

    public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.punctaj = punctaj;
        this.nrProiecte = nrProiecte;
        this.denumireProiect = denumireProiect;
    }


}
