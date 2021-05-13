package cts.ase.ro.clase;

import cts.ase.ro.Verbosity;

import java.io.*;

public class FileLogger extends AbstractLogger {

    public FileLogger(Verbosity level) {
        super(level);
    }

    @Override
    void write(String message) {
        System.out.println("Writing log message to file");
        File file = new File("log.txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(message);
            writer.close();
        } catch (IOException e) {
            System.err.println("Cant write Log");
        }
    }
}
