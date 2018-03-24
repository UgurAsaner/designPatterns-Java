package command.commands;

import command.Command;
import command.ElectronicDevice;

public class VolumeUp implements Command {

	private ElectronicDevice device;
	
	public VolumeUp(ElectronicDevice device) {
		this.device = device;
	}
	
	@Override
	public void execute() {
		device.volumeUp();
	}

}
