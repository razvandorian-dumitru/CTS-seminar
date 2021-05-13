package cts.ase.ro.state.stari;

import cts.ase.ro.state.Gate;

public interface Stare {
    void enter(Gate gate);

    void authorize(Gate gate);
}
