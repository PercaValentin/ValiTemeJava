package aplicatiiTR;

import java.util.Scanner;

public class TR3 {

	public TR3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("Numarul la patrat este : " + (int) Math.pow(n, 2));
		System.out.println("Numarul la cub este : " + (int) Math.pow(n, 3));

		scanner.close();

	}

}
