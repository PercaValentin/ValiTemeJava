package actions;

import java.util.Date;

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
		Date date = keyboard.("Date:");
double sum = keyboard.("Sum:");
String description = keyboard.getString("Description:");
Category category = keyboard.("Category:");


	
	}

}
