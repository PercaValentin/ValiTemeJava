package tema02v02;

public class ArmyClient {
	public static void main(String[] args) {
		Army army1 = new Army();
		army1.addUnit(new Soldat("Ghita"));//
		army1.addUnit(new Soldat("Ion"));//
		army1.addUnit(new Submarine("Sub1", 50));//
		army1.addUnit(new Submarine("Sub2", 60));//
		army1.addUnit(new Tank("Tank1", 50, 100));//
		army1.addUnit(new Tank("Tank 2", 50, 90));//
		army1.addUnit(new NaveRazboi("Nava1", 4, 50));//
		army1.addUnit(new NaveRazboi("Nava2", 5, 50));//
		army1.addUnit(new AvioaneLupta("Av1", 10, 10)); //
		army1.addUnit(new AvioaneLupta("Av2", 10, 10)); //

		Army army2 = new Army();
		army2.addUnit(new Soldat("Vasi"));
		army2.addUnit(new Soldat("Geo"));
		army2.addUnit(new Submarine("Sub3", 40));//
		army2.addUnit(new Submarine("Sub4", 40));//
		army2.addUnit(new Tank("Tank3", 40, 80));//
		army2.addUnit(new Tank("Tank4", 35, 70));//
		army2.addUnit(new NaveRazboi("Nava3", 3, 45));//
		army2.addUnit(new NaveRazboi("Nava4", 3, 40));//
		army2.addUnit(new AvioaneLupta("Av3", 15, 10)); //
		army2.addUnit(new AvioaneLupta("Av4", 12, 10)); //

		System.out.println(army1.toString());
		System.out.println(army2.toString());
		System.out.println(army1.getFirepower());
		System.out.println(army2.getFirepower());

		BattleSimulator bs = new BattleSimulator(army1, army2);
		bs.simulate();
	}
}
