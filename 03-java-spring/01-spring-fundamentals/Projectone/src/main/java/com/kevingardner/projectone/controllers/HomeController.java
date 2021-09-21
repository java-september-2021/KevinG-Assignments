package com.kevingardner.projectone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/telljoke", method=RequestMethod.POST)
	public String joke(@RequestParam("name") String name, @RequestParam("joke") String joke, Model viewModel) {
	    viewModel.addAttribute("name", name);
	    viewModel.addAttribute("joke", joke);
		return "joke.jsp";

}
}
