package templateMethod;

public class Main {

	public static void main(String[] args) {
		
		ComputerTemplate superComputer = new SuperComputer();
		ComputerTemplate simpleComputer = new SimpleComputer();
		
		superComputer.buildComputer();
		simpleComputer.buildComputer();
		
	}
}
