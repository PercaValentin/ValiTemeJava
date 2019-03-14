package aplicatiiEA;

public class TestEA13 {
	public static int getMaxTriple(int[] arr) {
		int suma = 0;

		if (arr.length < 4) {
			for (int element : arr) {
				suma += element;
			}
			return suma;
		}
		for (int i = 0; i <= arr.length - 3; i++) {
			if (suma < (arr[i] + arr[i + 1] + arr[i + 2])) {
				suma = arr[i] + arr[i + 1] + arr[i + 2];

			}
		}
		return suma;
	}

	public static void main(String[] args) {
		System.out.println(getMaxTriple(new int[] { 3, 8, 5 }));
		System.out.println(getMaxTriple(new int[] { 3, 8, 5, 21, 10, 5, 13, 9 }));
	}
}
