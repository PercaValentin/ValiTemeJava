package aplicatiiEA;

import java.util.Arrays;

public class TestEA15 {
	public static int[][] getMatrixProduct(int[][] matrix1, int[][] matrix2) {
		int[][] sumMatrix = new int[matrix1.length][matrix1.length];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				for (int k = 0; k < matrix2.length; k++) {
					sumMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return sumMatrix;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(getMatrixProduct(new int[][] { { 0, 2, 1 }, { 3, 1, 2 } },
				new int[][] { { 2, 0 }, { 1, 4 }, { 2, 2 } })));
	}
}
