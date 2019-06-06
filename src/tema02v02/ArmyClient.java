package tema02v02;

public class ArmyClient {
	public static void main(String[] args) {
		Unit[] units1 = { new Soldat("Vali"), //
				new Soldat("Giorge"), //
				new Tank("Winner", 80, 800), //
				new Tank("Winner2", 90, 900), //
				new Submarine("Subm1", 50), //
				new Submarine("Subm2", 80), //
				new NaveRazboi("Nava1", 5, 20), //
				new NaveRazboi("Nava2", 5, 25), //
				new AvioaneLupta("Avion1", 5, 5), //
				new AvioaneLupta("Avion2", 5, 4) };

		Unit[] units2 = { new Soldat("Vasile"), //
				new Soldat("Ion"), //
				new Tank("Panzer", 40, 500), //
				new Tank("Tanc Rusesc", 50, 600), //
				new Submarine("Subm3", 40), //
				new Submarine("Subm4", 60), //
				new NaveRazboi("Nava3", 3, 15), //
				new NaveRazboi("Nava4", 2, 10), //
				new AvioaneLupta("Avion3", 4, 4), //
				new AvioaneLupta("Avion4", 3, 2)

		};

		Army army1 = new Army(units1);
		Army army2 = new Army(units2);
		System.out.println(army1.toString());
		System.out.println(army2.toString());
		System.out.println(army1.getFirepower());
		System.out.println(army2.getFirepower());

		BattleSimulator bs = new BattleSimulator(army1, army2);
		bs.simulate();
	}
}
