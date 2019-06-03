package tema02;

public class Tancuri implements Armata {
	private String nume;
	private int gloante;
	private int proiectile;

	public Tancuri(String nume, int gloante, int proiectile) {

		super();
		this.nume = nume;
		this.gloante = gloante;
		this.proiectile = proiectile;
	}

	public void ShowName() {
		System.out.println(nume);
	}

	@Override
	public int FirePower() {
		return proiectile * 50 + gloante;
	}
}
