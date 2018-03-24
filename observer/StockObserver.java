package observer;

public class StockObserver extends Observer {

	private int tomatoPrice;
	private int potatoPrice;
	private int observerId;
	
	private static int stockObserverIdTracker = 0; 
	
	public Subject stockGrabber;
	
	
	
	public StockObserver(Subject stockGrabber, String name) {
		super(name);
		this.stockGrabber = stockGrabber;
		this.observerId = ++stockObserverIdTracker; 
		//System.out.println( name + " created for : " + stockGrabber.getName() + "\n");
		stockGrabber.register(this);
		
	}
	
	@Override
	public void update(int tomatoPrice, int potatoPrice) {
		this.tomatoPrice = tomatoPrice;
		this.potatoPrice = potatoPrice;
				
		System.out.println( super.getName() + " observed changes on prices");
		System.out.println("Tomato price updated as: " + tomatoPrice);
		System.out.println("Potato price updated as: " + potatoPrice + "\n");
		
	}

	public int getObserverId() {
		return observerId;
	}

	public int getPotatoPrice() {
		return potatoPrice;
	}

	public int getTomatoPrice() {
		return tomatoPrice;
	}


}
