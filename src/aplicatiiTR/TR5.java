package aplicatiiTR;

import java.util.Scanner;

public class TR5 {

	public TR5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Introduceti suma in RON :");
		int suma = scanner.nextInt();
		System.out.print("Introduceti cursul valutar :");
		double curs = scanner.nextDouble();
		double sumaInEuro = suma / curs;
		int sumaIntreaga = (int)sumaInEuro;
		
		double rest = sumaInEuro - sumaIntreaga;
		int restInRon = (int)(rest * curs);
		
		
		System.out.println("Suma in EuRO : " + sumaIntreaga);
		System.out.println("Suma in RON : " + restInRon);
		
		
		
		scanner.close();

	}

}
