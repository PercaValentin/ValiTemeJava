package tema02;

public class AvioaneLupta implements Armata {
	private String nume;
	private int numarRachete;
	private int numarBombe;

	public AvioaneLupta(String nume, int numarRachete, int numarBombe) {
		this.nume = nume;
		this.numarRachete = numarRachete;
		this.numarBombe = numarBombe;
	}

	public void ShowName() {
		System.out.println(nume);
	}

	@Override
	public int FirePower() {
		return numarRachete * 1000 + numarBombe * 2000;
	}

}
