package tema02;

public class Submarine implements Armata {
	private String nume;
	private int torpile;

	public Submarine(String nume, int torpile) {
		this.nume = nume;
		this.torpile = torpile;
	}

	public void ShowName() {
		System.out.println(nume);
	}

	@Override
	public int FirePower() {
		return torpile * 500;
	}
}
