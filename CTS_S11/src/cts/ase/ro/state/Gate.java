package cts.ase.ro.state;

import cts.ase.ro.state.stari.Stare;

public class Gate {
    private Stare stare;

    public Gate() {
        this.stare = null;
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void enter() {
        System.out.println("Enter gate");
        stare.enter(this);
    }
}
