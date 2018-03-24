package prototype;

public class Dog implements Animal {

	
	public Dog() {
		
		System.out.println("Dog Created");
	}
	
	
	public Animal copyAnimal() {
		
		System.out.println("Clonning Dog");
		
		Dog dog = null;
		
		try {
			dog = (Dog) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
						
		return dog;
	}


	@Override
	public String toString() {
		return "Dog";
	}
	
	

}
