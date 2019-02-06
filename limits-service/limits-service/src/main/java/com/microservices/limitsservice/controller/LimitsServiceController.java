package com.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsservice.Configuration;
import com.microservices.limitsservice.model.LimitsConfiguration;

@RestController
public class LimitsServiceController {
	
	@Autowired
	Configuration config;
	
	@GetMapping("/limits")
	public LimitsConfiguration getLimitsConfiguration() {
		return new LimitsConfiguration(config.getMinimum(),config.getMaximum());
	}

}
