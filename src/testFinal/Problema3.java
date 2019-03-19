package testFinal;

public class Problema3 {
	public static int next(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return arr[i + 1];
			}
			if (arr[arr.length - 1] == n) {
				return -1;
			}
		}
		return -2;

	}

	public static void main(String[] args) {
		System.out.println(next(new int[] { 1, 5, 7, 2, 6 }, 7));
	}
}
