package observer;

public interface SubjectInterface {
	
	public void register(Observer newObserver);
	public void unregister(Observer observerToDelete);
	public void notifyObservers();
}
