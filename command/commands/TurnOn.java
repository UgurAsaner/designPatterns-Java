package command.commands;

import command.Command;
import command.ElectronicDevice;

public class TurnOn implements Command {

private ElectronicDevice device;
	
	public TurnOn(ElectronicDevice device) {
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.turnOn();
	}

}
