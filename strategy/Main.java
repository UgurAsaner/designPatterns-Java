package strategy;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		
		ArrayList<Creature> creatures = new ArrayList<>();
		
		Creature animal = new Animal("Mirnak");
		Creature plant = new Plant("Kaktus");
		Creature bacteria = new Bacteria("Yararli Bakteri");
		
		
		creatures.add(animal);
		creatures.add(plant);
		creatures.add(bacteria);
		
		
		for(Creature creature: creatures) {
			
			System.out.println(creature.getName() + ": " + creature.tryToMove());
		}
	
	}
}
