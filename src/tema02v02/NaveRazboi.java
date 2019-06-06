package tema02v02;

public class NaveRazboi extends Unit {

	private int tunuri;
	private int rachete;

	public NaveRazboi(String name, int tunuri, int rachete) {
		super(name, UnitType.NAVERAZBOI);
		this.tunuri = tunuri;
		this.rachete = rachete;
	}

	@Override
	public int getFirepower() {

		return tunuri * 100 + rachete * 100;
	}

}
