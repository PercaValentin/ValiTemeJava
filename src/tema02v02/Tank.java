package tema02v02;

public class Tank extends Unit {
	private int proiectile;
	private int gloante;

	public Tank(String name, int proiectile, int gloante) {
		super(name, UnitType.TANK);
		this.gloante = gloante;
		this.proiectile = proiectile;

	}

	@Override
	public int getFirepower() {

		return proiectile * 50 + gloante;
	}

}
