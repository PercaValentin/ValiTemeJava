package actionsExpenses;

import appExpenses.ApplicationSession;
import menuExpenses.MenuItem;

public class ViewExpensesAction extends MenuItem {

	public ViewExpensesAction(String key, String option) {
		super(key, option);

	}

	@Override
	public void doAction() {
		System.out.println(ApplicationSession.getInstance().getDatabase().getExpenses().toString());

	}

}
