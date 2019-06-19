package com.pack.service;

import java.util.List;

import com.pack.model.AddProduct;

public interface AddProductService {
public int insertProduct(AddProduct ap);
public List<AddProduct> listProduct();
public AddProduct viewProduct(int id);
public int deleteProduct(int id);
}
