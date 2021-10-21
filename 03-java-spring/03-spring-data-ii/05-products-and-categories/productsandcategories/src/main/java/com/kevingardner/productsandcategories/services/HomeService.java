package com.kevingardner.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevingardner.productsandcategories.models.Category;
import com.kevingardner.productsandcategories.models.Product;
import com.kevingardner.productsandcategories.repositories.CategoryRepository;
import com.kevingardner.productsandcategories.repositories.ProductRepository;

@Service
public class HomeService {
	@Autowired
	private CategoryRepository cRepo;
	@Autowired
	private ProductRepository pRepo;
	
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	public Category getSingleCat(Long id){
		return this.cRepo.findById(id).orElse(null);
	}
	public Product getSingleProd(Long id){
		return this.pRepo.findById(id).orElse(null);
}
	public List<Category> findCatNotProd(Product product) {
		return this.cRepo.findByProductNotContains(product);
	}
		public List<Product> findProdNotCat(Category category) {
			return this.pRepo.findByCategoryNotContains(category);
		}
	public void addCategoryToProducts(Product product, Category category) {
		List<Category> existingCats = product.getCategories();
		existingCats.add(category);
		this.pRepo.save(product);
	}
		
		public void addProductsToCategory(Product product, Category category) {
			List<Product> existingProds = category.getProducts();
			existingProds.add(product);
			this.pRepo.save(product);
	}
	  
	}
	