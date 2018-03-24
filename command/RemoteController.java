package command;

public class RemoteController {
	
	public static void press(Command command) {
		command.execute();
	}
}
