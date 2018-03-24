package bridge;

public class Bike extends Vehicle {

	public Bike(Color color) {
		super(color);
	}

	@Override
	public void produce() {
		System.out.println("Bike produced with color: " + color.toString());
	}

}
