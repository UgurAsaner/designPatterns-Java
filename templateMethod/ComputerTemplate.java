package templateMethod;

public abstract class ComputerTemplate {

	public final void buildComputer() {
		buildMotherBoard();
		buildPowerSupply();
		attachCPU();
		attachRAM();
		
		System.out.println("Build finished\n");
	}
	
	public void buildMotherBoard() {
		System.out.println("Motherboard is built");
	}
	
	public void buildPowerSupply() {
		System.out.println("Power Supply is built");
	}
	
	public abstract void attachCPU();
	
	public abstract void attachRAM();
	
}
