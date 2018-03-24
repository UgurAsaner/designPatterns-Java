package strategy;
public class Bacteria extends Creature{

	private int size;
	
	Bacteria(int size){
		super();
		this.size = size;
	}

	Bacteria(String name){
		this(name, 0);
	}

	Bacteria(String name, int size){
		super(name);
		this.size = size;
		movebilityType = new ItCantMove();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
