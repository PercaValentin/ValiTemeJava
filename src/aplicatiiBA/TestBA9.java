package aplicatiiBA;

public class TestBA9 {
	public static int getDiagonalSum(int[][] matrix) {
		int sumaDiagonala = 0;
		for (int i = 0; i < matrix.length; i++) {

			sumaDiagonala += matrix[i][matrix.length - 1 - i];
		}

		return sumaDiagonala;
	}

	public static void main(String[] args) {
		System.out.println(getDiagonalSum(new int[][] { { 4, 6, 3 }, { 0, 2, 1 }, { 6, 8, 5 } }));
		System.out.println(
				getDiagonalSum(new int[][] { { 3, 62, 12, 0 }, { 3, 10, 3, 47 }, { 91, 2, 87, 4 }, { 23, 1, 0, 55 } }));
		System.out.println(getDiagonalSum(new int[][] { { 11, 7 }, { 4, -3 } }));

	}
}
