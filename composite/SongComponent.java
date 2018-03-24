package composite;

public abstract class SongComponent {
	
	public void add(SongComponent component) {
		throw new UnsupportedOperationException();
	}
	
	public void remove(SongComponent songComponent) {
		throw new UnsupportedOperationException();
	}
	
	public SongComponent getComponent(int index) {
		throw new UnsupportedOperationException();
	}
    
	public void showSongInfo() {
		throw new UnsupportedOperationException();
	}
    
	
}
