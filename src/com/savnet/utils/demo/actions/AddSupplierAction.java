package com.savnet.utils.demo.actions;

import com.savnet.utils.demo.app.ApplicationSession;
import com.savnet.utils.demo.app.Keyboard;
import com.savnet.utils.demo.model.Database;
import com.savnet.utils.demo.model.Supplier;
import com.savnet.utils.menus.MenuItem;

public class AddSupplierAction extends MenuItem {

	public AddSupplierAction(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		Database db = ApplicationSession.getInstance().getDatabase();

		String name = keyboard.getString("Name: ");
		String city = keyboard.getString("City: ");

		Supplier supplier = new Supplier(name, city);
		db.addSupplier(supplier);
	}

}
