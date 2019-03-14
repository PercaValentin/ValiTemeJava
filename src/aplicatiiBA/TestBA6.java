package aplicatiiBA;

public class TestBA6 {

	public static int arrayToNumber(int[] sir) {
		if (sir.length == 0) {
			return -1;
		}
		int number = 0;
		int loc = 1;
		for (int i = sir.length - 1; i >= 0; --i) {
			if (sir[i] >= 0 && sir[i] <= 9) {
				number += sir[i] * loc;
				loc *= 10;

			} else {
				return -2;
			}
		}
		return number;
	}

	public static void main(String[] args) {
		System.out.println(arrayToNumber(new int[] { 8, 7, 6 }));
		System.out.println(arrayToNumber(new int[] { 0, 0, 1, 2, 7 }));
		System.out.println(arrayToNumber(new int[] {}));
		System.out.println(arrayToNumber(new int[] { 1, 0, 0 }));
		System.out.println(arrayToNumber(new int[] { 0, 11, 2, 3 }));

	}

}
