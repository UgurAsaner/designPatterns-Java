package command.commands;

import command.Command;
import command.ElectronicDevice;

public class TurnOff implements Command {
	
	private ElectronicDevice device;
	
	public TurnOff(ElectronicDevice device) {
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.turnOff();
	}

}
