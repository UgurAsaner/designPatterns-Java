package composite;

public class Song extends SongComponent {

	public String songName;
	public String bandName;
	
	
	public Song(String songName, String bandName) {
		this.songName = songName;
		this.bandName = bandName;
	}
	
	public void showSongInfo() {
		System.out.println("  " + getBandName() + " - " + getSongName());
	}
	
	public String getSongName() {
		return songName;
	}
	
	public String getBandName() {
		return bandName;
	}
}
