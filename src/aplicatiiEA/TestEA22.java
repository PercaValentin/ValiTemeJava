package aplicatiiEA;

public class TestEA22 {
	public static int stringSum(String input) {
		if (input == "") {
			return 0;
		}
		input = input.replaceAll(" ", "");
		int suma = 0;
		String[] numbers = input.split("[,]+");
		for (String nr : numbers) {
			int nrString = Integer.parseInt(nr);
			suma += nrString;
		}
		return suma;

	}

	public static void main(String[] args) {
		System.out.println(stringSum(""));
	}
}
