package decorator;

public class FilteredCoffee implements Coffee {

	private static double price = 5.50;
	private static String description  = "Filtered Coffee: " + price + "\n";
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
