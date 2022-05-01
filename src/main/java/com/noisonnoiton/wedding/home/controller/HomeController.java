package com.noisonnoiton.wedding.home.controller;


import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	public HomeController() {
	}

	@GetMapping({ "", "/", "/index", "main" })
	public String index(ServerHttpRequest request, Model model) {

		return "index";
	}

	@GetMapping("/about")
	public String about(ServerHttpRequest request, Model model) {

		return "about";
	}

	@GetMapping("/services")
	public String services(ServerHttpRequest request, Model model) {

		return "services";
	}

	@GetMapping("/gallery")
	public String gallery(ServerHttpRequest request, Model model) {

		return "gallery";
	}

	@GetMapping("/contact")
	public String contact(ServerHttpRequest request, Model model) {

		return "contact";
	}
	
}
