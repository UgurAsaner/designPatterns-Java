package factory;

public abstract class Animal {
	
	private String name;
	private String sound;
	
	public void makeSound() {
		System.out.println(name + " says: " + sound);
	};
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
}
