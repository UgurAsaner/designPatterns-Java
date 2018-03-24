package adapter;

public class TelevisionAdapter implements MusicPlayer {

	private Television television; 
	
	public TelevisionAdapter(Television television) {
		this.television = television;
	}
	
	@Override
	public void play() {
		television.playMusic();
	}

	@Override
	public void stop() {
		television.stopMusic();
	}

}
