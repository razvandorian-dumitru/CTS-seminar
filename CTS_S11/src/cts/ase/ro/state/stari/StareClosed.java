package cts.ase.ro.state.stari;

import cts.ase.ro.state.Gate;

public class StareClosed implements Stare {
    @Override
    public void enter(Gate gate) {
        System.out.println("Autenthicate first!");

    }

    @Override
    public void authorize(Gate gate) {
        System.out.println("User Authorized");
        gate.setStare(new StareOpen());
    }
}
