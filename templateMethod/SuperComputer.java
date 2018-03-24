package templateMethod;

public class SuperComputer extends ComputerTemplate{

	@Override
	public void attachCPU() {
		System.out.println("3.8 GHz QuadCore CPU attached");
	}

	@Override
	public void attachRAM() {
		System.out.println("16 GB DDR5 RAM attached");
	}

}
