package com.example.tutorial.ep.protohub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorial.ep.protohub.component.PaymentApp;

@RestController
public class ComponentController {
	
	@Autowired
	@Qualifier(value = "payPal")
	public PaymentApp paypalPayment;
	
	@Autowired
	@Qualifier(value = "googlepay")
	public PaymentApp googlepayPayment;
	
	@GetMapping(value = "/get-paypal-info")
	public String getPaypalInfo() {
		return paypalPayment.getAPIInfo();
	}
	
	@GetMapping(value = "/get-googlepay-info")
	public String getGooglePayInfo() {
		return googlepayPayment.getAPIInfo();
	}

}
