package com.savnet.utils.demo.actions;

import com.savnet.utils.demo.app.ApplicationSession;
import com.savnet.utils.menus.MenuItem;

public class ViewSuppliersAction extends MenuItem {

	public ViewSuppliersAction(String option, String key) {
		super(option, key);
	}

	@Override
	public void doAction() {
		System.out.println(ApplicationSession.getInstance().getDatabase().getSuppliers().toString());
	}

}
