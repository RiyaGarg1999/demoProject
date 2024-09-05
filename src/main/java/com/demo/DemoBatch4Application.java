package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoBatch4Application {
	@GetMapping("/msg")
	public String getMessage() {
		return "hello world!";
	}
	
	@GetMapping("/msg1")
	public String getMessage1() {
		return "welcome to amdocs";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(DemoBatch4Application.class, args);
		
	}

}
