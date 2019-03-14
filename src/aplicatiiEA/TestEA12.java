package aplicatiiEA;
import java.util.Arrays;

public class TestEA12 {
	public static int[] removePosition(int[] arr, int pos) {

		if (pos < arr.length && pos >= 0 && arr.length > 0) {
			int j = 0;
			int[] arr2 = new int[arr.length - 1];

			for (int i = 0; i < arr.length; i++) {
				if (i != pos) {
					arr2[j] = arr[i];
					j++;
				}
			}
			return arr2;
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString((removePosition(new int[] { 5, 8, 11, 3, 6 }, 2))));
	}
}
