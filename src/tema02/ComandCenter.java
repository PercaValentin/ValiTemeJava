package tema02;

public class ComandCenter {
	public static void main(String[] args) {
		int putereTotala1 = 0;
		int putereTotala2 = 0;

		Armata[] army1 = { new Soldati("Flavius"), new Soldati("Vali"), //
				new Tancuri("Tanc1", 20, 30), new Tancuri("Tanc2", 25, 35), //
				new NaveRazboi("Nava1", 5, 500), new NaveRazboi("Nava2", 10, 600), //
				new Submarine("Sub1", 20), new Submarine("Sub2", 30), //
				new AvioaneLupta("Av1", 20, 50), new AvioaneLupta("Av2", 25, 45) };
		Armata[] army2 = { new Soldati("Mircea"), new Soldati("Adi"), //
				new Tancuri("Tanc3", 22, 25), new Tancuri("Tanc4", 24, 32), //
				new NaveRazboi("Nava3", 4, 400), new NaveRazboi("Nava4", 8, 450), //
				new Submarine("Sub3", 18), new Submarine("Sub2", 27), //
				new AvioaneLupta("Av3", 20, 50), new AvioaneLupta("Av4", 25, 45) };

		for (Armata resursa : army1) {
			resursa.ShowName();
			System.out.println(resursa.FirePower());
			putereTotala1 += resursa.FirePower();
		}
		System.out.println("Puterea totala a primei armate este: " + putereTotala1);
		for (Armata resursa : army2) {
			resursa.ShowName();
			System.out.println(resursa.FirePower());
			putereTotala2 += resursa.FirePower();

		}
		System.out.println("Puterea totala a armatei a 2-a este: " + putereTotala2);
	}
}
