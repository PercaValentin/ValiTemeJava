package tema02;

public class NaveRazboi implements Armata {
	private String nume;
	private int numarTunuri;
	private int numarRachete;

	public NaveRazboi(String nume, int numarTunuri, int numarRachete) {
		super();
		this.nume = nume;
		this.numarTunuri = numarTunuri;
		this.numarRachete = numarRachete;
	}

	public void ShowName() {
		System.out.println(nume);
	}

	@Override
	public int FirePower() {
		return numarTunuri * 100 + numarRachete * 1000;
	}
}
