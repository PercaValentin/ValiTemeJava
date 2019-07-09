package actionsExpenses;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import appExpenses.ApplicationSession;
import appExpenses.Keyboard;
import menuExpenses.MenuItem;
import modelExpenses2.Database;

public class AddExpenseAction extends MenuItem {

	public AddExpenseAction(String key, String option) {
		super(key, option);

	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		Database db = ApplicationSession.getInstance().getDatabase();
		LocalDate date = LocalDate.parse(keyboard.getString("Date:"), formatter);
		double sum = Double.parseDouble(keyboard.getString("Sum:"));
		String description = keyboard.getString("Description:");
		String categoryName = keyboard.getString("Category:");
		// Category category = db.getCategoryByItem(categoryName);
	}
	// db.addExpense(date, sum, description, category);
}
