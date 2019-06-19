package actions;

import app.ApplicationSession;
import menu.MenuItem;
import modelExpenses.Database;
public class ViewExpensesAction extends MenuItem {

	public ViewExpensesAction(String option, String key) {
		super(option, key);

	}

	@Override
	public void doAction() {
		System.out.println(ApplicationSession.getInstance().getDatabase().getExpenses().toString());
	}

}
