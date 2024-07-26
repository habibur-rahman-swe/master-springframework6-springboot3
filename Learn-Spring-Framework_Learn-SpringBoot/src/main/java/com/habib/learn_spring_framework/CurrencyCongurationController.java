package com.habib.learn_spring_framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyCongurationController {
	
	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;
	
	@GetMapping("/currency-configuration")
	public CurrencyServiceConfiguration retriveAllCourses() {
		return currencyServiceConfiguration;
	}
}
