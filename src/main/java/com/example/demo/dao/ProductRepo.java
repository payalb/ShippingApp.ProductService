package com.example.demo.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.Product;

@Transactional
//@RepositoryRestResource(path="/v1/products")
public interface ProductRepo extends MongoRepository<Product, String>{
	
	/*http://localhost:9000/products/search/findProductsByCategoriesId?id=1&page=1&size=1&sort=price",
*//*	@Query(value="{'categories._id': ?0}")*/
	public List<Product> findProductsByCategoriesId(int id, Pageable p);
	//public List<Product> findAllProducts();
}
