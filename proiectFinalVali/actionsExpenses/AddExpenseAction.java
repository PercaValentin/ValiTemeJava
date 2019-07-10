package actionsExpenses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		Database db = ApplicationSession.getInstance().getDatabase();
		// Date date = SimpleDateFormat.parse(keyboard.getString("Date:"));
		String pattern = "dd.mm.yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		Date date = null;
		try {
			date = simpleDateFormat.parse(keyboard.getString("Date: "));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		double sum = Double.parseDouble(keyboard.getString("Sum:"));
		String description = keyboard.getString("Description:");
		String categoryName = keyboard.getString("Category:");
		modelExpenses2.Category category = db.getCategoryByName(categoryName);
		db.addExpenses(date, sum, description, category);
	}

}
