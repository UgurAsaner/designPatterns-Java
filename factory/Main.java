package factory;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		int[] animalTypes = {2, 1, 0, 2, 1, 0};
		
		AnimalFactory animalFactory = new AnimalFactory();
		
		ArrayList<Animal> animals = new ArrayList<>();
		
//		animals.add(new Bird());
//		animals.add(new Dog());
//		animals.add(new Cat());
//		animals.add(new Bird());
//		animals.add(new Dog());
//		animals.add(new Cat());
		
		for(int i=0; i < animalTypes.length; i++) {
			animals.add(animalFactory.createAnimal(animalTypes[i]));
		}
		
		
		for(Animal animal: animals) {
			animal.makeSound();
		}

	}

}
