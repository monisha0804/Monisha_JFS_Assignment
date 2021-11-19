package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterest {
	
	@RequestMapping("/")
	public String show() {
		
		return "simpleint.jsp";
	}

	@RequestMapping("/calculate")
		public ModelAndView calculateInt(HttpServletRequest request) {
		 
			double P=Double.parseDouble(request.getParameter("amount"));
			double T=Double.parseDouble(request.getParameter("year"));
			double I=Double.parseDouble(request.getParameter("interest"));
			double SI=((P*T*I)/100);
			ModelAndView mv=new ModelAndView("result.jsp");
			mv.addObject("result",SI);
			return mv;			
	}
}
