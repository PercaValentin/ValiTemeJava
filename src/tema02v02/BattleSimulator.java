package tema02v02;

public class BattleSimulator {
	private Army army1;
	private Army army2;

	public BattleSimulator(Army army1, Army army2) {
		super();
		this.army1 = army1;
		this.army2 = army2;
	}

	public void simulate() {
		while (true) {
			int fp1 = army1.getFirepower();
			int fp2 = army2.getFirepower();
			int totalFp = fp1 + fp2;
			army1.simulateLife((double) fp1 / totalFp);
			army2.simulateLife((double) fp2 / totalFp);

			System.out.println(army1);
			System.out.println(army2);
			if (!army1.isAlive() || !army2.isAlive()) {
				break;
			}
		}

	}
}
