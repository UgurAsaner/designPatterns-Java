package bridge;

public class Car extends Vehicle {

	public Car(Color color) {
		super(color);
	}

	@Override
	public void produce() {
		System.out.println("Car produced with color: " + color.toString());
	}

}
