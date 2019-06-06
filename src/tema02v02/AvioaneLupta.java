package tema02v02;

public class AvioaneLupta extends Unit {
	private int rachete;
	private int bombe;

	public AvioaneLupta(String name, int rachete, int bombe) {
		super(name, UnitType.AVIOANELUPTA);
		this.rachete = rachete;
		this.bombe = bombe;
	}

	@Override
	public int getFirepower() {

		return rachete * 1000 + bombe * 2000;
	}

}
