package com.jit.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jit.model.Product;

@Repository
public class ProductDao {
	@Autowired
	private EntityManager ea;
	@SuppressWarnings("unchecked")
	public List<Product> getAllProduct(){
		return ea.createNamedStoredProcedureQuery("firstProcedure").getResultList();
		
	}

	@SuppressWarnings("unchecked")
	public List<Product> getAllCustomerDetailsProduct(){
		return ea.createNamedStoredProcedureQuery("secondProcedure")
				//.setParameter("pdate", ea)
				.getResultList();
	}
	@SuppressWarnings("unchecked")
	public List<Product> getAllProductDetailsById(){
		return ea.createNamedStoredProcedureQuery("thirdProcedure").getResultList();
		
	}
}
