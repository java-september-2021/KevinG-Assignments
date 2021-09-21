package com.kevingardner.ninjagold.controllers;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoldController {
	
	@GetMapping("/")
	public String gold(Model viewModel, HttpSession session) {
		if(session.getAttribute("totalGold")== null) {
			session.setAttribute("totalGold", 0);
		}
		viewModel.addAttribute("totalGold", session.getAttribute("totalGold"));
		return "gold.jsp";
	}
	@PostMapping("/findGold")
	public String findGold(@RequestParam("building") String building, HttpSession session) {
		Random r = new Random();
		int goldThisTurn;
		if(building.equals("farm")) {
			goldThisTurn = r.nextInt((20-10) + 1) + 10;
		}else if(building.equals("cave")) {
			goldThisTurn = r.nextInt((10-5) + 1) + 5;
		}else if(building.equals("house")) {
			goldThisTurn = r.nextInt((5-2) + 1) + 2;
		}else if(building.equals("casino")) {
			goldThisTurn = r.nextInt((50+50) + 1) -50;
		}else {
			System.out.println("building not recognized");
			return "redirect:/";
		}		
 		int gold = (int)session.getAttribute("totalGold");
		int totalGold = gold += goldThisTurn;
		session.setAttribute("totalGold", totalGold);
		return "redirect:/";
	}
}
