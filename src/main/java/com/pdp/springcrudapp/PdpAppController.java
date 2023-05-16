package com.pdp.springcrudapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PdpAppController {

	@RequestMapping("/policyType")
	public String getPolicyType() {
		return "Car";
	}
	
}
