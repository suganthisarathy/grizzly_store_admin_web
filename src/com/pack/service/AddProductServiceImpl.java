package com.pack.service;

import java.util.List;

import com.pack.dao.AddProductDaoImpl;
import com.pack.model.AddProduct;

public class AddProductServiceImpl implements AddProductService {

	public AddProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insertProduct(AddProduct ap) {
		// TODO Auto-generated method stub
		int i=new AddProductDaoImpl().insertProduct(ap);
		return i;
	}

	@Override
	public List<AddProduct> listProduct() {
		// TODO Auto-generated method stub
		List<AddProduct> l=new AddProductDaoImpl().listProduct();
		return l;
	}

	@Override
	public AddProduct viewProduct(int id) {
		// TODO Auto-generated method stub
		return new AddProductDaoImpl().viewProduct(id);
		
	}

	@Override
	public int deleteProduct(int id) {
		// TODO Auto-generated method stub
		return new AddProductDaoImpl().deleteProduct(id);
	}

}
