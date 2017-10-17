package com.niit.EcommerceBackEnd.dao;

import java.util.List;


import com.niit.EcommerceBackEnd.model.Supplier;

public interface SuppilerDAO
{
	List<Supplier> getAllSupplier();
	Supplier getSupplierById(int sup_id);
	void saveSupplier(Supplier s);
	public Supplier deleteSupplier(int id);
	void updateSupplier(Supplier s);
}
