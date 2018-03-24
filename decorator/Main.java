package decorator;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Coffee> coffeeOrders = new ArrayList<>();

		coffeeOrders.add(new Milk(new FilteredCoffee()));

		coffeeOrders.add(new Syrup(new FilteredCoffee()));

		coffeeOrders.add(new Syrup(new Milk(new FilteredCoffee())));

		for (Coffee coffeeOrder : coffeeOrders) {

			System.out.println("****Order****\n");
			System.out.println(coffeeOrder.getDescription());
			System.out.println("Total " + coffeeOrder.getPrice());
			System.out.println("\n\n");

		}
	}

}
