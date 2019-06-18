package com.savnet.utils.demo.app;

import com.savnet.utils.demo.actions.AddSupplierAction;
import com.savnet.utils.demo.actions.RemoveSupplierAction;
import com.savnet.utils.demo.actions.ViewSuppliersAction;
import com.savnet.utils.menus.BackMenu;
import com.savnet.utils.menus.Menu;
import com.savnet.utils.menus.MenuItem;

public class Application {
	public static void main(String[] args) {
		Application app = new Application();
		ApplicationSession.getInstance().init();
		app.run();
	}

	private void run() {
		Menu mainMenu = new Menu("", "");

		Menu furnizori = new Menu("3", "Suppliers");
		MenuItem addFurnizori = new AddSupplierAction("1", "Add");
		MenuItem removeFurnizori = new RemoveSupplierAction("2", "Remove");
		MenuItem viewFurnizori = new ViewSuppliersAction("3", "View");
		BackMenu back = new BackMenu("0", "Back");
		furnizori.addMenuItem(addFurnizori);
		furnizori.addMenuItem(removeFurnizori);
		furnizori.addMenuItem(viewFurnizori);
		furnizori.addMenuItem(back);
		furnizori.setBackAction(back);

		mainMenu.addMenuItem(furnizori);
		mainMenu.addMenuItem(back);
		mainMenu.setBackAction(back);

		mainMenu.doAction();

	}
}
