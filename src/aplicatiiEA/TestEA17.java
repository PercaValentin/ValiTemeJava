package aplicatiiEA;
import java.util.Arrays;

public class TestEA17 {
	public static int[] removeDuplicates(int[] arr) {
		if (arr.length == 0) {
			int[] sirNou = new int[0];
			return sirNou;
		}
		int result = 1;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i - 1] != arr[i]) {
				result++;
			}
		}
		int sirNou[] = new int[result];
		result = 0;
		sirNou[result] = arr[0];
		result++;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] != arr[i]) {
				sirNou[result] = arr[i];
				result++;
			}
		}
		return sirNou;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(removeDuplicates(new int[] { 1, 1, 2, 2, 2, 3, 3, 3, 3 })));
	}
}
