package strategy;
public class Plant extends Creature{

	private int height;

	Plant(String name){
		this(name, 0);
	}

	Plant(int height){
		super();
		this.height = height;
		movebilityType = new ItCantMove();
	}

	Plant(String name, int height){
		super(name);
		this.height = height;
		movebilityType = new ItCantMove();
	}

	public int getWeight() {
		return height;
	}

	public void setWeight(int height) {
		this.height = height;
	}
}
