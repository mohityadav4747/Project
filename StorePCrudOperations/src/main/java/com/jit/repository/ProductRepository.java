//package com.jit.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;
//
//import com.jit.model.Product;
//@Repository("repository")
//public interface ProductRepository extends CrudRepository<Product, Integer>{
//	@Query(value="{call getAllProductData()}",nativeQuery = true)
//	public List<Product> findAll();
//
//}
