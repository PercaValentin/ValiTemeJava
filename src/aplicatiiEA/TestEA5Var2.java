package aplicatiiEA;

public class TestEA5Var2 {
	public static int cmmdc(int a, int b) {

		if (b == 0) {
			return a;
		} else {
			return cmmdc(b, a % b);
		}
	}

	public static void main(String[] args) {
		System.out.println(cmmdc(30, 5));
		System.out.println(cmmdc(10, 6));
		System.out.println(cmmdc(6, 1));
	}
}
