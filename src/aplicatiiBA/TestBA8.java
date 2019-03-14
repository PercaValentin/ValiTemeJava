package aplicatiiBA;
import java.util.Arrays;

public class TestBA8 {

	public static int[] reverse(int[] sir) {

		int[] sirInversat = new int[sir.length];
		int j = sir.length - 1;
		for (int i = 0; i < sir.length; i++) {
			sirInversat[j] = sir[i];
			j--;
		}
		return sirInversat;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(reverse(new int[] { 1, 2, 3, 4, 5 })));
		System.out.println(Arrays.toString(reverse(new int[] { 1, 0 })));
		System.out.println(Arrays.toString(reverse(new int[] {})));
	}
}
