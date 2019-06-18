package com.savnet.utils.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.savnet.utils.demo.app.ApplicationSession;

public class FileDatabase implements Database, Serializable {
	private static final long serialVersionUID = 1L;

	private List<Supplier> suppliers = new ArrayList<>();

	@Override
	public void addSupplier(Supplier supplier) {
		suppliers.add(supplier);
		System.out.println(supplier);
		ApplicationSession.getInstance().getSerializer().save(this);
	}

	@Override
	public List<Supplier> getSuppliers() {
		return suppliers;
	}

	@Override
	public void removeSupplierByName(String name) {
		Iterator<Supplier> iterator = suppliers.iterator();

		while (iterator.hasNext()) {
			Supplier s = iterator.next();
			if (s.getName().equals(name)) {
				iterator.remove();
			}
		}

		ApplicationSession.getInstance().getSerializer().save(this);
	}

}
