package cts.ase.ro.command;

import cts.ase.ro.command.comenzi.*;

public class Main {

    public static void main(String[] args) {
        LightBulb lightbulb = new LightBulb();

        CommandInterface lightOnCommand = new TurnLightOnCommand(lightbulb);
        CommandInterface lightOffCommand = new TurnLightOffCommand(lightbulb);
        CommandInterface lightDimCommand = new DimLightCommand(lightbulb);
        CommandInterface lightIncreaseCommand = new IncreaseLightCommand(lightbulb);

        RemoteControl remoteControl = new RemoteControl(lightOnCommand, lightOffCommand,
                lightDimCommand, lightIncreaseCommand);

        remoteControl.pressLightOn();
        remoteControl.pressLightOff();
        remoteControl.pressLightDim();
        remoteControl.pressLightIncrease();

    }
}
