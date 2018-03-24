package strategy;
public abstract class Creature {

	private boolean isLiving = true;
	private boolean isExisting = true;
	private String name;
	private int age = 0;
	public Movability movebilityType;

	Creature(){
		this.name = "No Name";
	}

	Creature(String name){
		this.name = name;
	}

	public void die(){
		this.isLiving = false;
	}

	public void disappear(){
		this.isExisting = false;
	}

	public boolean isLiving() {
		return isLiving;
	}

	public boolean isExisting() {
		return isExisting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Movability getMovebilityType() {
		return movebilityType;
	}

	public void setMovebilityType(Movability movebilityType) {
		this.movebilityType = movebilityType;
	}
	
	public String tryToMove() {
		return movebilityType.canMove();
	}
	
	
}
