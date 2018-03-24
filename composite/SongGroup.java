package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
	
	private ArrayList<Object> songComponents = new ArrayList<>();
	
	private String songGroupName;
	
	public SongGroup(String songGroupName) {
		this.songGroupName = songGroupName;
	}
	
	
	public void add(SongComponent component) {
		songComponents.add(component);
	}
	
	public void remove(SongComponent songComponent) {
		songComponent.remove(songComponent);
	}
	
	public SongComponent getComponent(int index) {
		return (SongComponent) songComponents.get(index);
	}
	
	
	public void showSongInfo() {
		
		Iterator<Object> songsIterator = songComponents.iterator();
		
		System.out.println("Songs of " + getSongGroupName());
		
		while(songsIterator.hasNext()) {
			SongComponent songComponent = (SongComponent) songsIterator.next();
			songComponent.showSongInfo();
		}
	
	}

	public String getSongGroupName() {
		return songGroupName;
	}
	
}
