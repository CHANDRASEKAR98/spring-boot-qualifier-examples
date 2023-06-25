package com.example.tutorial.ep.protohub.component;

import org.springframework.stereotype.Component;

@Component(value = "paypalPayment")
public class PayPal implements PaymentApp {

	@Override
	public String getAPIInfo() {
		return "Paypal is used for this transaction";
	}

}
