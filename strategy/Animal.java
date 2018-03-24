package strategy;
public class Animal extends Creature {

	private int weight;

	Animal(String name){
		this(name, 0);
	}

	Animal(int weight){
		super();
		this.weight = weight;
		movebilityType = new ItCanMove();
	}

	Animal(String name, int weight){
		super(name);
		this.weight = weight;
		movebilityType = new ItCanMove();
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
