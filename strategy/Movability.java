package strategy;
// Interface to determine Movability of Creatures
public interface Movability {
	String canMove();
}


class ItCanMove implements Movability{

	@Override
	public String canMove() {
		return "Can Move :D";
	}
}


class ItCantMove implements Movability{

	@Override
	public String canMove() {
		return "Cant Move :(";
	}
}