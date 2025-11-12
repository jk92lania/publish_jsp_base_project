
package com.example.publishbase2025.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class PageController {
	
	@GetMapping("/user/main")
	public String userHome() {
		return "/user/pages/main/main_index";
	}
	
	@GetMapping("/user/about")
	public String userAbout() {
		return "/user/pages/about/about_index";
	}
	
}