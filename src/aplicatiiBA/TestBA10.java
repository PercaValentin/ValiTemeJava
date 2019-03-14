package aplicatiiBA;

public class TestBA10 {
	public static int getSecondaryDiagonalSum(int[][] matrix) {
		int sumaDiagonala = 0;
		for (int i = matrix.length - 1; i >= 0; i--) {
			for (int j = matrix[i].length - 1; j >= 0; j--) {
				if (i + j == matrix.length - 1) {
					sumaDiagonala += matrix[i][j];
				}
			}
		}
		return sumaDiagonala;
	}

	public static void main(String[] args) {
		System.out.println(getSecondaryDiagonalSum(
				new int[][] { { 5, 91, 12, 0 }, { 3, 6, 33, 47 }, { 2, 91, 64, 4 }, { 23, 1, 0, 55 } }));
		System.out.println(getSecondaryDiagonalSum(new int[][] { { 6, 3, 9 }, { 4, -8, 2 }, { 4, 7, 1 } }));
		System.out.println(getSecondaryDiagonalSum(new int[][] { { 8, 8 }, { 11, 3 } }));
	}
}
