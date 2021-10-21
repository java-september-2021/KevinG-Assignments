package com.kevingardner.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kevingardner.productsandcategories.models.Category;
import com.kevingardner.productsandcategories.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
	List<Category> findAll();
	List<Category> findByProductNotContains(Product product);
	List<Product> findByProductNotContains(Category category);
}
