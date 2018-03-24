package iterator;

public class Main {

	// Different Iterators (or ChannelSwitchers) loops through the same channel array
	public static void main(String[] args) {

		ChannelCollection radio = new Radio();

		radio.addChannel(new Channel(98.4, ChannelTypes.POP));
		radio.addChannel(new Channel(100.4, ChannelTypes.CLASSICAL));
		radio.addChannel(new Channel(89.6, ChannelTypes.ROCK));
		radio.addChannel(new Channel(92.8, ChannelTypes.POP));
		radio.addChannel(new Channel(96.3, ChannelTypes.ROCK));
		radio.addChannel(new Channel(100.0, ChannelTypes.POP));


		ChannelIterator allTypesSwitcher = radio.getIterator(ChannelTypes.ALL);

		System.out.println("\n All types Switcher: \n");

		loopChannels(allTypesSwitcher);
			

		ChannelIterator popSwitcher = radio.getIterator(ChannelTypes.POP);

		System.out.println("\n Pop Switcher: \n");
		
		loopChannels(popSwitcher);

	}
	
	public static void loopChannels(ChannelIterator iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}

}
