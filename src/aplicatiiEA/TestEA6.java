package aplicatiiEA;

public class TestEA6 {
	public static int[] intToArray(int n) {
		String s = Integer.toString(n);
		int lenght = s.length();
		int[] rezultat = new int[lenght];
		for (int i = rezultat.length - 1; i >= 0; i--) {
			int cifra = n % 10;
			rezultat[i] = cifra;
			n /= 10;
		}
		return rezultat;
	}

	public static void main(String[] args) {

		System.out.println(intToArray(123));
	}
}
