package tema02v02;

public class Soldat extends Unit {

	public Soldat(String name) {
		super(name, UnitType.SOLDIER);
	}

	@Override
	public int getFirepower() {
		return 1;
	}

	public String getName() {
		return name;

	}

}
