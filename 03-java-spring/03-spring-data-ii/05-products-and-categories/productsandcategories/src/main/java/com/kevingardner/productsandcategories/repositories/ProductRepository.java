package com.kevingardner.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kevingardner.productsandcategories.models.Category;
import com.kevingardner.productsandcategories.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findAll();
	List<Product> findByCategoryNotContains(Category category);
}
