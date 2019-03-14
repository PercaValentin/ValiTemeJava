package aplicatiiEA;

public class TestEA5 {
	public static int cmmdc(int a, int b) {

		if (a == b) {
			return a;
		}
		if (a > b) {
			return cmmdc(a - b, b);
		} else {
			return cmmdc(a, b - a);
		}
	}

	public static void main(String[] args) {
		System.out.println(cmmdc(30, 5));
		System.out.println(cmmdc(10, 6));
		System.out.println(cmmdc(6, 1));
	}
}
