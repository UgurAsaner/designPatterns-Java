package adapter;

public class Mp3Player implements MusicPlayer {

	public void play() {
		System.out.println("Mp3Player starts to play");
	}

	public void stop() {
		System.out.println("Mp3Player stops to play");
	}

}
