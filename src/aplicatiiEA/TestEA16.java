package aplicatiiEA;

public class TestEA16 {
	public static int countAppearances(int[] a, int[] b) {
		int counter = 0;
		for (int i = 0; i <= (a.length - b.length); i++) {
			int result = 0, j = 0;
			for (int elementDinB : b) {
				if (a[i + j] == elementDinB) {
					result++;
					j++;
				} else {
					break;
				}
				if (result == b.length && b.length > 0) {
					counter++;
				}
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println(countAppearances(new int[] { 1, 2, 3, 2, 3, 4, 1, 2, 4 }, new int[] { 1, 2 }));
	}
}
