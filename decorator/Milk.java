package decorator;

public class Milk extends CoffeeDecorator{

	private static double price = 2.00;
	private static String description = "Milk: " + price + "\n";
	
	public Milk(Coffee coffee) {
		super(coffee);
	}
	
	@Override
	public double getPrice() {
		return coffee.getPrice() + price;
	}
	@Override
	public String getDescription() {
		return coffee.getDescription() + description;
	}
	
}
