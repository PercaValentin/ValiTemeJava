package appExpenses;

import actionsExpenses.AddCategoryAction;
import actionsExpenses.AddExpenseAction;
import actionsExpenses.RemoveExpensesAction;
import actionsExpenses.ViewExpensesAction;
import menuExpenses.BackMenu;
import menuExpenses.Menu;
import menuExpenses.MenuItem;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		ApplicationSession.getInstance().init();
		app.run();
	}

	private void run() {
		Menu mainMenu = new Menu("", "");
		Menu categories = new Menu("1", "Categories");
		MenuItem addCategory = new AddCategoryAction("1", "Add");
		Menu expenses = new Menu("2", "Expenses");
		MenuItem addExpenses = new AddExpenseAction("1", "Add");
		MenuItem removeExpenses = new RemoveExpensesAction("2", "Remove");
		MenuItem viewExpenses = new ViewExpensesAction("3", "View");
		BackMenu back = new BackMenu("0", "Back");
//		categories.addMenuItem(addCategory);
//
//		expenses.addMenuItem(addExpenses);
//		expenses.addMenuItem(removeExpenses);
//		expenses.addMenuItem(viewExpenses);
//		expenses.addMenuItem(back);
//		expenses.setBackAction(back);
//
//		mainMenu.addMenuItem(expenses);
//		mainMenu.addMenuItem(back);
//		mainMenu.setBackAction(back);

		mainMenu.doAction();

	}
}
