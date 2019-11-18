package com.ascorp.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ascorp.microservices.limitsservice.bean.LimitConfiguation;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;

	@GetMapping("/limits")
	public LimitConfiguation retriveLimitsFromConfiguration() {
		/*
		 * LimitConfiguation limitConfiguation = new LimitConfiguation();
		 * limitConfiguation.setMaximum(10010); limitConfiguation.setMinimum(100);
		 * return limitConfiguation;
		 */
		return new LimitConfiguation(configuration.getMaximum(), configuration.getMinimum());

	}
}
