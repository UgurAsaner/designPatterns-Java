package prototype;

public class Main {

	public static void main(String[] args) {

		Animal dog = new Dog();
		Animal cloneDog = dog.copyAnimal();
		
		System.out.println(dog.toString());
		System.out.println(cloneDog.toString());
		
		
	}

}
