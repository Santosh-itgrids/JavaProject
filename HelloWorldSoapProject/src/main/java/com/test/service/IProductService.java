package com.test.service;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.test.dto.Product;

@WebService 
public interface IProductService {

	@WebMethod List<Product> findAll();
	@WebMethod Product find(Long productId);
	
}
