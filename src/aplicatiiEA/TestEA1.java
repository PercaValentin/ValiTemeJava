package aplicatiiEA;

public class TestEA1 {

	public static int reverse(int n) {
		int reverse = 0;
		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
		}
		return reverse;

	}

	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(121));
		System.out.println(reverse(5));
	}

}
