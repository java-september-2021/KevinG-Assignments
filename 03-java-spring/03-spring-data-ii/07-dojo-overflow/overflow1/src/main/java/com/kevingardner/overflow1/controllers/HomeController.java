package com.kevingardner.overflow1.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kevingardner.overflow1.models.Question;
import com.kevingardner.overflow1.services.OverflowService;
import com.kevingardner.overflow1.validators.TagValidator;

@Controller
public class HomeController { 
	@Autowired
	private OverflowService oService;
	
	@GetMapping("/")
	public String index(Model viewModel) {
		return "dashboard.jsp";	
	}
	@Autowired
	private TagValidator validate;
	
	@GetMapping("/new")
	public String newQuest(@ModelAttribute("question")Question question,Model viewModel) {
		return "new	.jsp";		
}
	@PostMapping("/newQuestion")
	public String addQuest(@Valid @ModelAttribute("question")Question question, BindingResult result) {
		validator.validate(question, result);
		if(result.hasErrors()) {
			return "new.jsp";
		}
		this.oService.createQuestion(question);
		return "redirect:/";
	}
}
