package aplicatiiEA;

public class TestEA4 {
	public static int cmmdc(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return cmmdc(b, a % b);
		}
	}

	public static int cmmmc(int a, int b) {
		return (a * b) / cmmdc(a, b);
	}

	public static void main(String[] args) {
		System.out.println(cmmmc(3, 5));
		System.out.println(cmmmc(3, 6));
		System.out.println(cmmmc(2, 5));
	}
}
