package com.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.test.dto.Product;
import com.test.service.IProductService;

@WebService
public class ProductService implements IProductService {

	public List<Product> findAll() {
      List<Product> productList = new ArrayList<Product>(0);
      productList.add(new Product(101l, "product1", 101l));
      productList.add(new Product(102l, "product2", 102l));
      productList.add(new Product(102l, "product3", 104l));
	  return productList;
	}

	public Product find(Long productId) {
		return new Product(productId, "product3", 104l);
	}

}
