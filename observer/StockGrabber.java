package observer;

import java.util.ArrayList;

public class StockGrabber extends Subject{

	ArrayList<Observer> observers = new ArrayList<>();
	
	private int tomatoPrice = 1;
	private int potatoPrice = 1;
	
	public StockGrabber(String name){
		super(name);
	}
	
	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
		System.out.println(newObserver.getName() + " registered for: " + super.getName());
	}
	
	@Override
	public void unregister(Observer observerToDelete) {
		observers.remove(observerToDelete);
		System.out.println(observerToDelete.getName() + " unregistered for: " + super.getName());
	}
	
	@Override
	public void notifyObservers() {
		System.out.println(super.getName() + " changed prices, all observers will be notified. \n");
		for(Observer observer: observers) {
			observer.update(this.tomatoPrice, this.potatoPrice);
		}
	}
	
	
	public void setTomatoPrice(int tomatoPrice) {
		this.tomatoPrice = tomatoPrice;
		this.notifyObservers();
	}
	
	public void setPotatoPrice(int potatoPrice) {
		this.potatoPrice = potatoPrice;
		this.notifyObservers();
	}
}
