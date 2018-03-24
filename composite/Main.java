package composite;

public class Main {

	public static void main(String[] args) {
		
		SongComponent songs = new SongGroup("Song Group 1");
		
		songs.add(new Song("A", "Band1"));
		songs.add(new Song("B", "Band2"));
		songs.add(new Song("C", "Band1"));
		songs.add(new Song("D", "Band2"));

		SongComponent moreSongs = new SongGroup("Song Group 2");
		
		moreSongs.add(new Song("E", "Band3"));
		moreSongs.add(new Song("F", "Band3"));
		moreSongs.add(new Song("G", "Band3"));
		
		songs.showSongInfo();
		System.out.println("*****************");
		moreSongs.showSongInfo();
		System.out.println("*****************");
		
		System.out.println("\n* Merged Songs *\n");

		songs.add(moreSongs);
		songs.showSongInfo();
		
	}

}
