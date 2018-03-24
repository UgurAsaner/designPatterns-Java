package observer;

import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static ArrayList<StockGrabber> grabbers = new ArrayList<>();
	public static ArrayList<StockObserver> observers = new ArrayList<>();
	
	public static void main(String[] args) {
		
		StockGrabber grabber1 = new StockGrabber("Grabber 1");
		StockGrabber grabber2 = new StockGrabber("Grabber 2");
		grabbers.add(grabber1);
		grabbers.add(grabber2);
		
		observers.add(new StockObserver(grabber1, "Observer A(1)"));
		observers.add(new StockObserver(grabber1, "Observer B(1)"));
		observers.add(new StockObserver(grabber2, "Observer C(2)"));
		observers.add(new StockObserver(grabber2, "Observer D(2)"));
		
		
		for(StockGrabber grabber: grabbers) {
			setPrices(grabber);
			unregisterAllObservers(grabber);
		}
		
	}
	
	public static void setPrices(StockGrabber grabber) {
		grabber.setTomatoPrice(getRandomNumberInRange(1, 5));
		grabber.setPotatoPrice(getRandomNumberInRange(2, 6));
	}
	
	public static void unregisterAllObservers(StockGrabber grabber) {
		for(StockObserver observer : observers) {
			grabber.unregister(observer);
		}
	}
	
	public static int getRandomNumberInRange(int min, int max) {
		return new Random().nextInt((max - min) - 1) + min;
	}

}
