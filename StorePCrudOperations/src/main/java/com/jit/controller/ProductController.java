package com.jit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jit.dao.ProductDao;
import com.jit.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductDao dao;
@RequestMapping("/get")
public List<Product> get(){
return dao.getAllProduct();
  }
@RequestMapping("/getAllCustomerProductData")
public List<Product> getAll(){
	return dao.getAllCustomerDetailsProduct();
}
@RequestMapping("/getProductCustomerById")
public List<Product> getAllProductCustById(){
	return dao.getAllProductDetailsById();
}
}