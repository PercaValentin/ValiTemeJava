package temaLineCounter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountLinesGood {
	private static int folderCount = 0;
	private static int fileCount = 0;
	private static int rowCount = 0;
	private static int accessSpecifiersCount = 0;

	public static void main(String[] args) throws IOException {
		search(new File("."));
		System.out.println(folderCount + " Folders");
		System.out.println(fileCount + " Files");
		System.out.println(rowCount + " Rows");
		System.out.println("AccessSpecifires: " + accessSpecifiersCount);

	}

	private static void search(File folder) throws IOException {
		File[] files = folder.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				folderCount++;
				search(file);

			}
			String name = file.getName();
			if (file.isFile() && name.substring(name.length() - 4).equals("java")) {
				fileCount++;
				readFile(file);
			}
		}
	}

	private static void readFile(File file) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		while (true) {
			String s = br.readLine();
			if (s == null) {
				break;
			}
			if (s.contains("//")) {
				rowCount--;
			}
			if (s.trim().isEmpty()) {
				rowCount--;

			}
			if (s.contains("public") || s.contains("private") || s.contains("protected")) {
				accessSpecifiersCount++;
			}
			rowCount++;
		}
		br.close();
	}
}
