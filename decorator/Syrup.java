package decorator;

public class Syrup extends CoffeeDecorator {

	private static double price = 0.50;
	private static String description = "Syrup: "+ price + "\n";
	
	public Syrup(Coffee coffee) {
		super(coffee);
	}
	
	public String getDescription() {
		return coffee.getDescription() + description;
	}

	public double getPrice() {
		return coffee.getPrice() + price;
	}
	
}
