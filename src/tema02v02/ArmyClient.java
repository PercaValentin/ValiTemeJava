package tema02v02;

public class ArmyClient {
	public static void main(String[] args) {
		Unit[] units1 = { new Soldat("Vali"), //
				new Soldat("Giorge"), //
				new Tank("Winner", 80, 800), //
				new Tank("Winner2", 90, 900) };
		Unit[] units2 = { new Soldat("Vasile"), //
				new Soldat("Ion"), //
				new Tank("Panzer", 40, 500), //
				new Tank("Tanc Rusesc", 50, 600)//

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
