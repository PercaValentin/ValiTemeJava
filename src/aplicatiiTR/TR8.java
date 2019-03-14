package aplicatiiTR;

public class TR8 {

	public static double divide(double a, double b) {

		if (b == 0) {
			return Double.MAX_VALUE;
		} else {
			return (a / b);
		}
	}

	public static void main(String[] args) {
		System.out.println(divide(7, 0));
	}

}
