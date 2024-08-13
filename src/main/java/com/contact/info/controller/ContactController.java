package com.contact.info.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@GetMapping("/")
	public Object getContactInfo() {
		Map<String,String> cont = new HashMap<>();
		cont.put("name", "Deepa Datta");
		cont.put("email", "deepa9220@gmail.com");
		System.out.println("Whats happening.....?");
		return cont;
	}

}
