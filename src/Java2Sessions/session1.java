package Java2Sessions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class session1 {
	public static void main(String[] args) throws IOException {
		readFile();
	}

	private static void readFile() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));
		int suma = 0;
		while (true) {
			String s = br.readLine();

			if (s == null) {
				break;
			}
			String[] sumaNumere = s.split(",");
			for (String element : sumaNumere) {
				suma += Integer.parseInt(element);
			}
		}

		System.out.println(suma);
		br.close();
	}

}
