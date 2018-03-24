package bridge;

public class Main {

	public static void main(String[] args) {
		
		Vehicle bike = new Bike(new Red());
		Vehicle car = new Car(new Blue());
		
		bike.produce();
		car.produce();
		
	}

}
