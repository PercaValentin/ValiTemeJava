package aplicatiiBA;

public class TestBA4 {

	public static int max(int[] sir) {
		int maxim = sir[0];
		for (int i = 0; i < sir.length; i++) {
			if (sir[i] > maxim) {
				maxim = sir[i];
			}
		}
		return maxim;

	}

	public static void main(String[] args) {
		System.out.println(max(new int[] { 0, 6, 3, 8, 4 }));
	}
}
