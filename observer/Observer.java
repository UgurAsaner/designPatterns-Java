package observer;

public abstract class Observer implements ObserverInterface{

	private String name;
	
	public Observer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
