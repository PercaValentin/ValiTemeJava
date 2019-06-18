package com.savnet.utils.demo.model;

import java.util.List;

public interface Database {

	void addSupplier(Supplier supplier);

	List<Supplier> getSuppliers();

	void removeSupplierByName(String name);

}
