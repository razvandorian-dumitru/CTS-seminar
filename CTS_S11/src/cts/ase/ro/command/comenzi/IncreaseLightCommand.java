package cts.ase.ro.command.comenzi;

import cts.ase.ro.command.LightBulb;

public class IncreaseLightCommand implements CommandInterface {
    LightBulb lightBulb;

    public IncreaseLightCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        lightBulb.increaseLightIntensity();
    }
}
