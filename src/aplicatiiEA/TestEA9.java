package aplicatiiEA;

public class TestEA9 {
	public static int countPairs(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == n) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(countPairs(new int[] { 1, 2, 3 }, 10));
		System.out.println(countPairs(new int[] { 1, 2, 3, 5, 7 }, 10));
		System.out.println(countPairs(new int[] { 1, 2, 3, 5, 7, 8, 9, 10, 11, 12 }, 10));
		System.out.println(countPairs(new int[] { 5, 7, 8, 9, 10, 11, 12, 15 }, 20));
		System.out.println(countPairs(new int[] {}, 10));

	}
}
