package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class Calculator {
	

		@RequestMapping("/add/{n1}/{n2}")
		public int addition(@PathVariable("n1") int n1, @PathVariable("n2") int n2) {
			return n1 + n2;
		}

		@RequestMapping("/sub/{n1}/{n2}")
		public int subtraction(@PathVariable("n1") int n1, @PathVariable("n2") int n2) {
			return n1 - n2;
		}

		@RequestMapping("/mul/{n1}/{n2}")
		public int multiplication(@PathVariable("n1") int n1, @PathVariable("n2") int n2) {
			return n1 * n2;
		}

		@RequestMapping("/div/{n1}/{n2}")
		public Double division(@PathVariable("n1") int n1, @PathVariable("n2") int n2) {
			try {
				return (double) (n1 / n2);
			} catch (ArithmeticException e) {
				System.out.println("Divide by zero error");
			} catch (Exception e) {
				System.out.println("e");
			}
			return (Double) null;
		}

		@GetMapping("/sqRoot/{n1}")
		public double squareRoot(@PathVariable("n1") int no1) {
			return (double) Math.sqrt(no1);
		}

	}

