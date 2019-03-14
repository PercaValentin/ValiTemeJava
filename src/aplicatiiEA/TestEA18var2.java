package aplicatiiEA;

public class TestEA18var2 {
	public static int countSums(int[] arr) {

		int count = 0;
		fp: for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {

				for (int k = j + 1; k < i; k++) {
					if ((arr[j] + arr[k]) == arr[i]) {
						// System.out.println(arr[i]);
						count++;
						continue fp;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countSums(new int[] { 1, 1, 2, 3 }));
		System.out.println(countSums(new int[] { 0, 1, 1, 2, 3 }));

	}
}
