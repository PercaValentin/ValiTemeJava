package temaLineCounterv02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileHandler {

	private File file;
	private int lineCounter;
	private int emptyLineCounter;

	public FileHandler(File file) {

		this.file = file;
	}

	public void analyse() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				lineCounter++;

				if (line.trim().length() == 0) {

					emptyLineCounter++;
				}

			}
			br.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public int getLineCounter() {
		return lineCounter;

	}

	public int emptyLineCounter() {
		return emptyLineCounter;

	}
}
