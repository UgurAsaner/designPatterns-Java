package bridge;

public abstract class Vehicle {

	public Color color;
	
	public Vehicle(Color color) {
		this.color = color;
	}
	
	public abstract void produce();

}
