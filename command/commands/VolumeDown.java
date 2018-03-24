package command.commands;

import command.Command;
import command.ElectronicDevice;

public class VolumeDown implements Command {

private ElectronicDevice device;
	
	public VolumeDown(ElectronicDevice device) {
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.volumeDown();
	}

}
