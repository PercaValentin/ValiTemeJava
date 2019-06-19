package actions;

import menu.MenuItem;

public class ViewExepensesAction extends MenuItem {

	public ViewExepensesAction(String option, String key) {
		super(option, key);

	}

	@Override
	public void doAction() {
		System.out.println(ApplicationSession.getInstance().getDatabase().getExpenses().toString());
	}

}
