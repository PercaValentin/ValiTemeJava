package aplicatiiEA;
import java.util.Arrays;

public class TestEA14 {
	public static int[][] getMatrixSum(int[][] matrix1, int[][] matrix2) {
		int[][] matrixSum = new int[matrix2.length][matrix2.length];
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2.length; j++) {
				matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		return matrixSum;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(
				getMatrixSum(new int[][] { { 5, 91, 12, 0 }, { 3, 6, 33, 47 }, { 2, 91, 64, 4 }, { 23, 1, 0, 55 } },
						new int[][] { { 4, 77, 2, 8 }, { 11, 8, 342, 9 }, { 34, 8, 20, 15 }, { 29, 47, 12, 9 } })));
	}
}
