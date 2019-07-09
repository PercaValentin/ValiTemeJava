package appExpenses;

import menuExpenses.BackMenu;
import menuExpenses.Menu;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		ApplicationSession.getInstance().init();
		app.run();
	}

	private void run() {
		Menu mainMenu = new Menu("", "");

		Menu expenses = new Menu("1", "Expenses");
		// MenuItem addExpenses = new AddExpenseAction("1", "Add");
		// MenuItem removeExpenses = new RemoveExpensesAction("2", "Remove");
		// MenuItem viewExpenses = new ViewExpensesAction("3", "View");
		BackMenu back = new BackMenu("0", "Back");
		expenses.addMenuItem(addExpenses);
		expenses.addMenuItem(removeExpenses);
		expenses.addMenuItem(viewExpenses);
		expenses.addMenuItem(back);
		expenses.setBackAction(back);
		// Menu categories = new Menu("2", "Categories");
		// MenuItem addCategories = new

		mainMenu.addMenuItem(expenses);
		mainMenu.addMenuItem(back);
		mainMenu.setBackAction(back);

		mainMenu.doAction();

	}
}
