package iterator;

import java.util.ArrayList;
import java.util.List;

public class Radio implements ChannelCollection {

	private List<Channel> channels;
	
	public Radio() {
		channels = new ArrayList<>();
	}
	
	@Override
	public void addChannel(Channel channel) {
		channels.add(channel);
		System.out.println(channel.toString() + " is added");
	}

	@Override
	public void removeChannel(Channel channel) {
		channels.remove(channel);
		System.out.println(channel.toString() + " is removed");
	}

	@Override
	public ChannelIterator getIterator(ChannelTypes type) {
		return new ChannelSwitcher(type, channels);
	}

	public class ChannelSwitcher implements ChannelIterator{

		private ChannelTypes type;
		private List<Channel> channels;
		private int position;
		
		public ChannelSwitcher(ChannelTypes type, List<Channel> channels) {
			this.channels = channels;
			this.type = type;
		}
		
		@Override
		public boolean hasNext() {
			
			while(position < channels.size()) {
				
				Channel channel = channels.get(position);
				
				if(channel.getType().equals(type) || type.equals(ChannelTypes.ALL)) {
					return true;
				}else {
					position++;
				}

			}
			
			return false;
		}

		@Override
		public Channel next() {
			System.out.println("Iterator: " + System.identityHashCode(this) + " working.");
			Channel channel = channels.get(position);
			position++;
			return channel;
		}
		
		
		
	}
	
}
