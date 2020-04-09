package com.example.hystrix.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hystrix.HystrixApplication;

@RestController
@RequestMapping("/api/v1")
public class ApiImpl {
	
	@Value("${spring.application.name")
	private  String testValue;
	
	@Autowired
	private HystrixApplication hystrix;
	
	@GetMapping("/returnProperty")
	public String returnpropValue() {
		return "hystrix-dashboard";
		
	}

}
