package command;

import java.util.ArrayList;

import command.commands.*;

public class Main {

	public static void main(String[] args) {

		ArrayList<Command> commands = new ArrayList<>();
		
		ElectronicDevice tv = new Television();
		ElectronicDevice radio = new Radio();
		
		commands.add(new TurnOn(tv));
		commands.add(new VolumeUp(tv));
		commands.add(new VolumeUp(tv));
		commands.add(new VolumeDown(tv));
		commands.add(new SetBrightness((Television) tv, 4));
		commands.add(new TurnOff(tv));

		commands.add(new TurnOn(radio));
		commands.add(new VolumeDown(radio));
		commands.add(new VolumeDown(radio));
		commands.add(new VolumeUp(radio));
		commands.add(new TurnOff(radio));

		for(Command command : commands) {
			RemoteController.press(command);
		}
	}

}
