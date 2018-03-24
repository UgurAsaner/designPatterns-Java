package command;

public class Television extends ElectronicDevice {

	private int brightness = 3;
	
	public Television() {
		super("TV");
	}
	
	public void setBrightness(int brightness) {
		this.brightness = brightness;
		System.out.println("TV brightness set: " + this.brightness);
	}
}
