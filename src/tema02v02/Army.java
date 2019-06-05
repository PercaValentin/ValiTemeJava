package tema02v02;

import java.util.Arrays;

public class Army {
	private Unit[] units;

	public Army(Unit[] units) {
		super();
		this.units = units;
	}

	public int getFirepower() {
		int suma = 0;
		for (Unit unit : units) {
			if (unit.isAlive()) {
				suma += unit.getFirepower();
			}
		}
		return suma;

	}

	public boolean isAlive() {
		return getFirepower() > 0;
	}

	@Override
	public String toString() {
		return Arrays.toString(units);

	}

	public void simulateLife(double probability) {
		for (Unit unit : units) {
			double random = Math.random();
			if (unit.isAlive() && random > probability) {
				unit.kill();
			}
		}
	}

	public int getFirepower(UnitType type) {
		int sum = 0;
		for (Unit unit : units) {
			if (unit.isAlive() && unit.getType().equals(type)) {
				sum += unit.getFirepower();
			}
		}
		return sum;

	}

}
