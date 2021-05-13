package cts.ase.ro.state.stari;

import cts.ase.ro.state.Gate;

public class StareOpen implements Stare {
    @Override
    public void enter(Gate gate) {
        System.out.println("Entered succesfully");
        gate.setStare(new StareClosed());
    }

    @Override
    public void authorize(Gate gate) {
        System.out.println("Deja open");
    }
}
