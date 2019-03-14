package aplicatiiEA;

public class TestEA10 {
	public static int fibo(int n) {
		if (n < 0) {
			return -1;
		}
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibo(n - 1) + fibo(n - 2);

	}

	public static void main(String[] args) {
		System.out.println(fibo(-10));
		System.out.println(fibo(0));
		System.out.println(fibo(1));
		System.out.println(fibo(2));
		System.out.println(fibo(3));

	}
}
