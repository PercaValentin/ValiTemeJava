package actions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import app.ApplicationSession;
import app.Keyboard;
import menu.MenuItem;
import modelExpenses.Category;
import modelExpenses.Database;

public class AddExpenseAction extends MenuItem {

	public AddExpenseAction(String option, String key) {
		super(option, key);

	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		Database db = ApplicationSession.getInstance().getDatabase();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate date = LocalDate.parse(keyboard.getString("Date:"), formatter);
		double sum = Double.parseDouble(keyboard.getString("Sum:"));
		String description = keyboard.getString("Description:");
		String categoryName = keyboard.getString("Category:");
		Category category = db.getCategoryByName(categoryName);

		db.addExpense(date, sum, description, category);
	}

}
