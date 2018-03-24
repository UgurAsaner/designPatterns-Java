package adapter;

import java.util.ArrayList;

public class Main {

	public static void main(String[] agrs) {
		
		ArrayList<MusicPlayer> musicPlayers = new ArrayList<>();
		
		Television television = new Television();
		
		musicPlayers.add(new Mp3Player());
		musicPlayers.add(new TelevisionAdapter(television));
		
		for(MusicPlayer player : musicPlayers) {
			player.play();
			player.stop();
		}
		
		
	}
	
}
