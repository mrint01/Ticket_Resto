package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping
	public String msg() {
		return ("<center><h1>Welcome To Our SiteWeb</h1></center>");
	}
	
}
