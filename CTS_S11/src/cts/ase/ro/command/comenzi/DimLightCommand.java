package cts.ase.ro.command.comenzi;

import cts.ase.ro.command.LightBulb;

public class DimLightCommand implements CommandInterface {
    private LightBulb lightBulb;

    public DimLightCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        lightBulb.dimLight();
    }
}
