package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	
	@RequestMapping("welcome")
	public String show() {
		return "index.jsp";	
	}
	@RequestMapping("url")
	public String run() {
		
		return "hello.jsp";
		
		
	}
}
