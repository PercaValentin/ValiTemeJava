package testFinal;

public class Problema2 {
	public static boolean isSorted(int[] arr) {
		int nrAnterior = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < nrAnterior) {
				return false;
			}
			nrAnterior = arr[i];
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isSorted(new int[] { 1, 2, 4 }));

	}
}
