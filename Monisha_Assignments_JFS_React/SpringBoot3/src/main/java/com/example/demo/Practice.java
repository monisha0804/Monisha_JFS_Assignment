package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Practice {
			
		@GetMapping("/authenticate/{username}/{password}")
		public String getMessage(@PathVariable("username") String username, @PathVariable("password") String password) {
			String User = "monisha@mail.com";
			String Pass = "Moni0804@";
			
			if(username.equals(User) && password.equals(Pass)) {
				return "Valid User";
			} else {
				return "Invalid User";
			}
		}
	}

