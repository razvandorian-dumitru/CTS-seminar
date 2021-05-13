package cts.ase.ro.command;

import cts.ase.ro.command.comenzi.CommandInterface;

public class RemoteControl {
    CommandInterface lightOnComand;
    CommandInterface lightOffComand;
    CommandInterface lightDimComand;
    CommandInterface lightIncreaseComand;

    public RemoteControl(CommandInterface lightOnComand, CommandInterface lightOffComand,
                         CommandInterface lightDimComand, CommandInterface lightIncreaseComand) {
        this.lightOnComand = lightOnComand;
        this.lightOffComand = lightOffComand;
        this.lightDimComand = lightDimComand;
        this.lightIncreaseComand = lightIncreaseComand;
    }

    public void pressLightOn() {
        this.lightOnComand.execute();
    }

    public void pressLightOff() {
        this.lightOffComand.execute();
    }

    public void pressLightDim() {
        this.lightDimComand.execute();
    }

    public void pressLightIncrease() {
        this.lightIncreaseComand.execute();
    }
}
