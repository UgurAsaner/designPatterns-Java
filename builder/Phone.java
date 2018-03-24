package builder;

public class Phone {

	private String os;
	private String brand;
	private int ram;
	private int battery;
	
	public Phone(String os, String brand, int ram, int battery) {
		this.os = os;
		this.brand = brand;
		this.ram = ram;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", brand=" + brand + ", ram=" + ram + ", battery=" + battery + "]";
	}
	
	
}
