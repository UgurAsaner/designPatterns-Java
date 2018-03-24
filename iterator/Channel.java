package iterator;

public class Channel {

	public double frequency;
	public ChannelTypes type;
	
	public Channel(double frequency, ChannelTypes type) {
		this.frequency = frequency;
		this.type = type;
	}
	
	public ChannelTypes getType() {
		return type;
	}

	public void setType(ChannelTypes type) {
		this.type = type;
	}

	public double getFrequency() {
		return frequency;
	}
	
	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}
	
	@Override
	public String toString() {
		return "Channel [frequency=" + frequency + ", type=" + type + "]";
	}
	
}
