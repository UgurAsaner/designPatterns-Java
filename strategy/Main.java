package strategy;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args){
		
		ArrayList<Creature> creatures = new ArrayList<>();	
		
		creatures.add(new Animal("Cat"));
		creatures.add(new Plant("Cactus"));
		creatures.add(new Bacteria("Spirillum"));
		
		for(Creature creature: creatures) {	
			System.out.println(creature.getName() + ": " + creature.tryToMove());
		}
	}
}
