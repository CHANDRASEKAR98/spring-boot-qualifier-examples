package com.example.tutorial.ep.protohub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorial.ep.protohub.component.PaymentApp;

@RestController
public class ComponentController {
	
	/* Qualifier takes the default Bean name which is created in camel case format */
	/* We can also add our custom bean name and specify it in the Qualifier */
	
	@Autowired
	@Qualifier(value = "myPayPal")
	public PaymentApp paypalPayment;
	
	@Autowired
	@Qualifier(value = "myGooglePay")
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
