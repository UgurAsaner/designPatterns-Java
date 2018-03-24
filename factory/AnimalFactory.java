package factory;

public class AnimalFactory {
	
	public Animal createAnimal(int animalType) {
		Animal animal = null;
		
		if(animalType == 0) {
			animal = new Dog();
		}else if(animalType == 1) {
			animal = new Cat();
		}else if(animalType == 2) {
			animal = new Bird();
		}
		
		return animal;
	}
	
}
