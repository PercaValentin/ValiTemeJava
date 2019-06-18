package com.savnet.utils.demo.actions;

import com.savnet.utils.demo.app.ApplicationSession;
import com.savnet.utils.demo.app.Keyboard;
import com.savnet.utils.demo.model.Database;
import com.savnet.utils.menus.MenuItem;

public class RemoveSupplierAction extends MenuItem {

	public RemoveSupplierAction(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		Keyboard keyboard = ApplicationSession.getInstance().getKeyboard();
		Database db = ApplicationSession.getInstance().getDatabase();

		String name = keyboard.getString("Name: ");

		db.removeSupplierByName(name);
	}

}
