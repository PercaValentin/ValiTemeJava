package tema02v02;

public class Submarine extends Unit {

	private int torpile;

	public Submarine(String name, int torpile) {
		super(name, UnitType.SUBMARINE);
		this.torpile = torpile;

	}

	@Override
	public int getFirepower() {

		return torpile * 500;
	}

}
