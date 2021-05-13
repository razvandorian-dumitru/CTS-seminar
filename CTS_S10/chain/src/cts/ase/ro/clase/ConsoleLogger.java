package cts.ase.ro.clase;

import cts.ase.ro.Verbosity;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(Verbosity level) {
        super(level);
    }

    @Override
    void write(String message) {
        System.out.println(ConsoleLogger.class.getName() + ": " + message);
    }
}
