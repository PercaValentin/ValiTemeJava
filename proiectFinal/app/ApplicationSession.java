package app;

import modelExpenses.Database;
import modelExpenses.FileDatabase;

public class ApplicationSession {
	private Keyboard keyboard = new Keyboard();
	private Database database = new FileDatabase();
	private Serializer serializer = new Serializer();
	private static ApplicationSession instance = new ApplicationSession();

	public static ApplicationSession getInstance() {
		return instance;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public Database getDatabase() {
		return database;
	}

	public Serializer getSerializer() {
		return serializer;

	}

	public void init() {
try {
	Database database = serializer.load();
}
	}
}
