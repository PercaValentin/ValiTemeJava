package aplicatiiTR;

import java.util.Scanner;

public class TR4 {

	public TR4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduceti suma in EUR : ");
		int suma = scanner.nextInt();
		System.out.println("Intoduceti cursul valutar : ");
		double val = scanner.nextDouble(); 
		System.out.println("Suma in RON: " + suma * val);
scanner.close();
	}

}
