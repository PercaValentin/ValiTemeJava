package aplicatiiBA;
import java.util.Arrays;

public class TestBA8Var2 {
	public static int[] reverse(int[] sir) {

		for (int i = 0; i < sir.length / 2; i++) {
			int temp = sir[sir.length - 1 - i];
			sir[sir.length - 1 - i] = sir[i];
			sir[i] = temp;

		}
		return sir;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(new int[] { 1, 2, 3, 4, 5 }));
	}
}
