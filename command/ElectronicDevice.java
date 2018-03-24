package command;

public abstract class ElectronicDevice {

	private int volume = 5;
	private String name;
	
	public ElectronicDevice(String name) {
		this.name = name;
	}

	public void turnOn() {
		System.out.println(name + " turned on");
	}

	public void turnOff() {
		System.out.println(name + " turned off");
	}

	public void volumeUp() {
		volume++;
		System.out.println(name + " volume increased: " + volume);
	}

	public void volumeDown() {
		volume--;
		System.out.println(name + " volume decreased: " + volume);
	}
	
}
