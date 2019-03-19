package aplicatiiEA;

public class TestEA18 {
	public static int countSums(int[] arr) {
		int suma = 0;
		fp: for (int i = arr.length - 1; i >= 0; i++) {
			for (int j = 0; j < i; j++) {
				for (int k = j + 1; k < i; k++) {
					if (arr[i] + arr[j] == arr[k]) {
						suma++;
						continue fp;
					}
				}
			}
		}
		return suma;
	}

	public static void main(String[] args) {
		System.out.println(countSums(new int[] { 1, 2, 3, 4 }));
		System.out.println(countSums(new int[] { 0, 1, 1, 2, 3 }));

	}
}
