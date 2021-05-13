package cts.ase.ro.clase;

import cts.ase.ro.Verbosity;

public class ErrorLogger extends  AbstractLogger{
    public ErrorLogger(Verbosity level) {
        super(level);
    }

    @Override
    void write(String message) {
        System.err.println(ConsoleLogger.class.getName() + ": " + message);
    }
}
