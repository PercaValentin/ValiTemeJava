package appExpenses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import modelExpenses2.Database;

public class Serializer {

	private static final String DATABASE_FILE = "expenses.ser";

	public Database load() {
		Database result = null;

		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(DATABASE_FILE));

			result = (Database) ois.readObject();

			ois.close();
		} catch (FileNotFoundException e) {
			System.out.println("Database file not found. Continue...");
		} catch (IOException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}

		return result;

	}

	public void save(Database db) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DATABASE_FILE));

			oos.writeObject(db);
			oos.close();

		} catch (FileNotFoundException e) {

			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error while saving file");
			e.printStackTrace();
		}

	}

}
