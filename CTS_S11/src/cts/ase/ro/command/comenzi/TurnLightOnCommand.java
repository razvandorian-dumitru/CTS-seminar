package cts.ase.ro.command.comenzi;

import cts.ase.ro.command.LightBulb;

public class TurnLightOnCommand implements CommandInterface {
	
	private LightBulb buld;
	
	public TurnLightOnCommand(LightBulb buld) {
		super();
		this.buld = buld;
	}

	@Override
	public void execute() {
		buld.turnOnLight();
	}
	

}
