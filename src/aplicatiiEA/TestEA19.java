package aplicatiiEA;

public class TestEA19 {
	public static boolean isSudokuLine(int[] arr) {
		if (arr.length != 9) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[i] != 0 && arr[j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isSudokuLine(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }));
		System.out.println(isSudokuLine(new int[] { 1, 1, 0, 0, 5, 6, 7, 8, 0 }));
		System.out.println(isSudokuLine(new int[] { 1, 5, 0, 0, 5, 6, 7, 7, 0 }));

	}
}
