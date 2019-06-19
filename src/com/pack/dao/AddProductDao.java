package com.pack.dao;

import java.util.List;

import com.pack.model.AddProduct;

public interface AddProductDao {
public int insertProduct(AddProduct ap);
public List<AddProduct> listProduct();
public AddProduct viewProduct(int id);
public int deleteProduct(int id);
}
