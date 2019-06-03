package tema02;

public class Soldati implements Armata {
	private String nume;

	public Soldati(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public int FirePower() {
		return 1;
	}

	public void ShowName() {
		System.out.println(nume);
	}
}
