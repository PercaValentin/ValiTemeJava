package aplicatiiEA;

public class TestEA18 {
	public static int countSums(int[] arr) {
		int suma = 0;
		fp: for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
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
