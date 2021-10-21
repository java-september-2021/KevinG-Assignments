package com.kevingardner.dojoandninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class Home {
	@Controller
	public class HomeController {
		@RequestMapping("/")
		public String Index() {
			return "redirect:/dojos/new";

}
}
}
