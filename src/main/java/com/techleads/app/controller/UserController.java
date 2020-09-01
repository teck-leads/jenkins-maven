package com.techleads.app.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	public String homepage() {
		return "welcome to Home page";
	}

}
