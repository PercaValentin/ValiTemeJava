package aplicatiiBA;

public class TestBA5 {
	public static int product(int[] sir) {

		if (sir.length == 0) {
			return 1;
		}

		int product = 1;
		for (int element : sir) {
			if (element != 0) {
				product *= element;
			}

		}
		return product;

	}

	public static void main(String[] args) {
		System.out.println(product(new int[] { 0, 1, 0, 2, 3 }));
		System.out.println(product(new int[] {}));
		System.out.println(product(new int[] { 0, 0, 0 }));
		System.out.println(product(new int[] { 1, 2, 3 }));
		System.out.println(product(new int[] { 1, 0, 0, 7, 20 }));
	}
}
