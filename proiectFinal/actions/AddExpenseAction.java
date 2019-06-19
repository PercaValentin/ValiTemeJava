package actions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.savnet.utils.demo.app.ApplicationSession;
import com.savnet.utils.demo.app.Keyboard;
import com.savnet.utils.demo.model.Database;

import menu.MenuItem;
import modelExpenses.Category;

public class AddExpenseAction extends MenuItem {

	public AddExpenseAction(String option, String key) {
		super(option, key);

	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		Database db = ApplicationSession.getInstance().getDatabase();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM, dd, yyyy");
		LocalDate date = LocalDate.parse(keyboard.getString("Date:"), formatter);

		double sum = Double.parseDouble(keyboard.getString("Sum:"));
		String description = keyboard.getString("Description:");

		Category category = new Category(keyboard.getString("Category:"));

	}

}
