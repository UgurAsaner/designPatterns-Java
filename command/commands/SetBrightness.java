package command.commands;

import command.Command;
import command.Television;

public class SetBrightness implements Command {

	private Television television;
	private int brightness;
	
	public SetBrightness(Television television, int brightness) {
		this.television = television;
		this.brightness = brightness;
	}
	
	@Override
	public void execute() {
		television.setBrightness(brightness);
	}

}
