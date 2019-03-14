package aplicatiiEA;

import java.util.Arrays;

public class TestEA7 {
	public static int nthSmallest(int[] sir, int n) {
		if (n > sir.length) {
			return -1;
		}
		Arrays.sort(sir);
		return sir[n - 1];
	}

	public static void main(String[] args) {
		System.out.println(nthSmallest(new int[] { 6, 8, 2, 1, 4, 9 }, 7));
	}
}
