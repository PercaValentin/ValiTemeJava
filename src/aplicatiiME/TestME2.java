package aplicatiiME;

import java.util.Arrays;

public class TestME2 {
	public static int[] getPermutations(int n) {
		String s = Integer.toString(n);
		int length = s.length();
		int[] result = new int[length];
		for (int i = result.length - 1; i >= 0; i--) {
			int cifra = n % 10;
			result[i] = cifra;
			n /= 10;
		}
		for (int i = 0; i < result.length; i++) {

		}
		return result;

	}

	public static void main(String[] args) {
		System.out.println((Arrays.toString(getPermutations(58))));
	}
}
