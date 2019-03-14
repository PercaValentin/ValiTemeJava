package aplicatiiBA;

public class TestBA2 {
	public static boolean isPalidrome(int n) {
		int reverse = 0;
		int numar = n; // de intrebat de ce daca las "n" imi ramane valoarea 0
		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;// ultima cifra a unui numar
			n = n / 10;
		}
		if (numar == reverse) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println(isPalidrome(123));
		System.out.println(isPalidrome(121));
		System.out.println(isPalidrome(5));
		System.out.println();
	}
}
