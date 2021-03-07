package com.company;

public class Main {

    public static void main(String[] args) {
        String[] proiecte = {"Test1", "Test2", "Test3"};


        Elev e1 = new Elev("Elev", "1", 2100, 90, 0, null,
                13, "mata");
        Student s1 = new Student("Student", "1", 2100, 70, 0, null,
                "Ase", 3);
        Angajat a1 = new Angajat("Angajat", "1", 2100, 50, 0, null,
                "Ase", 3);
        System.out.printf(e1.toString() + "\n");
        System.out.printf(s1.toString() + "\n");
        System.out.printf(a1.toString() + "\n");

        e1.statut();
        s1.statut();
        a1.statut();
        e1.finantare();
        s1.finantare();
        a1.finantare();
    }
}
