package com.kevingardner.productsandcategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kevingardner.productsandcategories.models.Category;
import com.kevingardner.productsandcategories.models.Product;
import com.kevingardner.productsandcategories.services.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService hService;
	
	@GetMapping("/products/new")
	public String newProd() {
		return "newProduct.jsp";
	}
	@GetMapping("/categories/new")
	public String newCat() {
		return "newCategory.jsp";
	}
	@PostMapping("/newCat")
	public String makeCat(@RequestParam("cat")String category) {
		Category newCat = new Category();
		newCat.setName(category);
		this.hService.createCategory(newCat);
		return "redirect:/categories/new";		
	}
	@PostMapping("/newProd")
	public String makeProd(@RequestParam("name")String name,@RequestParam("description")String description,@RequestParam("price")double price ){
		Product newProd = new Product(name, description, price);
		this.hService.createProduct(newProd);
		return "redirect:/products/new";		
	}

	@GetMapping("/{id}")
	public String showProd(Model viewModel, @PathVariable("id")Long id) {
		Product productToShow = this.hService.getSingleProd(id);
		viewModel.addAttribute("notInProd", this.hService.findCatNotProd(productToShow));
		return "showProduct.jsp";
	}
	@GetMapping("/cat/{id}")
	public String showCat(Model viewModel, @PathVariable("id")Long id) {
		Category catToShow = this.hService.getSingleCat(id);
		viewModel.addAttribute("notInCat", this.hService.findProdNotCat(catToShow));
		viewModel.addAttribute("category",catToShow);
		return "showCategory.jsp";
	}
	@PostMapping("/addCatToProd/{id}")
	public String addCatToProd(@RequestParam("id")Long id,@PathVariable("id")Long productId) {
		Product productToAddCatTo = this.hService.getSingleProd(productId);
		Category categoryToAddProdTo = this.hService.getSingleCat(id);
		this.hService.addCategoryToProducts(productToAddCatTo, categoryToAddProdTo);
		return "redirect:/{id}";		
		
	}
	
	@PostMapping("/addProdToCat/{id}")
	public String addProdToCat(@RequestParam("prod")Long id,@PathVariable("id")Long categoryId){
		Product productToAddCatTo = this.hService.getSingleProd(categoryId);
		Category categoryToAddProdTo = this.hService.getSingleCat(id);
		this.hService.addProductsToCategory(productToAddCatTo, categoryToAddProdTo);
		return "redirect:/{id}";		
}
