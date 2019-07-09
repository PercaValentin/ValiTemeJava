package actionsExpenses;

import appExpenses.ApplicationSession;
import appExpenses.Keyboard;
import menuExpenses.MenuItem;
import modelExpenses2.Category;
import modelExpenses2.Database;

public class AddCategoryAction extends MenuItem {

	public AddCategoryAction(String key, String option) {
		super(key, option);

	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		Database db = ApplicationSession.getInstance().getDatabase();
		String name = keyboard.getString("Category: ");
		Category category = new Category(name);
		// db.addCategory(category);
	}

}
