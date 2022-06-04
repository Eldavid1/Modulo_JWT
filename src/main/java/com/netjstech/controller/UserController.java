package com.netjstech.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/user")
public class UserController {
	@GetMapping("/allusers")
	public String displayUsers() {
		return "Display All Users";
	}
	@GetMapping("/oneusers")
	public String displayUsers() {
		return "Display one user";
	}
	@GetMapping("/deleteusers")
	public String displayUsers() {
		return "Display delete Users";
	}
	
}
