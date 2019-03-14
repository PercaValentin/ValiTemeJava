package aplicatiiEA;

public class TestEA8 {
	public static boolean contains(int[] a, int[] b) {
		if (a.length == 0) {
			return false;
		} else if (b.length == 0) {
			return true;
		}
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[j]) {
				j++;
			}
			if (j == b.length) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(contains(new int[] { 1, 2, 3, 4, 2, 1, 3, 4 }, new int[] { 2, 3, 4 }));
		System.out.println(contains(new int[] { 1, 2, 3, 4, 2, 1, 3, 4 }, new int[] { 1, 4, 3 }));
		System.out.println(contains(new int[] { 1, 2, 3, 4, 2, 1, 3, 4 }, new int[] { 3, 3, 2 }));
		System.out.println(contains(new int[] { 1, 2, 3, 4, 2, 1, 3, 4 }, new int[] { 1, 1, 2 }));
		System.out.println(contains(new int[] { 1, 2, 3, 4, 2, 1, 3, 4 }, new int[] {}));
		System.out.println(contains(new int[] {}, new int[] { 1, 1, 2 }));

	}
}
