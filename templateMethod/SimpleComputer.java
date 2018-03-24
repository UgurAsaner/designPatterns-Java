package templateMethod;

public class SimpleComputer extends ComputerTemplate {

	@Override
	public void attachCPU() {
		System.out.println("1.7 GHz DualCore CPU attached");
	}

	@Override
	public void attachRAM() {
		System.out.println("4 GB DDR3 RAM attached");
	}

}
