package appExpenses;

import java.util.Scanner;

public class Keyboard {

	Scanner scanner = new Scanner(System.in);

	public String getString(String message) {
		System.out.println(message);
		String s = scanner.nextLine();
		return s;

	}
}
