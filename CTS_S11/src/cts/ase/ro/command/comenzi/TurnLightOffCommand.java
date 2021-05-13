package cts.ase.ro.command.comenzi;

import cts.ase.ro.command.LightBulb;

public class TurnLightOffCommand implements CommandInterface {

    LightBulb lightBulb;

    public TurnLightOffCommand(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void execute() {
        lightBulb.turnOffLight();
    }
}
